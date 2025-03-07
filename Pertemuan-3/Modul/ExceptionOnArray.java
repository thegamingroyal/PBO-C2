/**
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : Jumat, 7 Maret 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi objek array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; 
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up code...");
        }
    }
}
