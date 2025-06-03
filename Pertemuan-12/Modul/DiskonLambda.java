/**
 * File      : DiskonLambda.java
 * Deskripsi : Ekspresi lambda dasar untuk menghitung diskon
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 03 Juni 2025
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {

        // Implementasi tanpa lambda (anonymous class)
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // Implementasi dengan lambda ekspresi
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // Implementasi lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}
