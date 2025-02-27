/* Nama File  : Mahasiswa.java
 * Deskripsi  : Kelas yang merepresentasikan Mahasiswa dengan atribut NIM, Nama, Prodi, Dosen Wali, Kendaraan, dan Mata Kuliah
 * Pembuat    : Aditya Arif Setiawan
 * Tanggal    : Kamis, 27 Februari 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah newMatKul) {
        if (listMatKul.size() < 50) {
            listMatKul.add(newMatKul);
        } else {
            System.out.println("Tidak bisa menambah mata kuliah, daftar sudah penuh.");
        }
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatKul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Tidak ada"));
        System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getNoPlat() + " - " + kendaraan.getJenis() : "Tidak ada"));
        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah matkul : listMatKul) {
            System.out.println("- " + matkul.getNama() + " (" + matkul.getSks() + " SKS)");
        }
    }
}
