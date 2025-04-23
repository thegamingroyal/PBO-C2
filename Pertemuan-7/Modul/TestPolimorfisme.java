/**
 * File      : TestPolimorfisme.java
 * Deskripsi : Program utama untuk menguji konsep polimorfisme (inclusion)
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
            System.out.println();
        }
    }
}
