/**
 * File      : PNS.java
 * Deskripsi : Subclass dari Manusia, merepresentasikan seorang PNS
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;
    private final int A = 4; // Sesuai dengan digit ke-14 dari NIM

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + A;
    }

    @Override
    public double hitungPajak() {
        return pendapatan * 0.10;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
