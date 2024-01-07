/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ppdbkalsel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Edwin Yosua<2110010382>
 */
public class MenuDaftarSiswa extends javax.swing.JFrame {    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/dbpendaftaran";
  
    public MenuDaftarSiswa() {
        initComponents();
        
        //disable edit by mouse click
        tableSiswa.setDefaultEditor(Object.class, null);
        
        //isi table dengan data dari database
        loadDataTable();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisKelaminGroup = new javax.swing.ButtonGroup();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtKotaLahir = new javax.swing.JTextField();
        dateChoose = new com.toedter.calendar.JDateChooser();
        rbPerem = new javax.swing.JRadioButton();
        rbLaki = new javax.swing.JRadioButton();
        edtNama = new javax.swing.JTextField();
        edtNisn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtAlamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edtNik = new javax.swing.JTextField();
        edtOrtu = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSiswa = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnTutup = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jLabel1.setText("NISN");

        jLabel2.setText("NAMA");

        jLabel3.setText("KOTA LAHIR");

        jLabel4.setText("TANGGAL LAHIR");

        dateChoose.setDateFormatString("dd/MM/y");
        dateChoose.setMaxSelectableDate(new java.util.Date(1577811713000L));
        dateChoose.setMinSelectableDate(new java.util.Date(631126913000L));

        jenisKelaminGroup.add(rbPerem);
        rbPerem.setText("Perempuan");

        jenisKelaminGroup.add(rbLaki);
        rbLaki.setText("Laki-Laki");

        jLabel5.setText("JENIS KELAMIN");

        edtAlamat.setColumns(20);
        edtAlamat.setRows(5);
        jScrollPane1.setViewportView(edtAlamat);

        jLabel6.setText("ALAMAT TINGGAL");

        jLabel7.setText("NIK ORTU");

        jLabel8.setText("NAMA ORTU");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tableSiswa.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tableSiswa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableSiswa.setAutoscrolls(false);
        tableSiswa.setName(""); // NOI18N
        tableSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSiswa);

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTutup.setText("TUTUP");
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PENDAFTARAN SISWA");

