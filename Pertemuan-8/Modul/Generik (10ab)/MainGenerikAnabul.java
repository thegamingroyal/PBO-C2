/**
 * File      : MainGenerikAnabul.java
 * Deskripsi : Program utama untuk menyimulasikan Anabul dengan generik
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 01 Mei 2025 
 */

public class MainGenerikAnabul {
    public static void main(String[] args) {
        Datum<Kucing> d1 = new Datum<>();
        Datum<Anjing> d2 = new Datum<>();
        Datum<Burung> d3 = new Datum<>();

        d1.setIsi(new Kucing("Mimi"));
        d2.setIsi(new Anjing("Bobby"));
        d3.setIsi(new Burung("Caca"));

        ContohMetodeGenerik.tampilkanPerilaku(d1);
        ContohMetodeGenerik.tampilkanPerilaku(d2);
        ContohMetodeGenerik.tampilkanPerilaku(d3);
    }
}
