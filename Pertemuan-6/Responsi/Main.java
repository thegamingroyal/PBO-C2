/**
 * File      : Main.java
 * Deskripsi : Program utama untuk menjalankan demo responsi
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 28 Maret 2025
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Fakultas fti = new Fakultas("Fakultas Teknologi Informasi", 5000000, 6000000);

        Dosen dosen1 = new Dosen("197805142005011001", "Dr. Andi Saputra", "andi@univ.ac.id", LocalDate.of(1980, 5, 14), LocalDate.of(2010, 1, 1), fti.getGajiPokok(), fti.getNama());

        Tendik tendik1 = new Tendik("198603012010121002", "Rina Marlina", "rina@univ.ac.id", LocalDate.of(1986, 3, 1), LocalDate.of(2012, 2, 1), "Administrasi Akademik");

        Mahasiswa mhs1 = new Mahasiswa("Aditya Arif Setiawan", "aditya@student.ac.id", "24060121140144", 8, fti);

        System.out.println("=== INFORMASI DOSEN ===");
        dosen1.printInfo();
        dosen1.printGaji();

        System.out.println("\n=== INFORMASI TENAGA KEPENDIDIKAN ===");
        tendik1.printInfo();
        tendik1.printGaji();

        System.out.println("\n=== INFORMASI MAHASISWA ===");
        mhs1.printInfo();

        System.out.println("\n=== DATA TOTAL CIVITAS AKADEMIKA ===");
        System.out.println("Jumlah Mahasiswa : " + Mahasiswa.getJumlahMahasiswa());
        System.out.println("Jumlah Dosen     : " + Dosen.getJumlahDosen());
        System.out.println("Jumlah Tendik    : " + Tendik.getJumlahTendik());
    }
}
