/* Nama File  : Kendaraan.java
 * Deskripsi  : Kelas yang merepresentasikan Kendaraan dengan atribut Nomor Plat dan Jenis
 * Pembuat    : Aditya Arif Setiawan
 * Tanggal    : Kamis, 27 Februari 2025
 */

public class Kendaraan {
    private String noPlat;
    private String jenis; // Motor atau Mobil

    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
