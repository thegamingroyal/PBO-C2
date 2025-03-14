/**
 * File      : MBangunDatar.java
 * Deskripsi : Kelas utama untuk menjalankan program
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Maret 2025
 */

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi p = new Persegi(5, "Merah", "Hitam");
        System.out.println("Informasi Persegi:");
        p.printInfo();
        
        System.out.println("\nInformasi Lingkaran:");
        Lingkaran l = new Lingkaran(10, "Biru", "Putih");
        l.printInfo();
        
        System.out.println("\nJumlah Objek Bangun Datar:");
        BangunDatar.printCounterBangunDatar();
    }
}