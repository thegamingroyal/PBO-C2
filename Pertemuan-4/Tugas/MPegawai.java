/**
 * File      : MPegawai.java
 * Deskripsi : Kelas utama untuk menjalankan program
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("9545647548", "78647324", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika");
        System.out.println("Informasi Dosen Tetap:");
        dosenTetap.printInfo();

        System.out.println("\nInformasi Dosen Tamu:");
        DosenTamu dosenTamu = new DosenTamu("9545647549", "89765432", "Budi", LocalDate.of(1985, 8, 15), LocalDate.of(2018, 6, 1), 4000000, "Fakultas Teknik", LocalDate.of(2026, 6, 1));
        dosenTamu.printInfo();

        System.out.println("\nInformasi Tendik:");
        Tendik tendik = new Tendik("9545647550", "Citra", LocalDate.of(1980, 3, 10), LocalDate.of(2010, 2, 1), 3000000, "Kemahasiswaan");
        tendik.printInfo();
    }
}