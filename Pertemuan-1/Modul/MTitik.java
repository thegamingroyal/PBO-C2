/* Nama File  : MTitik.java
 * Deskripsi  : Program utama untuk menguji class Titik
 * Pembuat    : Aditya Arif Setiawan
 * Tanggal    : Rabu, 19 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek titik T1 (0,0)
        Titik T1 = new Titik();
        T1.setAbsis(3);   // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik();  // Mencetak koordinat T1 ke layar

        // Menggeser T1 sejauh (3,4)
        T1.geser(3, 4);
        T1.printTitik();  // Menampilkan koordinat T1 setelah digeser

        // Referensi T2 menunjuk ke objek yang sama dengan T1
        Titik T2 = T1;
        T2.printTitik();

        // Mengubah koordinat T1 (juga memengaruhi T2 karena referensi yang sama)
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik(); // Akan mencetak titik yang telah berubah

        // Membuat objek titik T3 (0,0) dan T4 (3,5) secara terpisah
        Titik T3 = new Titik();
        Titik T4 = new Titik(3,5);

        // Menampilkan jumlah objek Titik yang telah dibuat
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        // Memeriksa informasi tentang titik tambahan
        System.out.println("T3 berada di kuadran: " + T3.getKuadran());
        System.out.println("T4 berada di kuadran: " + T4.getKuadran());

        // Menampilkan jarak dari titik ke pusat koordinat
        System.out.println("Jarak T3 ke pusat: " + T3.getJarakPusat());
        System.out.println("Jarak T4 ke pusat: " + T4.getJarakPusat());

        // Menghitung jarak antara T3 dan T4
        System.out.println("Jarak antara T3 dan T4: " + T3.getJarak(T4));

        // Melakukan refleksi terhadap sumbu X dan Y
        T3.refleksiX();
        System.out.print("T3 setelah refleksi terhadap sumbu X: ");
        T3.printTitik();

        T4.refleksiY();
        System.out.print("T4 setelah refleksi terhadap sumbu Y: ");
        T4.printTitik();

        // Mendapatkan titik baru hasil refleksi
        Titik refleksiT3X = T3.getRefleksiX();
        Titik refleksiT4Y = T4.getRefleksiY();

        System.out.print("T3 hasil refleksi terhadap sumbu X: ");
        refleksiT3X.printTitik();

        System.out.print("T4 hasil refleksi terhadap sumbu Y: ");
        refleksiT4Y.printTitik();
    }
}
