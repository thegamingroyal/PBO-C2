/**
 * File      : DAOManager.java
 * Deskripsi : Pengelola DAO dalam program
 * Pembuat   : Aditya Arif Setiawan
 * Tanggal   : 14 Mei 2025
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
