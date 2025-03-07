/**
 * File      : Menu.java
 * Deskripsi : Kelas yang merepresentasikan sebuah menu di restoran
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : Jumat, 7 Maret 2025
 */

public class Menu {
    private String nama;
    private double harga;
    private int stok;

    public Menu(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void kurangiStok(int jumlah) {
        // TO DO 1: Tambahkan metode untuk mengurangi stok
        if (jumlah > 0 && jumlah <= stok) {
            stok -= jumlah;
        }
    }
}
