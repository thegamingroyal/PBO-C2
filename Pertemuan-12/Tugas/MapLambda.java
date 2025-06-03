/**
 * File      : MapLambda.java
 * Deskripsi : Menampilkan key dan value dari Map menggunakan ekspresi lambda
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 03 Juni 2025
 */

import java.util.HashMap;
import java.util.Map;

public class MapLambda {
    public static void main(String[] args) {
        // Membuat Map dengan key = NIM, value = Nama Mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("24060121140144", "Aditya Arif Setiawan");
        mahasiswaMap.put("24060121140132", "Zhulfani Faisal Adam");
        mahasiswaMap.put("24060121130072", "Galih Aji Syafaat");
        mahasiswaMap.put("24060121140134", "Dhiya Ulhaq");

        // Menampilkan isi Map dengan lambda
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}
