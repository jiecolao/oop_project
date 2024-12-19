package projectoop;

import java.sql.*;

import net.proteanit.sql.DbUtils;

public class Test extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
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
        btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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

        btn.setText("jButton1");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        display();
    }//GEN-LAST:event_formWindowActivated

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // need JOPTIONPANE
        try {
            ps = conn.prepareStatement("UPDATE plm.grades SET "
                    + "syear = ?, "
                    + "semester = ?, "
                    + "student_no = ?,"
                    + "subject_code = ?, "
                    + "block_no = ?, "
                    + "grade = ? "
                    + " WHERE "
                    + "syear = ? AND "
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
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // need JOPTIONPANE
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
            System.out.println("Records Deleted Succesfully");
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JTable T1;
    private javax.swing.JTable T2;
    private javax.swing.JButton btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
