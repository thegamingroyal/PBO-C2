/**
 * File      : Kucing.java
 * Deskripsi : Kelas turunan dari Anabul yang merepresentasikan kucing peliharaan
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 01 Mei 2025 
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak melata.");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara: Meong~");
    }
}
