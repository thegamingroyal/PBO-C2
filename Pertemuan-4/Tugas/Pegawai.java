/**
 * File      : Pegawai.java
 * Deskripsi : Superclass untuk semua pegawai
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class Pegawai {
    protected String NIP, nama;
    protected LocalDate tanggalLahir, TMT;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String hitungMasaKerja() {
        Period selisih = Period.between(TMT, LocalDate.now());
        return selisih.getYears() + " tahun " + selisih.getMonths() + " bulan";
    }

    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("NIP          : " + NIP);
        System.out.println("Nama         : " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(formatter));
        System.out.println("TMT          : " + TMT.format(formatter));
        System.out.println("Masa Kerja   : " + hitungMasaKerja());
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("Gaji Pokok   : " + rupiahFormat.format(gajiPokok));
    }
}