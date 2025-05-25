package service;

import model.Mahasiswa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Service untuk operasi CRUD Mahasiswa ke database MySQL.
 */
public class MysqlMahasiswaService {
    private final String URL = "jdbc:mysql://localhost:3306/mahasiswa";
    private final String USER = "root";
    private final String PASS = "";

    private Connection conn;

    /** Membuka koneksi ke database */
    public MysqlMahasiswaService() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Membuat objek Mahasiswa dari ResultSet.
     */
    private Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        return new Mahasiswa(
            rs.getString("nim"),
            rs.getString("nama"),
            rs.getString("jurusan"),
            rs.getString("alamat")
        );
    }

    /**
     * Menambahkan data mahasiswa ke database.
     */
    public boolean add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (nim, nama, jurusan, alamat) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, mhs.getNim());
            stmt.setString(2, mhs.getNama());
            stmt.setString(3, mhs.getJurusan());
            stmt.setString(4, mhs.getAlamat());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Update data mahasiswa berdasarkan NIM.
     */
    public boolean update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama=?, jurusan=?, alamat=? WHERE nim=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, mhs.getNama());
            stmt.setString(2, mhs.getJurusan());
            stmt.setString(3, mhs.getAlamat());
            stmt.setString(4, mhs.getNim());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Menghapus data mahasiswa berdasarkan NIM.
     */
    public boolean delete(String nim) {
        String sql = "DELETE FROM mahasiswa WHERE nim=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nim);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Mengambil data mahasiswa berdasarkan NIM.
     */
    public Mahasiswa getById(String nim) {
        String sql = "SELECT * FROM mahasiswa WHERE nim=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nim);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return makeMhsObject(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Mengambil semua data mahasiswa.
     */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(makeMhsObject(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * Reset tabel mahasiswa (hapus semua data).
     */
    public void indexReset() {
        String sql = "TRUNCATE TABLE mahasiswa";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cek apakah tabel mahasiswa kosong.
     */
    public boolean isEmpty() {
        String sql = "SELECT COUNT(*) FROM mahasiswa";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    /** Menutup koneksi ke database */
    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed())
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}