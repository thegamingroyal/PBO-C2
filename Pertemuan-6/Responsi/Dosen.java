/**
 * File      : Dosen.java
 * Deskripsi : Subclass dari Pegawai, merepresentasikan dosen di universitas
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 28 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.text.NumberFormat;
import java.util.Locale;

public class Dosen extends Pegawai {
    private static int jumlahDosen = 0;
    protected String fakultas;

    public Dosen(String NIP, String nama, String email, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, email, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
        jumlahDosen++;
    }

    public String getFakultas() {
        return fakultas;
    }

    public double hitungGaji() {
        int masaKerja = Period.between(TMT, LocalDate.now()).getYears();
        return gajiPokok + (masaKerja * 0.01 * gajiPokok);
    }

    public void printGaji() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("Gaji Dosen   : " + formatter.format(hitungGaji()));
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas     : " + fakultas);
    }

    public static int getJumlahDosen() {
        return jumlahDosen;
    }
}
