/**
 * File      : MainAnabul.java
 * Deskripsi : Program utama untuk mensimulasikan anabul dan polimorfisme suara serta geraknya
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] peliharaan = {
            new Kucing("Mimi"),
            new Anjing("Bobby"),
            new Burung("Caca")
        };

        for (Anabul a : peliharaan) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}
