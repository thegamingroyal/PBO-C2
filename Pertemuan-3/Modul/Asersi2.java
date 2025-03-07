/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : Jumat, 7 Maret 2025
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/* Jawaban 
 Kesalahan Konseptual pada Program
 Terdapat kesalahan dalam penggunaan asersi di program ini:

 1. Asersi Ditempatkan Setelah Variabel Diinisialisasi
    - jariJari sudah ditetapkan dengan nilai 0 sebelum asersi dijalankan.
    - Hal ini menyebabkan program tetap membuat objek Lingkaran dengan jariJari = 0, sebelum asersi sempat menghentikan program.
    - Seharusnya, asersi dilakukan di dalam konstruktor kelas Lingkaran, bukan hanya di main.

 2. Pengecekan Validasi Seharusnya di Konstruktor
    - Saat membuat objek Lingkaran, jari-jari yang tidak valid tetap bisa dibuat, karena asersi hanya ada di main, bukan di dalam konstruktor.
    - Seharusnya, validasi menggunakan asersi dilakukan langsung di konstruktor Lingkaran untuk memastikan bahwa semua objek Lingkaran yang dibuat memiliki jariJari > 0. 
*/