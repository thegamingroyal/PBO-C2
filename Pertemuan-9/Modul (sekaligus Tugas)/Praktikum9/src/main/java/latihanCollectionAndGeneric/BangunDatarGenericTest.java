/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanCollectionAndGeneric;

/**
 * File     : BangunDatarGenericTest.java
 * Deskripsi: Main class untuk menguji class generic BangunDatarGeneric
 * Pembuat  : Aditya Arif Setiawan
 * Tanggal  : 7 Mei 2025
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // Uji objek Lingkaran
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<>();
        bdg.set(l);
        System.out.println("Keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("Luas lingkaran : " + bdg.get().hitungLuas());
        System.out.println("Tipe generic : " + bdg.get().getClass().getName());

        // Uji objek Persegi
        Persegi p = new Persegi(5);
        BangunDatarGeneric<Persegi> bd1 = new BangunDatarGeneric<>();
        bd1.set(p);
        System.out.println("Keliling persegi : " + bd1.hitungKeliling());
        System.out.println("Luas persegi : " + bd1.get().hitungLuas());
        System.out.println("Tipe generic : " + bd1.get().getClass().getName());

        // Uji objek Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(4, 6);
        BangunDatarGeneric<PersegiPanjang> bd2 = new BangunDatarGeneric<>();
        bd2.set(pp);
        System.out.println("Keliling persegi panjang : " + bd2.hitungKeliling());
        System.out.println("Luas persegi panjang : " + bd2.get().hitungLuas());
        System.out.println("Tipe generic : " + bd2.get().getClass().getName());

        // Uji objek Segitiga
        Segitiga s = new Segitiga(3, 4, 5);
        BangunDatarGeneric<Segitiga> bd3 = new BangunDatarGeneric<>();
        bd3.set(s);
        System.out.println("Keliling segitiga : " + bd3.hitungKeliling());
        System.out.println("Luas segitiga : " + bd3.get().hitungLuas());
        System.out.println("Tipe generic : " + bd3.get().getClass().getName());
    }
}



