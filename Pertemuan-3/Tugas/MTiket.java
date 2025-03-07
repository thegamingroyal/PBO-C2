import java.util.Scanner;

/**
 * File      : MTiket.java
 * Deskripsi : Program utama untuk melakukan pemesanan tiket dan memilih e-wallet.
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : Jumat, 7 Maret 2025
 */

public class MTiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tiket yang ingin dipesan: ");
        int jumlahTiket = scanner.nextInt();
        Tiket.pesanJumlahTiket(jumlahTiket);

        System.out.println("Pilih e-wallet yang akan digunakan:");
        System.out.println("1. OVO");
        System.out.println("2. GoPay");
        System.out.println("3. DANA");
        System.out.println("4. LinkAja");
        System.out.print("Pilih e-wallet (1-4): ");
        int EWallet = scanner.nextInt();

        Tiket.isEWallet(EWallet);
        
        scanner.close();
    }
}
