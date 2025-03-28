/**
 * File      : Tendik.java
 * Deskripsi : Subclass dari Pegawai - Tenaga Kependidikan
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 28 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.text.NumberFormat;
import java.util.Locale;

public class Tendik extends Pegawai {
    private static int jumlahTendik = 0;
    private String bidang;

    private static final double GAPOK_TENDIK = 4000000;

    public Tendik(String NIP, String nama, String email, LocalDate tanggalLahir, LocalDate TMT, String bidang) {
        super(NIP, nama, email, tanggalLahir, TMT, GAPOK_TENDIK);
        this.bidang = bidang;
        jumlahTendik++;
    }

    public double hitungGaji() {
        int masaKerja = Period.between(TMT, LocalDate.now()).getYears();
        return GAPOK_TENDIK + (masaKerja * 0.01 * GAPOK_TENDIK);
    }

    public void printGaji() {
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("Gaji Tendik  : " + rupiah.format(hitungGaji()));
    }

    public void printInfo() {
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        int tahun = Period.between(TMT, LocalDate.now()).getYears();
        int bulan = Period.between(TMT, LocalDate.now()).getMonths();

        super.printInfo();
        System.out.println("Bidang       : " + bidang);
        System.out.println("Jabatan      : Tendik");
        System.out.println("Masa Kerja   : " + tahun + " tahun " + bulan + " bulan");
        System.out.println("Gaji         : " + rupiah.format(hitungGaji()));
    }

    public static int getJumlahTendik() {
        return jumlahTendik;
    }
}
