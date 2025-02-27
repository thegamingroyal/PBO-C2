/* Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik dengan penerapan enkapsulasi
 * Pembuat    : Aditya Arif Setiawan
 * Tanggal    : Kamis, 27 Februari 2025
 */

public class Titik {
    /************** ATRIBUT **************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /************** METHOD **************/
    
    // Konstruktor untuk membuat titik (0,0)
    public Titik() {
        this(0, 0);
    }

    // Konstruktor dengan parameter
    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // Mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Getter dan Setter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double x) {
        this.absis = x;
    }

    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser titik sejauh (x, y)
    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Menentukan kuadran tempat titik berada
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        if (absis < 0 && ordinat > 0) return 2;
        if (absis < 0 && ordinat < 0) return 3;
        if (absis > 0 && ordinat < 0) return 4;
        return 0; // Titik berada di sumbu atau pusat
    }

    // Menghitung jarak titik ke pusat koordinat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Menghitung jarak ke titik lain
    public double getJarak(Titik T) {
        double dx = this.absis - T.getAbsis();
        double dy = this.ordinat - T.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Refleksi terhadap sumbu X (mengubah koordinat objek)
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Refleksi terhadap sumbu Y (mengubah koordinat objek)
    public void refleksiY() {
        this.absis = -this.absis;
    }

    // Mengembalikan objek Titik baru yang merupakan hasil refleksi terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // Mengembalikan objek Titik baru yang merupakan hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}