        btnEdit.setText("EDIT");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.setEnabled(false);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtOrtu)
                                    .addComponent(jScrollPane1)
                                    .addComponent(edtKotaLahir)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbLaki)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbPerem))
                                    .addComponent(edtNisn)
                                    .addComponent(edtNama, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edtNik)
                                    .addComponent(dateChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(btnTutup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtNisn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbLaki)
                            .addComponent(rbPerem)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtKotaLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(edtOrtu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit)
                            .addComponent(btnHapus)
                            .addComponent(btnSimpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTutup)
                            .addComponent(btnClear))))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        try {
            if(cekNisn()) {
                JOptionPane.showMessageDialog(null, "NISN SUDAH ADA");
                btnEdit.setEnabled(true);
                btnHapus.setEnabled(true);
                btnSimpan.setEnabled(false);
                
                putDataToForm();               
            }else {
                String jk;
                if(rbLaki.isSelected()) {
                    jk = "Laki-Laki";
                } else {
                    jk = "Perempuan";
                }
                
                java.util.Date utilDate = dateChoose.getDate();
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                
                String sql_input = "INSERT INTO tb_siswa VALUES('"+edtNisn.getText()+
                "','" + edtNama.getText() +
                "','" + jk +
                "','" + sqlDate +
                "','" + edtKotaLahir.getText() +
                "','" + edtAlamat.getText() +
                "','" + edtNik.getText() +
                "','" + edtOrtu.getText() + "')";
                
                inputEditData(sql_input);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MenuDaftarSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
       MenuDaftarSiswa.this.dispose();
       new MenuUtama().show();
    }//GEN-LAST:event_btnTutupActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        try {
            String jk;
            if(rbLaki.isSelected()) {
                jk = "Laki-Laki";
            } else {
                jk = "Perempuan";
            }
            
            java.util.Date utilDate = dateChoose.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                
            String sql_update = "UPDATE tb_siswa SET nama_siswa = '" + edtNama.getText() +
            "', jk = '" + jk +
            "', tanggal_lahir = '" + sqlDate +
            "', tempat_lahir = '" + edtKotaLahir.getText() +
            "', alamat_siswa = '" + edtAlamat.getText() +
            "', nik_ortu = '" + edtNik.getText() +
            "', nama_ortu = '" + edtOrtu.getText() + 
            "' WHERE nisn_siswa = '" + edtNisn.getText() + "'";
    
            inputEditData(sql_update);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MenuDaftarSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearInputs();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            delSelectedData();
        } catch (SQLException ex) {
            Logger.getLogger(MenuDaftarSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tableSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSiswaMouseClicked
        edtNisn.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(),0).toString());
    }//GEN-LAST:event_tableSiswaMouseClicked
    
    
        
    //Menampilkan data ke table
    private void loadDataTable() {
        String sql_data = "SELECT * FROM tb_siswa";
        
        Object header[] = {"NISN", "NAMA", "JENIS KELAMIN","TANGGAL LAHIR", "TEMPAT LAHIR", "ALAMAT SISWA", "NIK ORTU", "NAMA ORTU"};       
        DefaultTableModel data = new DefaultTableModel(null, header);
        
        tableSiswa.setModel(data);

        TableColumnModel columns = tableSiswa.getColumnModel();
        columns.getColumn(0).setMinWidth(50);
        columns.getColumn(1).setMinWidth(150);
        columns.getColumn(2).setMinWidth(100);
        columns.getColumn(3).setMinWidth(100);
        columns.getColumn(4).setMinWidth(150);
        columns.getColumn(5).setMinWidth(150);
        columns.getColumn(6).setMinWidth(50);
        columns.getColumn(7).setMinWidth(150);

        try {
            Connection kon = MysqlKonek.koneksiDb();
            Statement st = (Statement) kon.createStatement();
            ResultSet rs = st.executeQuery(sql_data);
            while (rs.next()) {
                String d1 = rs.getString(1);
                String d2 = rs.getString(2);
                String d3 = rs.getString(3);
                String d4 = rs.getString(4);
                String d5 = rs.getString(5);
                String d6 = rs.getString(6);
                String d7 = rs.getString(7);
                String d8 = rs.getString(8);

                String d[] = {d1, d2, d3, d4, d5, d6, d7, d8};
                data.addRow(d);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //Input data dari form ke Database MySql
    private void inputEditData(String sql_comm) throws SQLException, ClassNotFoundException {              
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = (Connection) DriverManager.getConnection(JDBC_URL,"root","")) {
                Statement st = (Statement)conn.createStatement();
                st.executeUpdate(sql_comm);
                JOptionPane.showMessageDialog(null, "Simpan Sukses");
            }
            clearInputs();
            loadDataTable();
        }catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    
    //Membersihkan input form
    private void clearInputs() {
        edtNisn.setText("");
        edtNama.setText("");
        dateChoose.setDate(null);
        jenisKelaminGroup.clearSelection();
        edtKotaLahir.setText("");
        edtAlamat.setText("");
        edtNik.setText("");
        edtOrtu.setText("");
        
        btnSimpan.setEnabled(true);
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
    }
    
    //Cek kesamaan NISN
    private boolean cekNisn() throws SQLException {
       boolean nisnAda = false;
       String cek = "SELECT * FROM tb_siswa WHERE nisn_siswa = '" + edtNisn.getText() + "'";
       try{
        Connection kon = MysqlKonek.koneksiDb();
        Statement st = (Statement) kon.createStatement();
        ResultSet rs = st.executeQuery(cek);
            if(rs.next()) {
                nisnAda = true;
            }
       }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return nisnAda;
    }
    
    //Siapkan data untuk di Edit
    private void putDataToForm() throws SQLException {
        String sql_data = "SELECT * FROM tb_siswa WHERE nisn_siswa = '" + edtNisn.getText() + "'";

        Connection conn = MysqlKonek.koneksiDb();
        Statement st = (Statement) conn.createStatement();
        ResultSet rs = st.executeQuery(sql_data);
        while(rs.next()) {
            edtNama.setText(rs.getString(2));
            
            if(rs.getString(3).equalsIgnoreCase("Laki-Laki")) {
                rbLaki.setSelected(true);
            }else{
                rbPerem.setSelected(true);
            }
           
            dateChoose.setDate(rs.getDate(4)); 
            edtKotaLahir.setText(rs.getString(5));
            edtAlamat.setText(rs.getString(6));
            edtNik.setText(rs.getString(7));
            edtOrtu.setText(rs.getString(8));
        }
    } 
    
    //Hapus data
    private void delSelectedData() throws SQLException {       
        int jawab = JOptionPane.showConfirmDialog(null,"Data Akan Dihapus ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(jawab == 0) {
            String sql_data = "DELETE FROM tb_siswa WHERE nisn_siswa = '" + edtNisn.getText() + "'";
            Connection conn = MysqlKonek.koneksiDb();
            Statement st = (Statement) conn.createStatement();
            st.executeUpdate(sql_data);
            JOptionPane.showMessageDialog(null,"Data Berhasil di Hapus");
            
            loadDataTable();
            clearInputs();
        }
    }
    
    
    
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTutup;
    private com.toedter.calendar.JDateChooser dateChoose;
    private javax.swing.JTextArea edtAlamat;
    private javax.swing.JTextField edtKotaLahir;
    private javax.swing.JTextField edtNama;
    private javax.swing.JTextField edtNik;
    private javax.swing.JTextField edtNisn;
    private javax.swing.JTextField edtOrtu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.ButtonGroup jenisKelaminGroup;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerem;
    private javax.swing.JTable tableSiswa;
    // End of variables declaration//GEN-END:variables
}
