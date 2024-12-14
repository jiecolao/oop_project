package projectoop;

import java.sql.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import net.proteanit.sql.DbUtils;


public class MainScreen extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public MainScreen() {
        initComponents();
        
        // FOR MAINSCREEN STARTING VIEW
        pnlViews.setVisible(true);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFramebg = new javax.swing.JPanel();
        pnlHeaderbg = new javax.swing.JPanel();
        lblHeaderTitle = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        pnlNavbar = new javax.swing.JPanel();
        btnViews = new javax.swing.JButton();
        btnSubSched = new javax.swing.JButton();
        btnStudGrades = new javax.swing.JButton();
        pnlViews = new javax.swing.JPanel();
        pnlViewsHeader = new javax.swing.JPanel();
        tabbViewsNav = new javax.swing.JTabbedPane();
        pnlSubSchedView = new javax.swing.JPanel();
        pnlSubSchedSearch = new javax.swing.JPanel();
        lblSubSchedSearch = new javax.swing.JLabel();
        txtSubSchedSearch = new javax.swing.JTextField();
        btnSubSchedSearch = new javax.swing.JButton();
        scrllSubSChedView = new javax.swing.JScrollPane();
        tblSubSChedView = new javax.swing.JTable();
        pnlStudGradesViews = new javax.swing.JPanel();
        pnlStudGradesSearch = new javax.swing.JPanel();
        lblStudGradesSearch = new javax.swing.JLabel();
        txtStudGradesSearch = new javax.swing.JTextField();
        btnStudGradesSearch = new javax.swing.JButton();
        scrllStudGradesView = new javax.swing.JScrollPane();
        tblStudGradesView = new javax.swing.JTable();
        pnlSubSched = new javax.swing.JPanel();
        pnlSubSchedInfo = new javax.swing.JPanel();
        lblssSchoolYear = new javax.swing.JLabel();
        lblssSemester = new javax.swing.JLabel();
        lblssCollegeCode = new javax.swing.JLabel();
        lblssSubjectCode = new javax.swing.JLabel();
        lblssDay = new javax.swing.JLabel();
        lblssTime = new javax.swing.JLabel();
        lblssType = new javax.swing.JLabel();
        lblssRoom = new javax.swing.JLabel();
        lblssSequenceNo = new javax.swing.JLabel();
        lblssEmployeeID = new javax.swing.JLabel();
        txtssSchoolYear = new javax.swing.JTextField();
        txtssTime = new javax.swing.JTextField();
        txtssRoom = new javax.swing.JTextField();
        cmbssSemester = new javax.swing.JComboBox<>();
        cmbssCollegeCode = new javax.swing.JComboBox<>();
        cmbssSubjectCode = new javax.swing.JComboBox<>();
        cmbssDay = new javax.swing.JComboBox<>();
        cmbssType = new javax.swing.JComboBox<>();
        cmbssSequenceNo = new javax.swing.JComboBox<>();
        cmbssEmployeeID = new javax.swing.JComboBox<>();
        pnlSubSchedBtns = new javax.swing.JPanel();
        btnSubSchedAdd = new javax.swing.JButton();
        btnSubSchedUpdate = new javax.swing.JButton();
        btnSubSchedDelete = new javax.swing.JButton();
        scrllSubSched = new javax.swing.JScrollPane();
        tblSubSched = new javax.swing.JTable();
        pnlStudGrades = new javax.swing.JPanel();
        pnlStudGradesInfo = new javax.swing.JPanel();
        lblsgSchoolYear = new javax.swing.JLabel();
        lblsgSemester = new javax.swing.JLabel();
        lblsgCollegeCode = new javax.swing.JLabel();
        lblsgStudentNumber = new javax.swing.JLabel();
        lblsgBlockNumber = new javax.swing.JLabel();
        lblsgGrades = new javax.swing.JLabel();
        txtsgSchoolYear = new javax.swing.JTextField();
        txtsgStudentNumber = new javax.swing.JTextField();
        cmbsgSemester = new javax.swing.JComboBox<>();
        cmbsgCollegeCode = new javax.swing.JComboBox<>();
        cmbsgBlockNumber = new javax.swing.JComboBox<>();
        cmbsgGrades = new javax.swing.JComboBox<>();
        pnlStudGradesBtns = new javax.swing.JPanel();
        btnStudGradesAdd = new javax.swing.JButton();
        btnStudGradesUpdate = new javax.swing.JButton();
        btnStudGradesDelete = new javax.swing.JButton();
        scrllStudGrades = new javax.swing.JScrollPane();
        tblStudGrades = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFramebg.setBackground(new java.awt.Color(204, 204, 255));
        pnlFramebg.setMinimumSize(new java.awt.Dimension(1080, 720));
        pnlFramebg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeaderbg.setBackground(new java.awt.Color(153, 153, 255));
        pnlHeaderbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeaderTitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        lblHeaderTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblHeaderTitle.setText("HEADER");
        pnlHeaderbg.add(lblHeaderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 275, 44));

        lblDate.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 0));
        lblDate.setText("January 01, 2000");
        pnlHeaderbg.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, 19));

        lblTime.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 0, 0));
        lblTime.setText("12:00:00");
        pnlHeaderbg.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, 19));

        pnlFramebg.add(pnlHeaderbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 870, 80));

        pnlNavbar.setBackground(new java.awt.Color(102, 153, 255));
        pnlNavbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViews.setBackground(new java.awt.Color(102, 153, 255));
        btnViews.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnViews.setForeground(new java.awt.Color(0, 0, 0));
        btnViews.setText("Views");
        btnViews.setOpaque(true);
        btnViews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewsActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnViews, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 249, 210, 60));

        btnSubSched.setBackground(new java.awt.Color(102, 153, 255));
        btnSubSched.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSubSched.setForeground(new java.awt.Color(0, 0, 0));
        btnSubSched.setText("Schedule");
        btnSubSched.setOpaque(true);
        btnSubSched.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubSchedActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnSubSched, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 309, 210, 60));

        btnStudGrades.setBackground(new java.awt.Color(102, 153, 255));
        btnStudGrades.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnStudGrades.setForeground(new java.awt.Color(0, 0, 0));
        btnStudGrades.setText("Grades");
        btnStudGrades.setOpaque(true);
        btnStudGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudGradesActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnStudGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 369, 210, 60));

        pnlFramebg.add(pnlNavbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 720));

        pnlViews.setBackground(new java.awt.Color(51, 255, 51));
        pnlViews.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlViewsHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlViews.add(pnlViewsHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 120));

        tabbViewsNav.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tabbViewsNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbViewsNavMouseClicked(evt);
            }
        });

        pnlSubSchedView.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        pnlSubSchedView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSubSchedSearch.setBackground(new java.awt.Color(204, 204, 255));
        pnlSubSchedSearch.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        pnlSubSchedSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSubSchedSearch.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblSubSchedSearch.setText("Search ID  :");
        pnlSubSchedSearch.add(lblSubSchedSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 70, 20));

        txtSubSchedSearch.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtSubSchedSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlSubSchedSearch.add(txtSubSchedSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 180, -1));

        btnSubSchedSearch.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnSubSchedSearch.setText("Search");
        btnSubSchedSearch.setMaximumSize(new java.awt.Dimension(72, 20));
        btnSubSchedSearch.setMinimumSize(new java.awt.Dimension(72, 20));
        btnSubSchedSearch.setPreferredSize(new java.awt.Dimension(72, 20));
        btnSubSchedSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubSchedSearchActionPerformed(evt);
            }
        });
        pnlSubSchedSearch.add(btnSubSchedSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 80, -1));

        pnlSubSchedView.add(pnlSubSchedSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 60));

        tblSubSChedView.setModel(new javax.swing.table.DefaultTableModel(
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
        scrllSubSChedView.setViewportView(tblSubSChedView);

        pnlSubSchedView.add(scrllSubSChedView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 870, -1));

        tabbViewsNav.addTab("Subject Schedule", pnlSubSchedView);

        pnlStudGradesViews.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlStudGradesSearch.setBackground(new java.awt.Color(204, 204, 255));
        pnlStudGradesSearch.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        pnlStudGradesSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStudGradesSearch.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblStudGradesSearch.setText("Search ID  :");
        pnlStudGradesSearch.add(lblStudGradesSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 70, 20));

        txtStudGradesSearch.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStudGradesSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlStudGradesSearch.add(txtStudGradesSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 180, -1));

        btnStudGradesSearch.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnStudGradesSearch.setText("Search");
        btnStudGradesSearch.setMaximumSize(new java.awt.Dimension(72, 20));
        btnStudGradesSearch.setMinimumSize(new java.awt.Dimension(72, 20));
        btnStudGradesSearch.setPreferredSize(new java.awt.Dimension(72, 20));
        pnlStudGradesSearch.add(btnStudGradesSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 80, 20));

        pnlStudGradesViews.add(pnlStudGradesSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 60));

        tblStudGradesView.setModel(new javax.swing.table.DefaultTableModel(
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
        scrllStudGradesView.setViewportView(tblStudGradesView);

        pnlStudGradesViews.add(scrllStudGradesView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 870, -1));

        tabbViewsNav.addTab("Student Grades", pnlStudGradesViews);

        pnlViews.add(tabbViewsNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 870, 520));
        tabbViewsNav.getAccessibleContext().setAccessibleName("");

        pnlFramebg.add(pnlViews, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 870, 640));

        pnlSubSched.setBackground(new java.awt.Color(204, 204, 255));
        pnlSubSched.setMinimumSize(new java.awt.Dimension(870, 640));
        pnlSubSched.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSubSchedInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), " Course Details ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlSubSchedInfo.setForeground(new java.awt.Color(0, 0, 0));
        pnlSubSchedInfo.setMinimumSize(new java.awt.Dimension(830, 200));
        pnlSubSchedInfo.setOpaque(false);
        pnlSubSchedInfo.setPreferredSize(new java.awt.Dimension(830, 200));
        pnlSubSchedInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblssSchoolYear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssSchoolYear.setForeground(new java.awt.Color(0, 0, 0));
        lblssSchoolYear.setText("School Year     :");
        lblssSchoolYear.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssSchoolYear.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 100, -1));

        lblssSemester.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssSemester.setForeground(new java.awt.Color(0, 0, 0));
        lblssSemester.setText("Semester        :");
        lblssSemester.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssSemester.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, 100, -1));

        lblssCollegeCode.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssCollegeCode.setForeground(new java.awt.Color(0, 0, 0));
        lblssCollegeCode.setText("College Code  :");
        lblssCollegeCode.setMinimumSize(new java.awt.Dimension(80, 20));
        pnlSubSchedInfo.add(lblssCollegeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 115, 100, 20));

        lblssSubjectCode.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssSubjectCode.setForeground(new java.awt.Color(0, 0, 0));
        lblssSubjectCode.setText("Subject Code  :");
        lblssSubjectCode.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssSubjectCode.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssSubjectCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 100, -1));

        lblssDay.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssDay.setForeground(new java.awt.Color(0, 0, 0));
        lblssDay.setText("Day          :");
        lblssDay.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssDay.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 35, 70, -1));

        lblssTime.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssTime.setForeground(new java.awt.Color(0, 0, 0));
        lblssTime.setText("Time        :");
        lblssTime.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssTime.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 75, 70, -1));

        lblssType.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssType.setForeground(new java.awt.Color(0, 0, 0));
        lblssType.setText("Type        :");
        lblssType.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssType.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssType, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 115, 70, -1));

        lblssRoom.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssRoom.setForeground(new java.awt.Color(0, 0, 0));
        lblssRoom.setText(" Room     :");
        lblssRoom.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssRoom.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 155, 70, -1));

        lblssSequenceNo.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssSequenceNo.setForeground(new java.awt.Color(0, 0, 0));
        lblssSequenceNo.setText("Sequence No  :");
        lblssSequenceNo.setMinimumSize(new java.awt.Dimension(80, 20));
        pnlSubSchedInfo.add(lblssSequenceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 35, 100, -1));

        lblssEmployeeID.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssEmployeeID.setForeground(new java.awt.Color(0, 0, 0));
        lblssEmployeeID.setText("Employee ID   :");
        lblssEmployeeID.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssEmployeeID.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 75, 100, -1));

        txtssSchoolYear.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtssSchoolYear.setMinimumSize(new java.awt.Dimension(140, 20));
        txtssSchoolYear.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(txtssSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, 140, 20));

        txtssTime.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtssTime.setMinimumSize(new java.awt.Dimension(140, 20));
        txtssTime.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(txtssTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 75, 140, 20));
        txtssTime.getAccessibleContext().setAccessibleName("");

        txtssRoom.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtssRoom.setMinimumSize(new java.awt.Dimension(140, 20));
        txtssRoom.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(txtssRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 155, 140, 20));
        txtssRoom.getAccessibleContext().setAccessibleName("");

        cmbssSemester.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssSemester.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssSemester.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 75, 140, 20));

        cmbssCollegeCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssCollegeCode.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssCollegeCode.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssCollegeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 115, 140, 20));

        cmbssSubjectCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssSubjectCode.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssSubjectCode.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssSubjectCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 155, 140, 20));

        cmbssDay.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssDay.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssDay.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 35, 140, 20));

        cmbssType.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssType.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssType.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssType, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 115, 140, 20));
        cmbssType.getAccessibleContext().setAccessibleName("");

        cmbssSequenceNo.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssSequenceNo.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssSequenceNo.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssSequenceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 35, 140, 20));

        cmbssEmployeeID.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssEmployeeID.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssEmployeeID.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 75, 140, 20));

        pnlSubSched.add(pnlSubSchedInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 830, 200));

        pnlSubSchedBtns.setMinimumSize(new java.awt.Dimension(830, 40));
        pnlSubSchedBtns.setOpaque(false);
        pnlSubSchedBtns.setPreferredSize(new java.awt.Dimension(830, 40));
        pnlSubSchedBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubSchedAdd.setText("Add");
        pnlSubSchedBtns.add(btnSubSchedAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 120, 30));

        btnSubSchedUpdate.setText("Update");
        pnlSubSchedBtns.add(btnSubSchedUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 120, 30));

        btnSubSchedDelete.setText("Delete");
        pnlSubSchedBtns.add(btnSubSchedDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 120, 30));

        pnlSubSched.add(pnlSubSchedBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 830, 40));

        tblSubSched.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSubSched.setMinimumSize(new java.awt.Dimension(300, 80));
        scrllSubSched.setViewportView(tblSubSched);

        pnlSubSched.add(scrllSubSched, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 830, 400));

        pnlFramebg.add(pnlSubSched, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        pnlStudGrades.setBackground(new java.awt.Color(204, 204, 255));
        pnlStudGrades.setMinimumSize(new java.awt.Dimension(870, 640));
        pnlStudGrades.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlStudGrades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlStudGradesInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), " Course Details ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlStudGradesInfo.setForeground(new java.awt.Color(0, 0, 0));
        pnlStudGradesInfo.setMinimumSize(new java.awt.Dimension(830, 200));
        pnlStudGradesInfo.setOpaque(false);
        pnlStudGradesInfo.setPreferredSize(new java.awt.Dimension(830, 200));
        pnlStudGradesInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblsgSchoolYear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblsgSchoolYear.setForeground(new java.awt.Color(0, 0, 0));
        lblsgSchoolYear.setText("School Year     :");
        lblsgSchoolYear.setMinimumSize(new java.awt.Dimension(100, 20));
        lblsgSchoolYear.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlStudGradesInfo.add(lblsgSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, -1));

        lblsgSemester.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblsgSemester.setForeground(new java.awt.Color(0, 0, 0));
        lblsgSemester.setText("Semester        :");
        lblsgSemester.setMinimumSize(new java.awt.Dimension(100, 20));
        lblsgSemester.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlStudGradesInfo.add(lblsgSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, -1));

        lblsgCollegeCode.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblsgCollegeCode.setForeground(new java.awt.Color(0, 0, 0));
        lblsgCollegeCode.setText("College Code  :");
        lblsgCollegeCode.setMinimumSize(new java.awt.Dimension(100, 20));
        pnlStudGradesInfo.add(lblsgCollegeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 20));

        lblsgStudentNumber.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblsgStudentNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblsgStudentNumber.setText("Student Number  :");
        lblsgStudentNumber.setMinimumSize(new java.awt.Dimension(125, 20));
        lblsgStudentNumber.setPreferredSize(new java.awt.Dimension(125, 20));
        pnlStudGradesInfo.add(lblsgStudentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 125, -1));

        lblsgBlockNumber.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblsgBlockNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblsgBlockNumber.setText("Block Number   :");
        lblsgBlockNumber.setMinimumSize(new java.awt.Dimension(125, 20));
        lblsgBlockNumber.setPreferredSize(new java.awt.Dimension(125, 20));
        pnlStudGradesInfo.add(lblsgBlockNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 125, -1));

        lblsgGrades.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblsgGrades.setForeground(new java.awt.Color(0, 0, 0));
        lblsgGrades.setText("Grades  :");
        lblsgGrades.setMinimumSize(new java.awt.Dimension(60, 20));
        lblsgGrades.setPreferredSize(new java.awt.Dimension(60, 20));
        pnlStudGradesInfo.add(lblsgGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 50, 60, -1));

        txtsgSchoolYear.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtsgSchoolYear.setMinimumSize(new java.awt.Dimension(140, 20));
        txtsgSchoolYear.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlStudGradesInfo.add(txtsgSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 140, 20));

        txtsgStudentNumber.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtsgStudentNumber.setMinimumSize(new java.awt.Dimension(140, 20));
        txtsgStudentNumber.setPreferredSize(new java.awt.Dimension(150, 20));
        pnlStudGradesInfo.add(txtsgStudentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 50, 150, 20));

        cmbsgSemester.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbsgSemester.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbsgSemester.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlStudGradesInfo.add(cmbsgSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, 20));

        cmbsgCollegeCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbsgCollegeCode.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbsgCollegeCode.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlStudGradesInfo.add(cmbsgCollegeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, 20));

        cmbsgBlockNumber.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbsgBlockNumber.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbsgBlockNumber.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlStudGradesInfo.add(cmbsgBlockNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 100, 140, 20));

        cmbsgGrades.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbsgGrades.setMinimumSize(new java.awt.Dimension(100, 20));
        cmbsgGrades.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlStudGradesInfo.add(cmbsgGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 50, 100, 20));

        pnlStudGrades.add(pnlStudGradesInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 830, 200));

        pnlStudGradesBtns.setOpaque(false);
        pnlStudGradesBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStudGradesAdd.setText("Add");
        pnlStudGradesBtns.add(btnStudGradesAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 120, 30));

        btnStudGradesUpdate.setText("Update");
        pnlStudGradesBtns.add(btnStudGradesUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 120, 30));

        btnStudGradesDelete.setText("Delete");
        pnlStudGradesBtns.add(btnStudGradesDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 120, 30));

        pnlStudGrades.add(pnlStudGradesBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 830, 40));

        tblStudGrades.setModel(new javax.swing.table.DefaultTableModel(
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
        tblStudGrades.setMinimumSize(new java.awt.Dimension(300, 80));
        scrllStudGrades.setViewportView(tblStudGrades);

        pnlStudGrades.add(scrllStudGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 830, 400));

        pnlFramebg.add(pnlStudGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        getContentPane().add(pnlFramebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void refresh(){
        try {
            // sched view
            conn = ConnectDB.Connect();
            ps = conn.prepareStatement("SELECT * FROM plm.subject");
            rs = ps.executeQuery();
            tblSubSChedView.setModel(DbUtils.resultSetToTableModel(rs));
            
            // grade view
            ps = conn.prepareStatement("SELECT * FROM plm.grades");
            rs = ps.executeQuery();
            tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
        
            // schedule crud view
            ps = conn.prepareStatement("SELECT * FROM plm.subj_sched");
            rs = ps.executeQuery();
            tblSubSched.setModel(DbUtils.resultSetToTableModel(rs));

            // grade crud view
            ps = conn.prepareStatement("SELECT * FROM plm.stud_grade");
            rs = ps.executeQuery();
            tblStudGrades.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    private void btnViewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewsActionPerformed
        // TODO add your handling code here:
        pnlViews.setVisible(true);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(false);
        refresh();
    }//GEN-LAST:event_btnViewsActionPerformed

    private void btnSubSchedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubSchedActionPerformed
        // TODO add your handling code here:
        pnlViews.setVisible(false);
        pnlSubSched.setVisible(true);
        pnlStudGrades.setVisible(false);
        refresh();
    }//GEN-LAST:event_btnSubSchedActionPerformed

    private void btnStudGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudGradesActionPerformed
        // TODO add your handling code here:
        pnlViews.setVisible(false);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(true);
        refresh();
    }//GEN-LAST:event_btnStudGradesActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        refresh();
    }//GEN-LAST:event_formWindowActivated

    private void tabbViewsNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbViewsNavMouseClicked
//        refresh();
    }//GEN-LAST:event_tabbViewsNavMouseClicked

    private void btnSubSchedSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubSchedSearchActionPerformed
       if (!(txtSubSchedSearch.getText().trim().isBlank())){
            try {
                conn = ConnectDB.Connect();
                ps = conn.prepareStatement("SELECT * FROM plm.subject WHERE subject_code LIKE ?");
                ps.setString(1, txtSubSchedSearch.getText().trim());
                rs = ps.executeQuery();
                if (!rs.isBeforeFirst())
                    JOptionPane.showMessageDialog(null, "No Subject Code with \"" + txtSubSchedSearch.getText().trim() + "\" found.");
                else
                    tblSubSChedView.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e){
                e.printStackTrace();
            }
        } else 
            JOptionPane.showMessageDialog(null, "Please enter a Student ID");
        
    }//GEN-LAST:event_btnSubSchedSearchActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStudGrades;
    private javax.swing.JButton btnStudGradesAdd;
    private javax.swing.JButton btnStudGradesDelete;
    private javax.swing.JButton btnStudGradesSearch;
    private javax.swing.JButton btnStudGradesUpdate;
    private javax.swing.JButton btnSubSched;
    private javax.swing.JButton btnSubSchedAdd;
    private javax.swing.JButton btnSubSchedDelete;
    private javax.swing.JButton btnSubSchedSearch;
    private javax.swing.JButton btnSubSchedUpdate;
    private javax.swing.JButton btnViews;
    private javax.swing.JComboBox<String> cmbsgBlockNumber;
    private javax.swing.JComboBox<String> cmbsgCollegeCode;
    private javax.swing.JComboBox<String> cmbsgGrades;
    private javax.swing.JComboBox<String> cmbsgSemester;
    private javax.swing.JComboBox<String> cmbssCollegeCode;
    private javax.swing.JComboBox<String> cmbssDay;
    private javax.swing.JComboBox<String> cmbssEmployeeID;
    private javax.swing.JComboBox<String> cmbssSemester;
    private javax.swing.JComboBox<String> cmbssSequenceNo;
    private javax.swing.JComboBox<String> cmbssSubjectCode;
    private javax.swing.JComboBox<String> cmbssType;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblStudGradesSearch;
    private javax.swing.JLabel lblSubSchedSearch;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblsgBlockNumber;
    private javax.swing.JLabel lblsgCollegeCode;
    private javax.swing.JLabel lblsgGrades;
    private javax.swing.JLabel lblsgSchoolYear;
    private javax.swing.JLabel lblsgSemester;
    private javax.swing.JLabel lblsgStudentNumber;
    private javax.swing.JLabel lblssCollegeCode;
    private javax.swing.JLabel lblssDay;
    private javax.swing.JLabel lblssEmployeeID;
    private javax.swing.JLabel lblssRoom;
    private javax.swing.JLabel lblssSchoolYear;
    private javax.swing.JLabel lblssSemester;
    private javax.swing.JLabel lblssSequenceNo;
    private javax.swing.JLabel lblssSubjectCode;
    private javax.swing.JLabel lblssTime;
    private javax.swing.JLabel lblssType;
    private javax.swing.JPanel pnlFramebg;
    private javax.swing.JPanel pnlHeaderbg;
    private javax.swing.JPanel pnlNavbar;
    private javax.swing.JPanel pnlStudGrades;
    private javax.swing.JPanel pnlStudGradesBtns;
    private javax.swing.JPanel pnlStudGradesInfo;
    private javax.swing.JPanel pnlStudGradesSearch;
    private javax.swing.JPanel pnlStudGradesViews;
    private javax.swing.JPanel pnlSubSched;
    private javax.swing.JPanel pnlSubSchedBtns;
    private javax.swing.JPanel pnlSubSchedInfo;
    private javax.swing.JPanel pnlSubSchedSearch;
    private javax.swing.JPanel pnlSubSchedView;
    private javax.swing.JPanel pnlViews;
    private javax.swing.JPanel pnlViewsHeader;
    private javax.swing.JScrollPane scrllStudGrades;
    private javax.swing.JScrollPane scrllStudGradesView;
    private javax.swing.JScrollPane scrllSubSChedView;
    private javax.swing.JScrollPane scrllSubSched;
    private javax.swing.JTabbedPane tabbViewsNav;
    private javax.swing.JTable tblStudGrades;
    private javax.swing.JTable tblStudGradesView;
    private javax.swing.JTable tblSubSChedView;
    private javax.swing.JTable tblSubSched;
    private javax.swing.JTextField txtStudGradesSearch;
    private javax.swing.JTextField txtSubSchedSearch;
    private javax.swing.JTextField txtsgSchoolYear;
    private javax.swing.JTextField txtsgStudentNumber;
    private javax.swing.JTextField txtssRoom;
    private javax.swing.JTextField txtssSchoolYear;
    private javax.swing.JTextField txtssTime;
    // End of variables declaration//GEN-END:variables
}
