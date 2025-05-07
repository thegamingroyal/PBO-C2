/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanCollectionAndGeneric;

/**
 * File     : Koleksi.java
 * Deskripsi: Kelas generic Koleksi untuk menyimpan array objek
 * Pembuat  : Aditya Arif Setiawan
 * Tanggal  : 7 Mei 2025
 */
public class Koleksi<E> {
    private int nbElm;
    private E[] data;

    public Koleksi(int maxSize) {
        data = (E[]) new Object[maxSize];
        nbElm = 0;
    }

    public int getSize() {
        return nbElm;
    }

    public void setSize(int n) {
        this.nbElm = n;
    }

    public E getIsi(int index) {
        return data[index];
    }

    public void setIsi(int index, E elemen) {
        data[index] = elemen;
    }

    public void add(E elemen) {
        data[nbElm++] = elemen;
    }

    public void delete(int index) {
        for (int i = index; i < nbElm - 1; i++) {
            data[i] = data[i + 1];
        }
        data[nbElm - 1] = null;
        nbElm--;
    }

    public void showAll() {
        for (int i = 0; i < nbElm; i++) {
            System.out.println(data[i]);
        }
    }
}

