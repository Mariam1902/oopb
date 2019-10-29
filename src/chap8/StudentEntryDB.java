/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap8;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author papercut
 */
public class StudentEntryDB extends javax.swing.JPanel {

    DefaultTableModel model;
    MySQLDB myDB;
    int select;
    String id, name, surName;

    /**
     * Creates new form StudentEntry
     */
    public StudentEntryDB() {
        initComponents();
        model = (DefaultTableModel) tblData.getModel();
        myDB = new MySQLDB();
        loadStudentData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDalete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentID", "Name", "Suename"
            }
        ));
        jScrollPane2.setViewportView(tblData);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("InputData"));

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Surname");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId)
                    .addComponent(txtName)
                    .addComponent(txtSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDalete.setText("Dalete");
        btnDalete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaleteActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDalete)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDalete)
                    .addComponent(btnExit))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaleteActionPerformed
        // TODO add your handling code here:
        String message =  "Do you want to delete ?";
        String title = "Confirm delete";
        int selectedRow = tblData.getSelectedRow();
        if (tblData.getSelectedRow() >= 0) {
            int option = JOptionPane.showConfirmDialog(this, message);
            if (option == JOptionPane.YES_OPTION) {
                String id = tblData.getValueAt(selectedRow, 0).toString();
                String delSql = "delete from Student WHERE Id = '"+id+"'";
                int delRow = myDB.stmtCreInsUpdDel(delSql);
                if (delRow > 0) {
                    model.removeRow(tblData.getSelectedRow());
                    clearTextField();
                } else {
                    JOptionPane.showMessageDialog(this, "ไม่สามารถลบได้");
                }
            } else {
                JOptionPane.showMessageDialog(this, "เลือกแถวข้อมูลที่ต้องการลบ");
            }
        } else {
            JOptionPane.showConfirmDialog(this, "Plese select row before Delete");
        }

    }//GEN-LAST:event_btnDaleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText();
        String name = txtName.getText();
        String surname = txtSurname.getText();
        if (!id.equals("") && !name.equals("") && !surname.equals("")) {
            String[] rowData = {id, name, surname};
            String insSql = "insert into Student values('" + id + "','" + name + "','" + surname + "')";
            int insRow = myDB.stmtCreInsUpdDel(insSql);
            if (insRow > 0) {
                model.addRow(rowData);
            } else {
                JOptionPane.showMessageDialog(this, "ไม่สามารถเพิ่มข้อมูลได้ \nรหัสนักศึกษา [" + txtId.getText() + "] ซ้ำ");
            }
            clearTextField();
        } else {
            JOptionPane.showConfirmDialog(this, "กรุณาป้อนข้อมูลก่อนกดปุ่ม Add");
            clearTextField();
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
                String message = "คุณต้องการออกจากโปรแกรมหรือไม่ ?";
        String title = "ยืนยันการออกจากโปรแกรม";
        int option = JOptionPane.showConfirmDialog(null, message, title, 					 JOptionPane.YES_NO_CANCEL_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        }

    }//GEN-LAST:event_btnExitActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int select = 0;
        String id, name, surname;
        String name_upd, surName_upd;
        if (tblData.getSelectedRow() >= 0) {
            select = tblData.getSelectedRow();
            id = tblData.getValueAt(select, 0).toString();
            name_upd = txtName.getText();
            surName_upd = txtSurname.getText();
            String updSql = "update Student"
                    + " set name = '" + name_upd + "',"
                    + " surname = '" + surName_upd + "'"
                    + " WHERE id = '" + id + "'";
            System.out.println("updSql = " + updSql);
            int updRow = myDB.stmtCreInsUpdDel(updSql);
            if (updRow > 0) {
                tblData.setValueAt(name_upd, select, 1);
                tblData.setValueAt(surName_upd, select, 2);
                clearTextField();
            } else {
                JOptionPane.showMessageDialog(this, "Can not Update");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select row");
        }


    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDalete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
