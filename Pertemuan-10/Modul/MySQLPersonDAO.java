import java.sql.*;

/**
 * File      : MySQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Mei 2025
 */

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Buat koneksi database
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1:3307/pbo_persistent_object", "root", ""
        );

        // Eksekusi query
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // Tutup koneksi
        con.close();
    }
}
