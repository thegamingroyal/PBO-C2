/**
 * File      : Anabul.java
 * Deskripsi : Kelas induk abstrak untuk semua hewan peliharaan
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();

    public abstract void bersuara();
}
