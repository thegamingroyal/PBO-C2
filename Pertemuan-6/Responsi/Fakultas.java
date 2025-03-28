/**
 * File      : Fakultas.java
 * Deskripsi : Kelas yang merepresentasikan fakultas
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 28 Maret 2025
 */

public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokokDosen;

    public Fakultas(String nama, double tarifUKT, double gajiPokokDosen) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokokDosen = gajiPokokDosen;
    }

    public String getNama() {
        return nama;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokokDosen;
    }
}
