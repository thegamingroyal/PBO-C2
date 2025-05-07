/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanCollectionAndGeneric;

/**
 * File     : Segitiga.java
 * Deskripsi: Kelas turunan BangunDatar untuk bentuk Segitiga
 * Pembuat  : Aditya Arif Setiawan
 * Tanggal  : 7 Mei 2025
 */
public class Segitiga extends BangunDatar {
    private double sisi1, sisi2, sisi3;

    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
    public double hitungLuas() {
    double s = (sisi1 + sisi2 + sisi3) / 2;
    return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }
}

