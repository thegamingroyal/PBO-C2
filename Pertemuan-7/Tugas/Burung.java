/**
 * File      : Burung.java
 * Deskripsi : Kelas turunan dari Anabul, mewakili hewan Burung
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan cara terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit-cuit!");
    }
}
