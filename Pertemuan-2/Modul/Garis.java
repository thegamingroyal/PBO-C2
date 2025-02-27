/* Nama File  : Garis.java
 * Deskripsi  : Kelas yang merepresentasikan garis dengan titik awal dan titik akhir.
 * Pembuat    : Aditya Arif Setiawan
 * Tanggal    : Kamis, 27 Februari 2025
 */

public class Garis {
    /************** ATRIBUT **************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /************** METHOD **************/
    
    // Konstruktor tanpa parameter (default: (0,0) ke (1,1))
    public Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    // Konstruktor dengan parameter
    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = new Titik(awal.getAbsis(), awal.getOrdinat());
        this.titikAkhir = new Titik(akhir.getAbsis(), akhir.getOrdinat());
        counterGaris++;
    }

    // Selektor (getter) dan mutator (setter)
    public Titik getTitikAwal() {
        return new Titik(titikAwal.getAbsis(), titikAwal.getOrdinat());
    }

    public Titik getTitikAkhir() {
        return new Titik(titikAkhir.getAbsis(), titikAkhir.getOrdinat());
    }

    public void setTitikAwal(Titik awal) {
        this.titikAwal = new Titik(awal.getAbsis(), awal.getOrdinat());
    }

    public void setTitikAkhir(Titik akhir) {
        this.titikAkhir = new Titik(akhir.getAbsis(), akhir.getOrdinat());
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
        if (titikAkhir.getAbsis() - titikAwal.getAbsis() == 0) {
            throw new ArithmeticException("Gradien tak terdefinisi (garis vertikal)");
        }
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
        try {
            return this.getGradien() == g.getGradien();
        } catch (ArithmeticException e) {
            return false;
        }
    }

    // Mengecek apakah dua garis tegak lurus
    public boolean isTegakLurus(Garis g) {
        try {
            return this.getGradien() * g.getGradien() == -1;
        } catch (ArithmeticException e) {
            return false;
        }
    }

    // Menampilkan titik awal dan titik akhir
    public void printGaris() {
        System.out.print("Titik Awal: "); titikAwal.printTitik();
        System.out.print("Titik Akhir: "); titikAkhir.printTitik();
    }

    // Menampilkan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        try {
            double m = getGradien();
            double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
            return "y = " + m + "x + " + c;
        } catch (ArithmeticException e) {
            return "Garis vertikal, persamaan: x = " + titikAwal.getAbsis();
        }
    }
}
