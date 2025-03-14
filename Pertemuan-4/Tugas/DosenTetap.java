/**
 * File      : DosenTetap.java
 * Deskripsi : Subclass dari Dosen
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public double hitungTunjangan() {
        return 0.02 * Period.between(TMT, LocalDate.now()).getYears() * gajiPokok;
    }

    public String hitungBUP() {
        LocalDate bupDate = tanggalLahir.plusYears(65);
        LocalDate bupFinal = bupDate.withDayOfMonth(1).plusMonths(1);
        return bupFinal.format(DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID")));
    }

    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        int masaKerjaTahun = Period.between(TMT, LocalDate.now()).getYears();
        System.out.println("NIP          : " + NIP);
        System.out.println("NIDN         : " + NIDN);
        System.out.println("Nama         : " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(formatter));
        System.out.println("TMT          : " + TMT.format(formatter));
        System.out.println("Jabatan      : Dosen Tetap");
        System.out.println("Fakultas     : " + fakultas);
        System.out.println("Masa Kerja   : " + masaKerjaTahun + " tahun " + Period.between(TMT, LocalDate.now()).getMonths() + " bulan");
        System.out.println("BUP          : " + hitungBUP());
        System.out.println("Gaji Pokok   : " + rupiahFormat.format(gajiPokok));
        System.out.println("Tunjangan    : 2% x " + masaKerjaTahun + " x " + rupiahFormat.format(gajiPokok) + " = " + rupiahFormat.format(hitungTunjangan()));
    }
}