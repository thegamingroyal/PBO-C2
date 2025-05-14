import java.io.*;

/**
 * File      : ReadSerializedPerson.java
 * Deskripsi : Program untuk membaca objek Person dari file
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Mei 2025
 */

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;

        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();

            System.out.println("serialized person name = " + person.getName());
        } catch(Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
