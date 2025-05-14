import java.io.*;

/**
 * File      : SerializePerson.java
 * Deskripsi : Program untuk menyimpan objek Person ke file
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Mei 2025
 */

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");

        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
