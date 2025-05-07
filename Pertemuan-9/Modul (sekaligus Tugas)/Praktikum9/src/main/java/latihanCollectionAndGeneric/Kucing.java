/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanCollectionAndGeneric;

/**
 * File     : Kucing.java
 * Deskripsi: Kelas turunan Anabul untuk objek kucing
 * Pembuat  : Aditya Arif Setiawan
 * Tanggal  : 7 Mei 2025
 */
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println("melata");
    }

    public void bersuara() {
        System.out.println("meong");
    }

    public String toString() {
        return nama + " (Kucing)";
    }
}

