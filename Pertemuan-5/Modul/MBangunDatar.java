/**
 * File      : MBangunDatar.java
 * Deskripsi : Kelas utama untuk menguji implementasi IResize
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 21 Maret 2025
 */

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi p = new Persegi(5, "Merah", "Hitam");
        Lingkaran l = new Lingkaran(10, "Biru", "Putih");

        System.out.println("Sebelum di-resize:");
        p.printInfo();
        l.printInfo();

        // Melakukan zoomIn dan zoomOut
        System.out.println("\nSetelah Zoom In (Persegi dan Lingkaran diperbesar 10%):");
        p.zoomIn();
        l.zoomIn();
        p.printInfo();
        l.printInfo();

        System.out.println("\nSetelah Zoom Out (Persegi dan Lingkaran diperkecil 10%):");
        p.zoomOut();
        l.zoomOut();
        p.printInfo();
        l.printInfo();

        System.out.println("\nSetelah Zoom 50% lebih besar:");
        p.zoom(50);
        l.zoom(50);
        p.printInfo();
        l.printInfo();
    }
}
