/**
 * File      : Lingkaran.java
 * Deskripsi : Subclass dari BangunDatar, mengimplementasikan IResize
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 21 Maret 2025
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran() {
        super(0, "Putih", "Hitam");
        this.jari = 1.0;
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    // Implementasi IResize
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * (1 + (percent / 100.0));
    }
}
