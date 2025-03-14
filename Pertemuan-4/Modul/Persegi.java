/**
 * File      : Persegi.java
 * Deskripsi : Subclass dari BangunDatar
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Maret 2025
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        super(4, "", "");
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border); // Memanggil konstruktor superclass
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

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
}
