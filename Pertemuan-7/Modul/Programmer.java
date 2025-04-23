/**
 * File      : Programmer.java
 * Deskripsi : Kelas turunan dari Pegawai yang mewakili seorang programmer
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
