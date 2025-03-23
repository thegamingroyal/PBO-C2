/**
 * File      : Petani.java
 * Deskripsi : Subclass dari Manusia, merepresentasikan seorang petani
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
    private final int C = 1; // Sesuai dengan digit ke-12 dari NIM

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + C;
    }

    @Override
    public double hitungPajak() {
        return 0; // Petani tidak dikenakan pajak
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
