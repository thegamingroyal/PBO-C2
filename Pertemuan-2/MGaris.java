/* Nama File  : MGaris.java
 * Deskripsi  : Program utama untuk menguji class Garis
 * Pembuat    : Aditya Arif Setiawan
 * Tanggal    : Kamis, 27 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat dua titik
        Titik A = new Titik(0, 0);
        Titik B = new Titik(4, 4);
        
        // Membuat objek garis dengan titik A dan B
        Garis garis1 = new Garis(A, B);
        
        // Menampilkan informasi garis
        garis1.printGaris();
        System.out.println("Panjang garis: " + garis1.getPanjang());
        System.out.println("Gradien garis: " + garis1.getGradien());
        System.out.print("Titik tengah garis: "); garis1.getTitikTengah().printTitik();
        System.out.println("Persamaan garis: " + garis1.getPersamaanGaris());
        
        // Membuat garis lain untuk pengecekan paralel dan tegak lurus
        Garis garis2 = new Garis(new Titik(2, 2), new Titik(6, 6));
        Garis garis3 = new Garis(new Titik(1, 5), new Titik(5, 1));

        System.out.println("Garis 1 sejajar dengan Garis 2: " + garis1.isSejajar(garis2));
        System.out.println("Garis 1 tegak lurus dengan Garis 3: " + garis1.isTegakLurus(garis3));
        
        // Menampilkan jumlah objek Garis yang dibuat
        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());
    }
}