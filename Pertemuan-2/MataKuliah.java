/* Nama File  : MataKuliah.java
 * Deskripsi  : Kelas yang merepresentasikan Mata Kuliah dengan atribut ID, Nama, dan SKS
 * Pembuat    : Aditya Arif Setiawan
 * Tanggal    : Kamis, 27 Februari 2025
 */

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatKul() {
        return idMatKul;
    }

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
