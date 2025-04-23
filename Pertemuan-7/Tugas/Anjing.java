/**
 * File      : Anjing.java
 * Deskripsi : Kelas turunan dari Anabul, mewakili hewan Anjing
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk-guk!");
    }
}
