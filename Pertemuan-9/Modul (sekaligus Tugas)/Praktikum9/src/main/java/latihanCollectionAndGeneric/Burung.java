/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanCollectionAndGeneric;

/**
 * File     : Burung.java
 * Deskripsi: Kelas turunan Anabul untuk objek burung
 * Pembuat  : Aditya Arif Setiawan
 * Tanggal  : 7 Mei 2025
 */
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println("terbang");
    }

    public void bersuara() {
        System.out.println("cuit");
    }

    public String toString() {
        return nama + " (Burung)";
    }
}

