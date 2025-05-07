/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanCollectionAndGeneric;

/**
 * File     : Anjing.java
 * Deskripsi: Kelas turunan Anabul untuk objek anjing
 * Pembuat  : Aditya Arif Setiawan
 * Tanggal  : 7 Mei 2025
 */
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println("melata");
    }

    public void bersuara() {
        System.out.println("guk-guk");
    }

    public String toString() {
        return nama + " (Anjing)";
    }
}

