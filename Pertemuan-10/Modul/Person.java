import java.io.Serializable;

/**
 * File      : Person.java
 * Deskripsi : Model entitas person, digunakan untuk database & serialisasi
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Mei 2025
 */

public class Person implements Serializable {
    private int id;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
