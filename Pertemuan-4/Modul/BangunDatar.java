/**
 * File      : BangunDatar.java
 * Deskripsi : Superclass untuk bangun datar
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Maret 2025
 */

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

/* Jawaban:
1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas Persegi dan Lingkaran?
   - Jika BangunDatar diberi keyword final, maka kelas Persegi dan Lingkaran tidak bisa mewarisi BangunDatar.
   - Saat kompilasi, akan muncul error karena kelas final tidak bisa memiliki subclass.
   - Solusinya: Jika ingin tetap menggunakan pewarisan, jangan tambahkan final pada BangunDatar.

2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada kelas Persegi dan Lingkaran?
   - Jika method printInfo() diberi keyword final, maka kelas Persegi dan Lingkaran tidak bisa mengoverride method ini.
   - Jika ada kode yang mencoba mengubah isi method printInfo() dalam subclass, maka akan terjadi error kompilasi.
   - Solusinya: Jika printInfo() harus bisa diubah di subclass, jangan gunakan final pada method tersebut.
*/