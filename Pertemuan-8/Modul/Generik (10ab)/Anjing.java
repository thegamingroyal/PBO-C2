/**
 * File      : Anjing.java
 * Deskripsi : Kelas turunan dari Anabul yang merepresentasikan anjing peliharaan
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 01 Mei 2025 
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak melata.");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara: Guk-guk!");
    }
}
