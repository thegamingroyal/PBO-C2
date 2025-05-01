/**
 * File      : Burung.java
 * Deskripsi : Kelas turunan dari Anabul yang merepresentasikan burung peliharaan
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 01 Mei 2025 
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak terbang.");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit-cuit!");
    }
}
