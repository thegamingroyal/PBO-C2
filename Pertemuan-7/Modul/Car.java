/**
 * File      : Car.java
 * Deskripsi : Kelas turunan dari Vehicle, merepresentasikan mobil
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

public class Car extends Vehicle {
    @Override
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}
