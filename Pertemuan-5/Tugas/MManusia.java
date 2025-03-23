/**
 * File      : MManusia.java
 * Deskripsi : Kelas utama untuk menguji program pelaporan pajak
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 Maret 2025
 */

public class MManusia {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing subclass
        PNS p1 = new PNS("Satriyo", "2006-04-01", "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", "2000-01-01", "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", "1977-01-09", "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        PNS p2 = new PNS("Panji", "2010-04-01", "Jl. Panorama 111 Tembalang", 10000000, "198004212010041002");

        // Mengubah alamat untuk objek p2
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // Menampilkan jumlah objek yang telah dibuat
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        // Menampilkan pajak dari masing-masing objek
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        // Menampilkan masa kerja dari masing-masing objek
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        // Menampilkan informasi lengkap dari setiap objek
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}
