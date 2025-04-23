/**
 * File      : MainStatus.java
 * Deskripsi : Program utama untuk menguji runtime polymorphism melalui method status()
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

public class MainStatus {
    public static void main(String[] args) {
        Person p = new Student("Sally");
        p.status(1);
    }
}
