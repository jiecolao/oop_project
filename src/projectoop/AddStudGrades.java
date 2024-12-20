package projectoop;

import entities.Grades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

public class AddStudGrades extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Grades grade;
    
    public AddStudGrades() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDraft = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        lblsgDraft = new javax.swing.JLabel();
        lblsgResult = new javax.swing.JLabel();
        lblsgSearch = new javax.swing.JLabel();
        txtsgStudentNo = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRemoveRow = new javax.swing.JButton();
        btnAddRow = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnAddGrades = new javax.swing.JButton();
        lblsgArrow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Student Grades");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDraft.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "SYEAR", "SEMESTER", "STUDENT_NO", "SUBJECT_CODE", "BLOCK_NO", "GRADE"
            }
        ));
        jScrollPane1.setViewportView(tblDraft);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 460));

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblResult);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, 460));

        lblsgDraft.setText("DRAFT:");
        getContentPane().add(lblsgDraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblsgResult.setText("RESULT:");
        getContentPane().add(lblsgResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 60, -1));

        lblsgSearch.setText("Search Student No:");
        getContentPane().add(lblsgSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));
        getContentPane().add(txtsgStudentNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 110, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        btnRemoveRow.setText("Remove row");
        btnRemoveRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveRowActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoveRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 100, -1));

        btnAddRow.setText("ADD ROW");
        btnAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRowActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 120, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, -1, -1));

        btnAddGrades.setText("ADD");
        btnAddGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGradesActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 60, -1));

        lblsgArrow.setText(">>>");
        getContentPane().add(lblsgArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 30, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveRowActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) tblDraft.getModel();
            model.removeRow(tblDraft.getRowCount()-1);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            
        } catch (Exception e){
            e.printStackTrace();
        }
        // error: tries to remove even tho there's no row anymore java.lang.ArrayIndexOutOfBoundsException
        // pano kung yung want ko na iremove is nasa gitna ng mga rows?
    }//GEN-LAST:event_btnRemoveRowActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (!txtsgStudentNo.getText().trim().isBlank()){
            try {
                ps = conn.prepareStatement("SELECT * FROM grades WHERE student_no = ?");
                ps.setObject(1, txtsgStudentNo.getText().trim());
                rs = ps.executeQuery();
                if (rs.next()){
                    rs = ps.executeQuery();
                    tblResult.setModel(DbUtils.resultSetToTableModel(rs));
                } else {
                    JOptionPane.showMessageDialog(null, "No record found for \"" + txtsgStudentNo.getText().trim() + "\"");
                    txtsgStudentNo.setText("");
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        } else
            JOptionPane.showMessageDialog(null, "Please input a student number. " + txtsgStudentNo.getText().trim());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        refresh();
        initTblGrades();
    }//GEN-LAST:event_formWindowActivated

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refresh();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRowActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblDraft.getModel();
        model.addRow(new Object[]{null, null, null, null, null});    
    }//GEN-LAST:event_btnAddRowActionPerformed

    private void btnAddGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGradesActionPerformed
        // SQLIntegrityConstraintViolationException catches several errors... needs record integrity that will be identified by the system
        // logic error: walang error fetch kapag walang row available
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to ADD grades?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){
            try {
                ps = conn.prepareStatement("INSERT INTO grades (syear, semester, student_no, subject_code, block_no, grade) "
                        + "VALUES(?, ?, ?, ?, ?, ?)");

                for (int row = 0; row < tblDraft.getRowCount(); ++row){
                    for (int col = 0; col < tblDraft.getColumnCount(); ++col){
                        Object obj = tblDraft.getValueAt(row, col);
                        ps.setObject(col+1, obj);
                    }
                    ps.executeUpdate();
                }

                refresh();

                DefaultTableModel model = (DefaultTableModel) tblDraft.getModel();

                JOptionPane.showMessageDialog(null, "Grades added successfully.");

                for (int row = tblDraft.getRowCount(); row > 0; --row){
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

    public void refresh(){
        try {
            conn = ConnectDB.Connect();
            ps = conn.prepareStatement("SELECT * FROM plm.grades");
            rs = ps.executeQuery();
            tblResult.setModel(DbUtils.resultSetToTableModel(rs));
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
            TableColumn syColumn = tblDraft.getColumnModel().getColumn(0);
            syColumn.setCellEditor(new DefaultCellEditor(syCMB));
            
            ps = conn.prepareStatement("SELECT semester FROM plm.semester");
            rs = ps.executeQuery();
            while(rs.next())
                sem.add(rs.getString("semester"));
            for (String val : sem){
                semCMB.addItem(val);
            }
            TableColumn semColumn = tblDraft.getColumnModel().getColumn(1);
            semColumn.setCellEditor(new DefaultCellEditor(semCMB));

            ps = conn.prepareStatement("SELECT subject_code FROM plm.subject");
            rs = ps.executeQuery();
            while(rs.next())
                subcode.add(rs.getString("subject_code"));
            for (String val : subcode){
                subcodeCMB.addItem(val);
            }
            TableColumn subcodeColumn = tblDraft.getColumnModel().getColumn(3);
            subcodeColumn.setCellEditor(new DefaultCellEditor(subcodeCMB));

            ps = conn.prepareStatement("SELECT block_no FROM plm.subject_schedule");
            rs = ps.executeQuery();
            while(rs.next())
                blockno.add(rs.getString("block_no"));
            for (String val : blockno){
                blocknoCMB.addItem(val);
            }
            TableColumn blocknoColumn = tblDraft.getColumnModel().getColumn(4);
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
            java.util.logging.Logger.getLogger(AddStudGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddGrades;
    private javax.swing.JButton btnAddRow;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemoveRow;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblsgArrow;
    private javax.swing.JLabel lblsgDraft;
    private javax.swing.JLabel lblsgResult;
    private javax.swing.JLabel lblsgSearch;
    private javax.swing.JTable tblDraft;
    private javax.swing.JTable tblResult;
    private javax.swing.JTextField txtsgStudentNo;
    // End of variables declaration//GEN-END:variables
}
