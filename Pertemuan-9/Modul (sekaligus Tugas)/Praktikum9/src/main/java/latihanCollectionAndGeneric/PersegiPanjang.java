/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanCollectionAndGeneric;

/**
 * File     : PersegiPanjang.java
 * Deskripsi: Kelas turunan BangunDatar untuk bentuk Persegi Panjang
 * Pembuat  : Aditya Arif Setiawan
 * Tanggal  : 7 Mei 2025
 */
public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    public double hitungLuas() {
    return panjang * lebar;
    }
}

