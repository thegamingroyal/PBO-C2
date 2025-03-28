/**
 * File      : Pegawai.java
 * Deskripsi : Superclass untuk semua pegawai
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 28 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class Pegawai {
    protected String NIP, nama, email;
    protected LocalDate tanggalLahir, TMT;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, String email, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.email = email;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String hitungMasaKerja() {
        Period selisih = Period.between(TMT, LocalDate.now());
        return selisih.getYears() + " tahun " + selisih.getMonths() + " bulan";
    }

    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("NIP          : " + NIP);
        System.out.println("Nama         : " + nama);
        System.out.println("Email        : " + email);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(formatter));
        System.out.println("TMT          : " + TMT.format(formatter));
        System.out.println("Masa Kerja   : " + hitungMasaKerja());
        System.out.println("Gaji Pokok   : " + rupiahFormat.format(gajiPokok));
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }
}
