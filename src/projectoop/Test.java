package projectoop;

import entities.Grades;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import net.proteanit.sql.DbUtils;

public class Test extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Grades grade;
    
    public Test() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        T2 = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAddRow = new javax.swing.JButton();
        btnRemoveRow = new javax.swing.JButton();
        btnAddGrades = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        A = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "SYEAR", "SEMESTER", "STUDENT_NO", "SUBJECT_CODE", "BLOCK_NO", "GRADE"
            }
        ));
        jScrollPane1.setViewportView(T1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 420));

        T2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(T2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        btnAddRow.setText("Add Row");
        btnAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRowActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        btnRemoveRow.setText("Remove Row");
        btnRemoveRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveRowActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoveRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        btnAddGrades.setText("Add grades");
        btnAddGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGradesActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        display();
        initTblGrades();
    }//GEN-LAST:event_formWindowActivated

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // need JOPTIONPANE
        // applies overwritten values only when mouse clicked outside table
        // implement several error catching
        // apply combobx for appropriate columns sa table upon selecting
        // use 'grades' entity class
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to UPDATE selected records?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){
            try {
                ps = conn.prepareStatement("UPDATE plm.grades SET "
                        + "syear = ?, "
                        + "semester = ?, "
                        + "student_no = ?,"
                        + "subject_code = ?, "
                        + "block_no = ?, "
                        + "grade = ? "
                        + " WHERE "
                        + "syear = ? AND " // filter catch need
                        + "semester = ? AND "
                        + "student_no = ? AND "
                        + "subject_code = ? AND "
                        + "block_no = ?");

                for (int row = 0; row < T2.getRowCount(); ++row){
                    for (int col = 0; col < T2.getColumnCount(); ++col){
                        Object obj = T2.getValueAt(row, col);
                        ps.setObject(col+1, obj);
                        switch (col){
                            case 0:
                                ps.setObject(7, obj);
                                break;
                            case 1:
                                ps.setObject(8, obj);
                                break;
                            case 2:
                                ps.setObject(9, obj);
                                break;
                            case 3:
                                ps.setObject(10, obj);
                                break;
                            case 4:
                                ps.setObject(11, obj);
                                break;
                        }
                    }
                    ps.executeUpdate();
                }
                display();
                JOptionPane.showMessageDialog(null, "Grades updated successfully.");
            } catch (SQLSyntaxErrorException e) { 
                JOptionPane.showMessageDialog(null, "Please input a valid number for grade.");
            } catch (Exception e){
                e.printStackTrace();  
            }
        } else 
            JOptionPane.showMessageDialog(null, "Update was aborted.");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to DELETE selected records?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){            
            try {            
                ps = conn.prepareStatement("DELETE FROM plm.grades WHERE "
                        + "syear = ? AND "
                        + "semester = ? AND "
                        + "student_no = ? AND "
                        + "subject_code = ? AND "
                        + "block_no = ?");


                int[] c = T2.getSelectedRows();
                for (int a : c){
                    ps.setObject(1, T2.getValueAt(a, 0));
                    ps.setObject(2, T2.getValueAt(a, 1));
                    ps.setObject(3, T2.getValueAt(a, 2));
                    ps.setObject(4, T2.getValueAt(a, 3));
                    ps.setObject(5, T2.getValueAt(a, 4));
                    ps.executeUpdate();
                }
                display();
                JOptionPane.showMessageDialog(null, "Records deleted successfully.");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else 
            JOptionPane.showMessageDialog(null, "Deletion was aborted.");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRowActionPerformed
        DefaultTableModel model = (DefaultTableModel) T1.getModel();
        model.addRow(new Object[]{null, null, null, null, null}); // Adjust the array length      
    }//GEN-LAST:event_btnAddRowActionPerformed

    private void btnRemoveRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveRowActionPerformed
        DefaultTableModel model = (DefaultTableModel) T1.getModel();
        model.removeRow(T1.getRowCount()-1);
        // error: tries to remove even tho there's no row anymore java.lang.ArrayIndexOutOfBoundsException
        // pano kung yung want ko na iremove is nasa gitna ng mga rows?
    }//GEN-LAST:event_btnRemoveRowActionPerformed

    private void btnAddGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGradesActionPerformed
        // SQLIntegrityConstraintViolationException catches several errors... needs record integrity that will be identified by the system
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to ADD grades?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){
            try {
                ps = conn.prepareStatement("INSERT INTO grades (syear, semester, student_no, subject_code, block_no, grade) "
                        + "VALUES(?, ?, ?, ?, ?, ?)");

                for (int row = 0; row < T1.getRowCount(); ++row){
                    for (int col = 0; col < T1.getColumnCount(); ++col){
                        Object obj = T1.getValueAt(row, col);
                        ps.setObject(col+1, obj);
                    }
                    ps.executeUpdate();
                }
                display();
                
                DefaultTableModel model = (DefaultTableModel) T1.getModel();
                
                JOptionPane.showMessageDialog(null, "Grades added successfully.");

                for (int row = T1.getRowCount(); row > 0; --row){
                    model.removeRow(row-1);
                }
            } catch (SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "Please fill in the remaining blanks or remove them. "
                        + "Make sure the record does not exist yet. The student number should be valid.");
            } catch (SQLSyntaxErrorException e) { 
                JOptionPane.showMessageDialog(null, "Please input a valid number for grade.");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else
            JOptionPane.showMessageDialog(null, "Add grades aborted.");
    }//GEN-LAST:event_btnAddGradesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(T1.getRowCount());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // ADD
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to ADD record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("");
                
                ps.executeQuery();
                JOptionPane.showMessageDialog(null, "Record added successfully.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Please follow the format.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Add was aborted.");
        }
    }//GEN-LAST:event_AActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // UPDATE
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to UPDATE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("");
                
                ps.executeQuery();
                JOptionPane.showMessageDialog(null, "Record updated successfully.");
            } catch (SQLDataException e) {
                JOptionPane.showMessageDialog(null, "Please follow the format.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "UPDATE was aborted.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // DELETE
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to DELETE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("");
                
                ps.executeQuery();
                JOptionPane.showMessageDialog(null, "Record deleted successfully.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Deletion was aborted.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void display(){
        try {
            conn = ConnectDB.Connect();
            ps = conn.prepareStatement("SELECT * FROM plm.grades");
            rs = ps.executeQuery();
            T2.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void initTblGrades(){ // needs optimization
        ArrayList<String> sy = new ArrayList<>();
        ArrayList<String> sem = new ArrayList<>();
        ArrayList<String> subcode = new ArrayList<>();
        ArrayList<String> blockno = new ArrayList<>();
        JComboBox<String> syCMB = new JComboBox<>();
        JComboBox<String> semCMB = new JComboBox<>();
        JComboBox<String> subcodeCMB = new JComboBox<>();
        JComboBox<String> blocknoCMB = new JComboBox<>();        
        
        try {
            ps = conn.prepareStatement("SELECT syear FROM plm.schoolyear");
            rs = ps.executeQuery();
            while(rs.next())
                sy.add(rs.getString("syear"));
            for (String val : sy){
                syCMB.addItem(val);
            }
            TableColumn syColumn = T1.getColumnModel().getColumn(0);
            syColumn.setCellEditor(new DefaultCellEditor(syCMB));
            
            ps = conn.prepareStatement("SELECT semester FROM plm.semester");
            rs = ps.executeQuery();
            while(rs.next())
                sem.add(rs.getString("semester"));
            for (String val : sem){
                semCMB.addItem(val);
            }
            TableColumn semColumn = T1.getColumnModel().getColumn(1);
            semColumn.setCellEditor(new DefaultCellEditor(semCMB));

            ps = conn.prepareStatement("SELECT subject_code FROM plm.subject");
            rs = ps.executeQuery();
            while(rs.next())
                subcode.add(rs.getString("subject_code"));
            for (String val : subcode){
                subcodeCMB.addItem(val);
            }
            TableColumn subcodeColumn = T1.getColumnModel().getColumn(3);
            subcodeColumn.setCellEditor(new DefaultCellEditor(subcodeCMB));

            ps = conn.prepareStatement("SELECT block_no FROM plm.subject_schedule");
            rs = ps.executeQuery();
            while(rs.next())
                blockno.add(rs.getString("block_no"));
            for (String val : blockno){
                blocknoCMB.addItem(val);
            }
            TableColumn blocknoColumn = T1.getColumnModel().getColumn(4);
            blocknoColumn.setCellEditor(new DefaultCellEditor(blocknoCMB));
            
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JTable T1;
    private javax.swing.JTable T2;
    private javax.swing.JButton btnAddGrades;
    private javax.swing.JButton btnAddRow;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRemoveRow;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
