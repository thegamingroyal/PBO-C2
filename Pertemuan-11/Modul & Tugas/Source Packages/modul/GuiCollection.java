package modul;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class GuiCollection extends JFrame {
    private DefaultListModel<String> dlm;
    private JList<String> jListItem;
    private JTextField jTextFieldItem;
    private JButton btnAdd, btnUpdate, btnDelete, btnClear, btnInsertData, btnSaveData;
    private JLabel jLabelJumlahData;

    private List<String> items = new ArrayList<>();

    public GuiCollection() {
        setTitle("Save dari JList ke List");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 320);
        setLocationRelativeTo(null);

        // Inisialisasi model dan komponen
        dlm = new DefaultListModel<>();
        jListItem = new JList<>(dlm);
        jTextFieldItem = new JTextField(12);

        btnAdd = new JButton("add");
        btnUpdate = new JButton("update");
        btnDelete = new JButton("delete");
        btnClear = new JButton("clear all");
        btnInsertData = new JButton("insert data");
        btnSaveData = new JButton("save data");
        jLabelJumlahData = new JLabel("Data tersimpan = 0");

        // Panel kiri: List
        JPanel panelList = new JPanel(new BorderLayout());
        panelList.add(new JScrollPane(jListItem), BorderLayout.CENTER);

        // Panel kanan: Form dan tombol
        JPanel panelKanan = new JPanel();
        panelKanan.setLayout(new BoxLayout(panelKanan, BoxLayout.Y_AXIS));
        panelKanan.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelKanan.add(Box.createVerticalStrut(10));
        panelKanan.add(new JLabel("Item name:"));
        panelKanan.add(jTextFieldItem);
        panelKanan.add(Box.createVerticalStrut(10));

        JPanel panelBtnCrud = new JPanel(new GridLayout(2, 2, 5, 5));
        panelBtnCrud.add(btnAdd);
        panelBtnCrud.add(btnUpdate);
        panelBtnCrud.add(btnDelete);
        panelBtnCrud.add(btnClear);
        panelKanan.add(panelBtnCrud);

        // Panel atas: tombol insert data, save data, dan label jumlah data
        JPanel panelAtas = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelAtas.add(btnInsertData);
        panelAtas.add(btnSaveData);
        panelAtas.add(jLabelJumlahData);

        // Layout utama
        JPanel panelUtama = new JPanel(new BorderLayout(10, 10));
        panelUtama.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelUtama.add(panelList, BorderLayout.CENTER);
        panelUtama.add(panelKanan, BorderLayout.EAST);

        setLayout(new BorderLayout());
        add(panelAtas, BorderLayout.NORTH);
        add(panelUtama, BorderLayout.CENTER);

        // Event tombol add
        btnAdd.addActionListener(e -> {
            String item = jTextFieldItem.getText().trim();
            if (!item.isEmpty()) {
                dlm.addElement(item);
                jTextFieldItem.setText("");
            }
        });

        // Event tombol update
        btnUpdate.addActionListener(e -> {
            int index = jListItem.getSelectedIndex();
            String selected = jTextFieldItem.getText().trim();
            if (index >= 0 && !selected.isEmpty()) {
                dlm.setElementAt(selected, index);
                jTextFieldItem.setText("");
            }
        });

        // Event tombol delete
        btnDelete.addActionListener(e -> {
            int index = jListItem.getSelectedIndex();
            if (index >= 0) {
                dlm.removeElementAt(index);
                jTextFieldItem.setText("");
            }
        });

        // Event tombol clear all
        btnClear.addActionListener(e -> dlm.clear());

        // Event tombol insert data
        btnInsertData.addActionListener(e -> {
            dlm.clear();
            for (String item : items) {
                dlm.addElement(item);
            }
        });

        // Event tombol save data
        btnSaveData.addActionListener(e -> {
            if (!items.isEmpty()) {
                items.clear();
            }
            for (int i = 0; i < dlm.getSize(); i++) {
                items.add(dlm.getElementAt(i));
            }
            updateJumDataTersimpan();
        });

        // Klik pada list, isi field
        jListItem.addListSelectionListener(e -> {
            int idx = jListItem.getSelectedIndex();
            if (idx >= 0) {
                jTextFieldItem.setText(dlm.get(idx));
            }
        });

        // Inisialisasi data awal (optional)
        // String[] data = {"buku", "meja", "kursi", "tas", "pintu"};
        // for (String d : data) {
        //     dlm.addElement(d);
        // }
        // updateJumDataTersimpan();
    }

    private void updateJumDataTersimpan() {
        jLabelJumlahData.setText("Data tersimpan = " + items.size());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GuiCollection().setVisible(true));
    }
}