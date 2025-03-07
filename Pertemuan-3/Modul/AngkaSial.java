/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : Jumat, 7 Maret 2025
 */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException(); 
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10); 
            as.cobaAngka(13); 
            as.cobaAngka(12); 
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}

/* Jawaban
 1. Apakah baris 12 pada AngkaSial.java di atas dieksekusi?
    Jawaban: YA
    - Baris 12 adalah throw new AngkaSialException();
    - Jika angka yang dimasukkan adalah 13, maka baris ini akan dieksekusi dan menyebabkan program masuk ke blok catch.

 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
    Jawaban: TIDAK
    - Baris 21 adalah as.cobaAngka(12);
    - Jika angka 13 dilemparkan sebagai eksepsi di baris 12, program langsung masuk ke blok catch dan tidak melanjutkan eksekusi baris 21.
*/