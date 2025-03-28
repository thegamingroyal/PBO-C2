/**
 * File      : Mahasiswa.java
 * Deskripsi : Kelas untuk objek mahasiswa
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 28 Maret 2025
 */

public class Mahasiswa {
    private static int jumlahMahasiswa = 0;

    private String nama, email, NIM;
    private int semester;
    private Fakultas fakultas;

    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        this.nama = nama;
        this.email = email;
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        jumlahMahasiswa++;
    }

    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }

    public void printUKT() {
        System.out.printf("Biaya UKT    : Rp%,.2f\n", hitungUKT());
    }

    public void printInfo() {
        System.out.println("NIM          : " + NIM);
        System.out.println("Nama         : " + nama);
        System.out.println("Email        : " + email);
        System.out.println("Semester     : " + semester);
        System.out.println("Fakultas     : " + fakultas.getNama());
        printUKT();
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }
}
