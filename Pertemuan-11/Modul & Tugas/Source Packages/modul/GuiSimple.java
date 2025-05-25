package modul;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiSimple extends JFrame {
    private DefaultListModel<String> dlm;
    private JList<String> jListItem;
    private JTextField jTextFieldNamaItem;
    private JButton jButtonAdd;

    public GuiSimple() {
        setTitle("Tambah Item ke JList");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 250);
        setLocationRelativeTo(null);

        // Inisialisasi model dan komponen
        dlm = new DefaultListModel<>();
        jListItem = new JList<>(dlm);
        jTextFieldNamaItem = new JTextField(15);
        jButtonAdd = new JButton("Add");

        // Panel untuk input
        JPanel panelInput = new JPanel(new BorderLayout(5, 5));
        panelInput.add(new JLabel("Nama Item:"), BorderLayout.WEST);
        panelInput.add(jTextFieldNamaItem, BorderLayout.CENTER);

        // Panel untuk tombol
        JPanel panelButton = new JPanel();
        panelButton.add(jButtonAdd);

        // Layout utama
        setLayout(new BorderLayout(10, 10));
        add(new JScrollPane(jListItem), BorderLayout.CENTER);
        add(panelInput, BorderLayout.NORTH);
        add(panelButton, BorderLayout.SOUTH);

        // Event handler tombol Add
        jButtonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addItem(jTextFieldNamaItem.getText());
                jTextFieldNamaItem.setText("");
            }
        });
    }

    // Method untuk menambah item ke list
    private void addItem(String namaItem) {
        if (!namaItem.trim().isEmpty()) {
            dlm.addElement(namaItem);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GuiSimple().setVisible(true));
    }
}