/**
 * File      : Student.java
 * Deskripsi : Kelas turunan dari Person yang override kebiasaan tidur
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 23 April 2025 
 */

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public boolean isAsleep(int hr) {
        return 2 < hr && 8 > hr; 
    }
}
