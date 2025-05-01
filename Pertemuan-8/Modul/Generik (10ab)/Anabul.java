/**
 * File      : Anabul.java
 * Deskripsi : Kelas abstrak untuk hewan peliharaan
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 01 Mei 2025 
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}
