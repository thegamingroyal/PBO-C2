/**
 * File      : ContohMetodeGenerik.java
 * Deskripsi : Kelas dengan method generik yang mengendalikan objek Datum
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 01 Mei 2025 
 */

public class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> data) {
        T anabul = data.getIsi();
        anabul.gerak();
        anabul.bersuara();
        System.out.println();
    }
}
