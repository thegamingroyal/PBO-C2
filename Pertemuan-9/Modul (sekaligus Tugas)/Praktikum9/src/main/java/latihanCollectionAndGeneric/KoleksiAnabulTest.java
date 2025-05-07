/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanCollectionAndGeneric;

/**
 * File     : KoleksiAnabulTest.java
 * Deskripsi: Program utama untuk menguji Koleksi<Anabul>
 * Pembuat  : Aditya Arif Setiawan
 * Tanggal  : 7 Mei 2025
 */
public class KoleksiAnabulTest {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksi = new Koleksi<>(10);

        koleksi.add(new Kucing("Mimi"));
        koleksi.add(new Anjing("Doggy"));
        koleksi.add(new Burung("Cici"));
        koleksi.add(new Kucing("Tom"));
        koleksi.add(new Anjing("Bruno"));
        koleksi.add(new Burung("Tweety"));
        koleksi.add(new Kucing("Luna"));
        koleksi.add(new Anjing("Spike"));
        koleksi.add(new Burung("Rio"));
        koleksi.add(new Kucing("Neko"));

        for (int i = 0; i < koleksi.getSize(); i++) {
            Anabul a = koleksi.getIsi(i);
            System.out.print(a.getNama() + " → ");
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}

