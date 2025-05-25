package tugas;

import model.Mahasiswa;
import service.MysqlMahasiswaService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class MahasiswaGUI extends JFrame {
    private MysqlMahasiswaService service = new MysqlMahasiswaService();
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField tfNim, tfNama, tfJurusan, tfAlamat;

    public MahasiswaGUI() {
        setTitle("Kelola Data Mahasiswa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750, 400);
        setLocationRelativeTo(null);

        // Tabel
        tableModel = new DefaultTableModel(new Object[]{"NIM", "Nama", "Jurusan", "Alamat"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // Form input
        tfNim = new JTextField(15);
        tfNama = new JTextField(15);
        tfJurusan = new JTextField(15);
        tfAlamat = new JTextField(15);

        // Tombol
        JButton btnAmbil = new JButton("Ambil Semua Data");
        JButton btnTambah = new JButton("Tambahkan");
        JButton btnEdit = new JButton("Edit");
        JButton btnHapus = new JButton("Hapus");
        JButton btnReset = new JButton("Reset Form");

        // Panel form
        JPanel panelForm = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0; gbc.gridy = 0;
        panelForm.add(new JLabel("NIM:"), gbc);
        gbc.gridx = 1;
        panelForm.add(tfNim, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        panelForm.add(new JLabel("Nama:"), gbc);
        gbc.gridx = 1;
        panelForm.add(tfNama, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        panelForm.add(new JLabel("Jurusan:"), gbc);
        gbc.gridx = 1;
        panelForm.add(tfJurusan, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        panelForm.add(new JLabel("Alamat:"), gbc);
        gbc.gridx = 1;
        panelForm.add(tfAlamat, gbc);

        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JPanel panelBtn = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        panelBtn.add(btnTambah);
        panelBtn.add(btnEdit);
        panelBtn.add(btnHapus);
        panelBtn.add(btnReset);
        panelForm.add(panelBtn, gbc);

        // Panel atas
        JPanel panelAtas = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelAtas.add(new JLabel("Kelola Data Mahasiswa"));
        panelAtas.add(Box.createHorizontalStrut(20));
        panelAtas.add(btnAmbil);

        // Layout utama
        setLayout(new BorderLayout(10, 10));
        add(panelAtas, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(panelForm, BorderLayout.EAST);

        // Event handler
        btnAmbil.addActionListener(e -> loadTable());
        btnTambah.addActionListener(e -> tambahMahasiswa());
        btnEdit.addActionListener(e -> editMahasiswa());
        btnHapus.addActionListener(e -> hapusMahasiswa());
        btnReset.addActionListener(e -> resetForm());

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                if (row >= 0) {
                    tfNim.setText(tableModel.getValueAt(row, 0).toString());
                    tfNama.setText(tableModel.getValueAt(row, 1).toString());
                    tfJurusan.setText(tableModel.getValueAt(row, 2).toString());
                    tfAlamat.setText(tableModel.getValueAt(row, 3).toString());
                }
            }
        });

        loadTable();
    }

    private void loadTable() {
        tableModel.setRowCount(0);
        List<Mahasiswa> list = service.getAll();
        for (Mahasiswa m : list) {
            tableModel.addRow(new Object[]{m.getNim(), m.getNama(), m.getJurusan(), m.getAlamat()});
        }
    }

    private void tambahMahasiswa() {
        if (tfNim.getText().isEmpty() || tfNama.getText().isEmpty() || tfJurusan.getText().isEmpty() || tfAlamat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
            return;
        }
        Mahasiswa m = new Mahasiswa(tfNim.getText(), tfNama.getText(), tfJurusan.getText(), tfAlamat.getText());
        if (service.add(m)) {
            JOptionPane.showMessageDialog(this, "Data berhasil ditambah.");
            loadTable();
            resetForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menambah data.");
        }
    }

    private void editMahasiswa() {
        if (tfNim.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan diedit!");
            return;
        }
        Mahasiswa m = new Mahasiswa(tfNim.getText(), tfNama.getText(), tfJurusan.getText(), tfAlamat.getText());
        if (service.update(m)) {
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate.");
            loadTable();
            resetForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal update data.");
        }
    }

    private void hapusMahasiswa() {
        String nim = tfNim.getText();
        if (nim.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
            return;
        }
        if (service.delete(nim)) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
            loadTable();
            resetForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data.");
        }
    }

    private void resetForm() {
        tfNim.setText("");
        tfNama.setText("");
        tfJurusan.setText("");
        tfAlamat.setText("");
        table.clearSelection();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MahasiswaGUI().setVisible(true));
    }
}