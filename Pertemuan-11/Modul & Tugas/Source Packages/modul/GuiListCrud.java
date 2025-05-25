package modul;

import javax.swing.*;
import java.awt.*;

public class GuiListCrud extends JFrame {
    private DefaultListModel<String> dlm;
    private JList<String> jListItem;
    private JTextField jTextFieldItem;
    private JButton btnAdd, btnUpdate, btnDelete, btnClear, btnInsertData;

    public GuiListCrud() {
        setTitle("Add, Update, Delete JList");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
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

        // Panel atas: tombol insert data
        JPanel panelAtas = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelAtas.add(btnInsertData);

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

        // Event tombol insert data (tidak duplikat, hanya jika kosong)
        btnInsertData.addActionListener(e -> {
            if (dlm.isEmpty()) {
                String[] items = {"buku", "meja", "kursi", "tas", "pintu"};
                for (String item : items) {
                    dlm.addElement(item);
                }
            }
        });

        // Klik pada list, isi field
        jListItem.addListSelectionListener(e -> {
            int idx = jListItem.getSelectedIndex();
            if (idx >= 0) {
                jTextFieldItem.setText(dlm.get(idx));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GuiListCrud().setVisible(true));
    }
}