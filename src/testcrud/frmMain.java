/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Widya
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNIS = new javax.swing.JTextField();
        txtKelas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTanggalLahir = new javax.swing.JTextField();
        txtNoTelp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTempatLahir = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        bEdit = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM BIODATA SISWA SMK TELKOM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 13, 720, 70);

        jLabel2.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Informatic Schools");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 300, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1220, 120);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("ISIAN DATA SISWA"));
        jPanel2.setLayout(null);

        jLabel3.setText("Alamat");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 680, 179, 32);

        jLabel4.setText("NIS");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 30, 179, 32);

        jLabel5.setText("Nama");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 110, 179, 32);

        jLabel6.setText("Tempat Lahir");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 190, 179, 32);

        jLabel7.setText("Kelas");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 440, 179, 32);

        jLabel8.setText("Email");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 600, 179, 32);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(20, 630, 260, 40);
        jPanel2.add(txtNIS);
        txtNIS.setBounds(20, 60, 260, 40);
        jPanel2.add(txtKelas);
        txtKelas.setBounds(20, 470, 260, 40);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 710, 260, 80);

        buttonGroup1.add(rbLaki);
        rbLaki.setText("Laki - laki");
        jPanel2.add(rbLaki);
        rbLaki.setBounds(20, 390, 120, 40);

        buttonGroup1.add(rbPerempuan);
        rbPerempuan.setText("Perempuan");
        jPanel2.add(rbPerempuan);
        rbPerempuan.setBounds(160, 390, 120, 40);

        jLabel9.setText("Jenis Kelamin");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 350, 179, 32);
        jPanel2.add(txtNama);
        txtNama.setBounds(20, 140, 260, 40);

        jLabel10.setText("Tanggal Lahir");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 270, 179, 32);
        jPanel2.add(txtTanggalLahir);
        txtTanggalLahir.setBounds(20, 300, 260, 40);
        jPanel2.add(txtNoTelp);
        txtNoTelp.setBounds(20, 550, 260, 40);

        jLabel11.setText("No.Telp");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 520, 179, 32);
        jPanel2.add(txtTempatLahir);
        txtTempatLahir.setBounds(20, 220, 260, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 130, 310, 820);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setLayout(null);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "TempatLahir", "TanggalLahir", "JenisKelamin", "Kelas", "No.Telp", "Email", "Alamat"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(12, 13, 860, 690);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(330, 230, 880, 720);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(null);

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });
        jPanel3.add(bEdit);
        bEdit.setBounds(720, 30, 130, 40);

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        jPanel3.add(bSave);
        bSave.setBounds(20, 30, 130, 40);

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(bDelete);
        bDelete.setBounds(200, 30, 130, 40);

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });
        jPanel3.add(bClear);
        bClear.setBounds(370, 30, 130, 40);

        jButton6.setText("Refresh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(550, 30, 130, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(330, 130, 880, 90);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 1220, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        int baris = tblData.getSelectedRow();
        if(baris != 1){
            String NIS = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS = '"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            
            if (status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus","Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        if ("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText()) ||
            "".equals(txtKelas.getText()) || "".equals(txtNama.getText()) ||
            "".equals(txtEmail.getText()) || "".equals(txtTempatLahir.getText()) 
                || "".equals(txtTanggalLahir.getText()) || "".equals(txtNoTelp.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error" , JOptionPane.WARNING_MESSAGE);
        } else {
            String JK = "";
            if (rbLaki.isSelected()) {
                JK = "L";
            } else {
                JK = "P";
            }
            String SQL = " INSERT INTO t_siswa (NIS, NamaSiswa, TempatLahir, TanggalLahir, JenisKelamin, Kelas, No_Telp, Email, Alamat)"
            + "VALUES('"+txtNIS.getText() +"','"+txtNama.getText()+"','"+txtTempatLahir.getText()+"','"+txtTanggalLahir.getText()+"','"+JK+"','"+txtKelas.getText()+"','"+txtNoTelp.getText()+"','"+txtEmail.getText()+"','"+txtAlamat.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if(status==1) {
                JOptionPane.showMessageDialog(this,"Data berhasil ditambahkan","Sukses",JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this,"Data gagal ditambahkan","Gagal",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_bSaveActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        txtNama.setText("");
        txtNIS.setText("");
        txtTempatLahir.setText("");
        txtTanggalLahir.setText("");
        txtKelas.setText("");
        txtNoTelp.setText("");
        buttonGroup1.clearSelection();
        txtEmail.setText("");
        txtAlamat.setText("");
    }//GEN-LAST:event_bClearActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        selectData();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        if("".equals(txtNIS.getText()) || "".equals(txtNama.getText()) || "".equals(txtTempatLahir.getText()) 
                ||"".equals(txtTanggalLahir.getText())  || "".equals(txtKelas.getText()) || 
                "".equals(txtNoTelp.getText()) ||"".equals(txtEmail.getText()) 
                ||"".equals(txtAlamat.getText()))    {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data","Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String JK ="";
            if(rbLaki.isSelected()) {
                JK="L";
            } else {
                JK = "P";
            }
            
            String SQL = "UPDATE `t_siswa` SET `NIS`="+txtNIS.getText()+
                    ",`NamaSiswa`='"+txtNama.getText()+"',`JenisKelamin`='"+JK+
                    "',`Kelas`='"+txtKelas.getText()+"',`Email`='"+txtEmail.getText()+
                    "',`TempatLahir`='"+txtTempatLahir.getText()+"',`TanggalLahir`='"+txtTanggalLahir.getText()+
                    "',`Alamat`='"+txtAlamat.getText()+"',`No_Telp`='"+txtNoTelp.getText()+"' WHERE `NIS`="+txtNIS.getText();

                    //"UPDATE `t_siswa` SET" 
                   // + "WHERE `NamaSiswa`'"+txtNama.getText()+"',"+"WHERE JenisKelamin='"+JK+"',"
                   // + "WHERE Kelas='"+txtKelas.getText()+"',"+"WHERE Email='"+txtEmail.getText()+"',"
                   // + "WHERE NIS='"+txtNIS.getText()+"',"+"WHERE TempatLahir='"+txtTempatLahir.getText()+"',"
                   // + "WHERE TanggalLahir='"+txtTanggalLahir.getText()+"',"+"WHERE No_Telp='"+txtNoTelp.getText()+"'";
            int status = KoneksiDB.execute(SQL);
            if(status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_bEditActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
    int baris = tblData.getSelectedRow();
    if (baris != -1){
        txtNIS.setText(tblData.getValueAt(baris, 0).toString());
        txtNama.setText(tblData.getValueAt(baris, 1).toString());
        txtTempatLahir.setText(tblData.getValueAt(baris, 2).toString());
        txtTanggalLahir.setText(tblData.getValueAt(baris, 3).toString());
        if("Laki-laki".equals(tblData.getValueAt(baris, 4).toString())){
        rbLaki.setSelected(true);
    }else { rbPerempuan.setSelected(true);}
    }
        txtKelas.setText(tblData.getValueAt(baris, 5).toString());
        txtNoTelp.setText(tblData.getValueAt(baris, 6).toString());
        txtEmail.setText(tblData.getValueAt(baris, 7).toString());
        txtAlamat.setText(tblData.getValueAt(baris, 8).toString());
    }//GEN-LAST:event_tblDataMouseClicked

    public void selectData() {
        String kolom[] = {"NIS","NamaSiswa","TempatLahir","TanggalLahir","JenisKelamin","Kelas","No_Telp","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        
        try{
            while (rs.next()) {
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String TempatLahir = rs.getString(3);
                String TanggalLahir = rs.getString(4);
                String JenisKelamin = "";
                if("L".equals(rs.getString(5))) {
                    JenisKelamin = "Laki-laki";
                } else {
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(6);
                String No_Telp = rs.getString(7);
                String Email = rs.getString(8);
                String Alamat = rs.getString(9);
                String data[] = {NIS,NamaSiswa,TempatLahir,TanggalLahir,JenisKelamin,Kelas,No_Telp,Email,Alamat};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
                        Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null,ex);
                    }
            tblData.setModel(dtm);  
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JTextField txtTanggalLahir;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables

    
}
