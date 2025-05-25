package modul;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ListSetMapGUI extends JFrame {
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> itemList = new JList<>(listModel);

    private java.util.List<String> dataList = new ArrayList<>();
    private Set<String> dataSet = new LinkedHashSet<>();
    private Map<Integer, String> dataMap = new LinkedHashMap<>();

    private JTextField tfItem = new JTextField(15);

    private JLabel lblListCount = new JLabel("Data tersimpan = 0");
    private JLabel lblSetCount = new JLabel("Data tersimpan = 0");
    private JLabel lblMapCount = new JLabel("Data tersimpan = 0");

    public ListSetMapGUI() {
        setTitle("List, Set, Map Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 350);
        setLocationRelativeTo(null);

        // Panel kiri: List item
        JPanel panelKiri = new JPanel(new BorderLayout(5, 5));
        panelKiri.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 5));
        panelKiri.add(new JScrollPane(itemList), BorderLayout.CENTER);

        JButton btnClearAll = new JButton("clear all");
        panelKiri.add(btnClearAll, BorderLayout.SOUTH);

        // Panel tengah: Tombol operasi dan label jumlah data
        JPanel panelTengah = new JPanel();
        panelTengah.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // List
        JButton btnSaveList = new JButton("save to List ->");
        JButton btnInsertList = new JButton("<- insert data List");
        gbc.gridx = 0; gbc.gridy = 0;
        panelTengah.add(btnSaveList, gbc);
        gbc.gridx = 1;
        panelTengah.add(lblListCount, gbc);
        gbc.gridx = 0; gbc.gridy = 1;
        panelTengah.add(btnInsertList, gbc);

        // Set
        JButton btnSaveSet = new JButton("save to Set ->");
        JButton btnInsertSet = new JButton("<- insert data Set");
        gbc.gridx = 0; gbc.gridy = 2;
        panelTengah.add(btnSaveSet, gbc);
        gbc.gridx = 1;
        panelTengah.add(lblSetCount, gbc);
        gbc.gridx = 0; gbc.gridy = 3;
        panelTengah.add(btnInsertSet, gbc);

        // Map
        JButton btnSaveMap = new JButton("save to Map ->");
        JButton btnInsertMap = new JButton("<- insert data Map");
        gbc.gridx = 0; gbc.gridy = 4;
        panelTengah.add(btnSaveMap, gbc);
        gbc.gridx = 1;
        panelTengah.add(lblMapCount, gbc);
        gbc.gridx = 0; gbc.gridy = 5;
        panelTengah.add(btnInsertMap, gbc);

        // Panel kanan: Form input dan tombol CRUD
        JPanel panelKanan = new JPanel();
        panelKanan.setLayout(new BoxLayout(panelKanan, BoxLayout.Y_AXIS));
        panelKanan.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 10));
        panelKanan.add(Box.createVerticalStrut(10));
        panelKanan.add(new JLabel("Item name:"));
        panelKanan.add(tfItem);
        panelKanan.add(Box.createVerticalStrut(10));

        JPanel panelBtnCrud = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        JButton btnAdd = new JButton("add");
        JButton btnUpdate = new JButton("update");
        JButton btnDelete = new JButton("delete");
        panelBtnCrud.add(btnAdd);
        panelBtnCrud.add(btnUpdate);
        panelBtnCrud.add(btnDelete);
        panelKanan.add(panelBtnCrud);

        // Layout utama
        setLayout(new BorderLayout(10, 10));
        add(panelKiri, BorderLayout.WEST);
        add(panelTengah, BorderLayout.CENTER);
        add(panelKanan, BorderLayout.EAST);

        // Event handler tombol CRUD
        btnAdd.addActionListener(e -> {
            String item = tfItem.getText().trim();
            if (!item.isEmpty()) {
                listModel.addElement(item);
                tfItem.setText("");
            }
        });

        btnUpdate.addActionListener(e -> {
            int idx = itemList.getSelectedIndex();
            String item = tfItem.getText().trim();
            if (idx >= 0 && !item.isEmpty()) {
                listModel.set(idx, item);
                tfItem.setText("");
            }
        });

        btnDelete.addActionListener(e -> {
            int idx = itemList.getSelectedIndex();
            if (idx >= 0) {
                listModel.remove(idx);
                tfItem.setText("");
            }
        });

        btnClearAll.addActionListener(e -> listModel.clear());

        // List <-> List
        btnSaveList.addActionListener(e -> {
            dataList.clear();
            for (int i = 0; i < listModel.size(); i++) {
                dataList.add(listModel.get(i));
            }
            lblListCount.setText("Data tersimpan = " + dataList.size());
        });
        btnInsertList.addActionListener(e -> {
            listModel.clear();
            for (String s : dataList) listModel.addElement(s);
        });

        // List <-> Set
        btnSaveSet.addActionListener(e -> {
            dataSet.clear();
            for (int i = 0; i < listModel.size(); i++) {
                dataSet.add(listModel.get(i));
            }
            lblSetCount.setText("Data tersimpan = " + dataSet.size());
        });
        btnInsertSet.addActionListener(e -> {
            listModel.clear();
            for (String s : dataSet) listModel.addElement(s);
        });

        // List <-> Map
        btnSaveMap.addActionListener(e -> {
            dataMap.clear();
            for (int i = 0; i < listModel.size(); i++) {
                dataMap.put(i, listModel.get(i));
            }
            lblMapCount.setText("Data tersimpan = " + dataMap.size());
        });
        btnInsertMap.addActionListener(e -> {
            listModel.clear();
            for (int i = 0; i < dataMap.size(); i++) {
                listModel.addElement(dataMap.get(i));
            }
        });

        // Klik pada list, isi field
        itemList.addListSelectionListener(e -> {
            int idx = itemList.getSelectedIndex();
            if (idx >= 0) {
                tfItem.setText(listModel.get(idx));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ListSetMapGUI().setVisible(true));
    }
}