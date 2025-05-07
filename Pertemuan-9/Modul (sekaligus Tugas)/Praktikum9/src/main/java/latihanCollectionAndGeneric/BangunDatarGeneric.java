/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanCollectionAndGeneric;

/**
 * File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 7 Mei 2025
 */
public class BangunDatarGeneric<T1234 extends BangunDatar> {
    private T1234 bangunDatar;

    public void set(T1234 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T1234 get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}


