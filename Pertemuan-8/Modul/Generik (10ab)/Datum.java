/**
 * File      : Datum.java
 * Deskripsi : Kelas generik untuk menyimpan objek bertipe bebas (termasuk Anabul)
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 01 Mei 2025 
 */

public class Datum<T> {
    private T isi;

    public void setIsi(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }
}
