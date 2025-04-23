/**
 * File      : Sewa.java
 * Deskripsi : Program utama yang menunjukkan polimorfisme inclusion
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);

        System.out.println("\nPemanggilan melalui method hitungSewa():");
        hitungSewa(kendaraan);
        hitungSewa(mobil);
        hitungSewa(bis);
    }

    public static void hitungSewa(Vehicle v) {
        v.calRent(50, 1000);  
    }
}
