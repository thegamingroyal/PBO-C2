package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    // Membuka koneksi ke database
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/mahasiswa";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil!");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }

    // Menutup koneksi ke database
    public static void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                koneksi = null;
                System.out.println("Koneksi ditutup.");
            } catch (SQLException e) {
                System.out.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }

    // Mengecek status koneksi
    public static boolean isConnected() {
        try {
            return koneksi != null && !koneksi.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }
}
