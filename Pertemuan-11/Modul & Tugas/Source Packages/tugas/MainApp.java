package tugas;

import modul.GuiCollection;
import modul.GuiListCrud;
import modul.GuiSimple;
import modul.ListSetMapGUI;
import tugas.MahasiswaGUI;




public class MainApp {
    public static void main(String[] args) {
        MahasiswaGUI.main(args);
        GuiCollection.main(args);
        GuiListCrud.main(args);
        GuiSimple.main(args);
        ListSetMapGUI.main(args);
        // Tambahkan GUI lain di sini jika perlu
    }
}
