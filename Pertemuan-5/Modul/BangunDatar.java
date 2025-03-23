/**
 * File      : BangunDatar.java
 * Deskripsi : Abstract class untuk bangun datar
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 21 Maret 2025
 */

public abstract class BangunDatar { 
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    // Konstruktor tanpa parameter
    public BangunDatar() {
        this.jmlSisi = 0;
        this.warna = "Tidak Diketahui";
        this.border = "Tidak Diketahui";
        counterBangunDatar++;
    }

    // Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    public abstract double getLuas();
    public abstract double getKeliling();

    // Metode statis untuk menghitung jumlah objek yang dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    // Metode mencetak informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // Metode untuk membandingkan luas antara dua bangun datar
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // Metode untuk membandingkan keliling antara dua bangun datar
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}

/* Jawaban:
Bagian 1 - Abstract Class
1. Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek bangun datar yang berbeda?
   - ✅ Ya, karena isEqualLuas(BangunDatar X) dan isEqualKeliling(BangunDatar X) memanfaatkan polimorfisme untuk membandingkan dua objek berbeda selama keduanya merupakan subclass dari BangunDatar.
   - Contohnya, luas persegi bisa dibandingkan dengan luas lingkaran karena keduanya memiliki implementasi metode getLuas().

2. Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas() dan isEqualKeliling() pada class BangunDatar? Mengapa?
   - ❌ Tidak bisa sepenuhnya.
     Jika BangunDatar bukan abstract class, maka setiap instance dari BangunDatar harus memiliki implementasi getLuas() dan getKeliling(), padahal perhitungannya tergantung jenis bangun datarnya.
   - Dengan menjadikan BangunDatar sebagai abstract class, kita bisa memastikan bahwa setiap subclass seperti Persegi dan Lingkaran memiliki implementasi metode getLuas() dan getKeliling().

3. Apa kelebihan class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
   - ✅ Mencegah instansiasi langsung sehingga hanya subclass yang bisa digunakan.
   - ✅ Memaksa setiap subclass mengimplementasikan getLuas() dan getKeliling() agar sesuai dengan bentuknya.
   - ✅ Menyediakan metode umum yang dapat digunakan oleh semua subclass, seperti isEqualLuas() dan isEqualKeliling().

Bagian 2 - Interface
4. Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar?
   - ✅ Fleksibilitas lebih tinggi → Tidak semua bangun datar perlu fitur resize, jadi interface memungkinkan hanya class tertentu yang membutuhkannya untuk menggunakannya.
   - ✅ Mendukung multiple inheritance → Persegi dan Lingkaran masih bisa mewarisi BangunDatar sambil tetap menggunakan interface IResize.
   - ✅ Dapat digunakan oleh class lain yang tidak terkait dengan BangunDatar, misalnya Bangun3D, Garis, dll.
   - ✅ Memisahkan tanggung jawab → BangunDatar hanya menangani properti utama bangun datar, sedangkan IResize menangani fitur resize.
*/