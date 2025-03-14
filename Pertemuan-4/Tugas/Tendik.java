/**
 * File      : Tendik.java
 * Deskripsi : Subclass dari Pegawai
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        return 0.01 * gajiPokok * Period.between(TMT, LocalDate.now()).getYears();
    }

    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("NIP          : " + NIP);
        System.out.println("Nama         : " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(formatter));
        System.out.println("TMT          : " + TMT.format(formatter));
        System.out.println("Jabatan      : Tendik");
        System.out.println("Bidang       : " + bidang);
        System.out.println("Masa Kerja   : " + Period.between(TMT, LocalDate.now()).getYears() + " tahun " + Period.between(TMT, LocalDate.now()).getMonths() + " bulan");
        System.out.println("Gaji Pokok   : " + rupiahFormat.format(gajiPokok));
        System.out.println("Tunjangan    : 1% x " + Period.between(TMT, LocalDate.now()).getYears() + " x " + rupiahFormat.format(gajiPokok) + " = " + rupiahFormat.format(hitungTunjangan()));
    }
}