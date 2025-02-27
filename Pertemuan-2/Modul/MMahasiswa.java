/* Nama File  : MMahasiswa.java
 * Deskripsi  : Program utama untuk menguji class Mahasiswa, MataKuliah, Dosen, dan Kendaraan
 * Pembuat    : Aditya Arif Setiawan
 * Tanggal    : Kamis, 27 Februari 2025
 */

public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Mata Kuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        // Membuat objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");

        // Membuat objek Dosen
        Dosen D1 = new Dosen("123", "Andi", "Informatika");

        // Membuat objek Kendaraan
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");

        // Relasikan objek mahasiswa dengan objek lain
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        // Menampilkan informasi mahasiswa
        M1.printDetailMhs();

        // Menampilkan jumlah mata kuliah dan total SKS yang diambil
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}
