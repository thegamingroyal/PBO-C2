/* Nama File  : Garis.java
 * Deskripsi  : Kelas yang merepresentasikan garis dengan titik awal dan titik akhir.
 * Pembuat    : Aditya Arif Setiawan
 * Tanggal    : Rabu, 19 Februari 2025
 */

public class Garis {
    /************** ATRIBUT **************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /************** METHOD **************/
    
    // Konstruktor tanpa parameter (default: (0,0) ke (1,1))
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    // Selektor (getter) dan mutator (setter)
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik awal) {
        this.titikAwal = awal;
    }

    public void setTitikAkhir(Titik akhir) {
        this.titikAkhir = akhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Menghitung panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Menghitung gradien garis
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Mendapatkan titik tengah garis
    public Titik getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    // Mengecek apakah dua garis sejajar
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // Mengecek apakah dua garis tegak lurus
    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // Menampilkan titik awal dan titik akhir
    public void printGaris() {
        System.out.print("Titik Awal: "); titikAwal.printTitik();
        System.out.print("Titik Akhir: "); titikAkhir.printTitik();
    }

    // Menampilkan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
