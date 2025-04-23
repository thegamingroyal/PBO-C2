/**
 * File      : Vehicle.java
 * Deskripsi : Kelas induk yang mewakili kendaraan umum
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }
}
