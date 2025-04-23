/**
 * File      : Kucing.java
 * Deskripsi : Kelas turunan dari Anabul, mewakili hewan Kucing
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong~");
    }
}
