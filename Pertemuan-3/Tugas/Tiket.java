/**
 * File      : Tiket.java
 * Deskripsi : Program untuk memastikan validasi pemesanan tiket dan e-wallet dengan asersi.
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : Jumat, 7 Maret 2025
 */

public class Tiket {
    public static void pesanJumlahTiket(int jumlahTiket) {
        // Asumsi jumlah tiket yang tersedia (boleh diganti)
        int tiketTersedia = 100;

        // TO DO: Assertion untuk memastikan jumlah pemesanan lebih dari 0
        assert jumlahTiket > 0 : "Jumlah pemesanan harus lebih dari 0";

        // TO DO: Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
        assert jumlahTiket <= tiketTersedia : "Jumlah pemesanan tidak boleh melebihi tiket yang tersedia";

        System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

    public static void isEWallet(int EWallet) {
        // TO DO: Memeriksa apakah index e-wallet yang dipilih valid
        boolean validEWallet = (EWallet >= 1 && EWallet <= 4);

        // TO DO: Assertion untuk memastikan e-wallet yang dipilih valid
        assert validEWallet : "Pilihan e-wallet tidak valid";

        System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

    private static String getEWallet(int index) {
        switch (index) {
            case 1:
                return "OVO";
            case 2:
                return "GoPay";
            case 3:
                return "DANA";
            case 4:
                return "LinkAja";
            default:
                return "";
        }
    }
}
