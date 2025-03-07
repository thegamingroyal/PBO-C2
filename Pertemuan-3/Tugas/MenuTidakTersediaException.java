/**
 * File      : MenuTidakTersediaException.java
 * Deskripsi : Exception yang dilemparkan jika menu yang dipilih tidak tersedia
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : Jumat, 7 Maret 2025
 */

public class MenuTidakTersediaException extends Exception {
    public MenuTidakTersediaException(String message) {
        super(message);
    }
}
