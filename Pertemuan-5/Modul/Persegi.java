/**
 * File      : Persegi.java
 * Deskripsi : Subclass dari BangunDatar, mengimplementasikan IResize
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 21 Maret 2025
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi() {
        super(4, "Putih", "Hitam");
        this.sisi = 1.0;
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    // Implementasi IResize
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * (1 + (percent / 100.0));
    }
}
