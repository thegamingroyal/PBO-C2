/**
 * File      : DosenTamu.java
 * Deskripsi : Subclass dari Dosen
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tanggalKontrakBerakhir;

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, LocalDate tanggalKontrakBerakhir) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tanggalKontrakBerakhir = tanggalKontrakBerakhir;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok * Period.between(LocalDate.now(), tanggalKontrakBerakhir).toTotalMonths() / 12;
    }

    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("NIP          : " + NIP);
        System.out.println("NIDK         : " + NIDK);
        System.out.println("Nama         : " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(formatter));
        System.out.println("TMT          : " + TMT.format(formatter));
        System.out.println("Jabatan      : Dosen Tamu");
        System.out.println("Fakultas     : " + fakultas);
        System.out.println("Masa Kerja   : " + Period.between(TMT, LocalDate.now()).getYears() + " tahun " + Period.between(TMT, LocalDate.now()).getMonths() + " bulan");
        System.out.println("Masa Kontrak Berakhir: " + tanggalKontrakBerakhir.format(formatter));
        System.out.println("Gaji Pokok   : " + rupiahFormat.format(gajiPokok));
        System.out.println("Tunjangan    : 2.5% x " + Period.between(LocalDate.now(), tanggalKontrakBerakhir).toTotalMonths() / 12 + " x " + rupiahFormat.format(gajiPokok) + " = " + rupiahFormat.format(hitungTunjangan()));
    }
}
