package projectoop;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableCellRenderer;

import net.proteanit.sql.DbUtils;

public class MainScreen extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    private Timer timer = null;
    
    public MainScreen() {
        initComponents();
        
        buttonEffects();
        tablesLook();
        buttonsLook();
        
        setDate();
        startClock();
        
        // FOR MAINSCREEN STARTING VIEW
            pnlViews.setVisible(true);
            pnlSubSched.setVisible(false);
            pnlStudGrades.setVisible(false);
            
            ImageIcon imgStudent = new ImageIcon(getClass().getResource("/resources/StudentIcon.png"));
          int newWidth = imgStudent.getIconWidth() * 2; // Scale up by 2x
        int newHeight = imgStudent.getIconHeight() * 2; // Scale up by 2x
        Image image = imgStudent.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
         ImageIcon scaledIcon = new ImageIcon(image);
              lblStudentIcon.setIcon(scaledIcon);
       lblStudentIcon.setPreferredSize(new Dimension(newWidth, newHeight));
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
        pnlBgStudentCount = new javax.swing.JPanel();
        pnlContStudentCount = new javax.swing.JPanel();
        lblTitleStudentCount = new javax.swing.JLabel();
        lblStudentCount = new javax.swing.JLabel();
        lblStudentIcon = new javax.swing.JLabel();
        pnlBgEmployeeCount = new javax.swing.JPanel();
        pnlContEmployeeCount = new javax.swing.JPanel();
        lblTitleEmployeeCount = new javax.swing.JLabel();
        lblEmployeeCount = new javax.swing.JLabel();
        lblEmployeeIcon = new javax.swing.JLabel();
        tabbViewsNav = new javax.swing.JTabbedPane();
        pnlSubSchedView = new javax.swing.JPanel();
        pnlSubSchedSearch = new javax.swing.JPanel();
        lblssFilterTitle = new javax.swing.JLabel();
        lblssSchoolYearFilter = new javax.swing.JLabel();
        lblssSemesterFilter = new javax.swing.JLabel();
        lblssCollegeFilter = new javax.swing.JLabel();
        lblssSubjectCodeFilter = new javax.swing.JLabel();
        cmbssSchoolYearFilter = new javax.swing.JComboBox<>();
        cmbssSemesterFilter = new javax.swing.JComboBox<>();
        cmbssCollegeFilter = new javax.swing.JComboBox<>();
        cmbssBlockNoFilter = new javax.swing.JComboBox<>();
        btnStudentGradesFilter1 = new javax.swing.JButton();
        scrllSubSchedView = new javax.swing.JScrollPane();
        tblSubSchedView = new javax.swing.JTable();
        pnlStudGradesViews = new javax.swing.JPanel();
        pnlStudGradesSearch = new javax.swing.JPanel();
        lblsgFilterTitle = new javax.swing.JLabel();
        lblsgSchoolYearFilter = new javax.swing.JLabel();
        lblsgSemesterFilter = new javax.swing.JLabel();
        lblsgSubjectCodeFilter = new javax.swing.JLabel();
        lblsgBlockNoFilter = new javax.swing.JLabel();
        lblsgStudentNoFilter = new javax.swing.JLabel();
        cmbsgSchoolYearFilter = new javax.swing.JComboBox<>();
        cmbsgSemesterFilter = new javax.swing.JComboBox<>();
        cmbsgSubjectCodeFilter = new javax.swing.JComboBox<>();
        cmbsgBlockNoFilter = new javax.swing.JComboBox<>();
        txtsgStudentNoFilter = new javax.swing.JTextField();
        btnStudentGradesFilter = new javax.swing.JButton();
        scrllStudGradesView = new javax.swing.JScrollPane();
        tblStudGradesView = new javax.swing.JTable();
        pnlSubSched = new javax.swing.JPanel();
        pnlSubSchedInfo = new javax.swing.JPanel();
        lblssSchoolYear = new javax.swing.JLabel();
        lblssSemester = new javax.swing.JLabel();
        lblssCollegeCode = new javax.swing.JLabel();
        lblssBlockNo = new javax.swing.JLabel();
        lblssSubjectCode = new javax.swing.JLabel();
        lblssDay = new javax.swing.JLabel();
        lblssTime = new javax.swing.JLabel();
        lblssType = new javax.swing.JLabel();
        lblssRoom = new javax.swing.JLabel();
        lblssSequenceNo = new javax.swing.JLabel();
        lblssFacultyID = new javax.swing.JLabel();
        lblssFacultyNameTitle = new javax.swing.JLabel();
        lblFacultyName = new javax.swing.JLabel();
        txtssTime = new javax.swing.JTextField();
        txtssSequenceNo = new javax.swing.JTextField();
        txtssRoom = new javax.swing.JTextField();
        cmbssSchoolYear = new javax.swing.JComboBox<>();
        cmbssCollegeCode = new javax.swing.JComboBox<>();
        cmbssSubjectCode = new javax.swing.JComboBox<>();
        cmbssDay = new javax.swing.JComboBox<>();
        cmbssType = new javax.swing.JComboBox<>();
        cmbssFacultyID = new javax.swing.JComboBox<>();
        cmbssSubjectCode1 = new javax.swing.JComboBox<>();
        cmbssSemester1 = new javax.swing.JComboBox<>();
        pnlSubSchedBtns = new javax.swing.JPanel();
        btnSubSchedClear = new javax.swing.JButton();
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
        scrllStudGrades = new javax.swing.JScrollPane();
        tblStudGrades = new javax.swing.JTable();
        pnlStudGradesBtns = new javax.swing.JPanel();
        btnStudGradesClear = new javax.swing.JButton();
        btnStudGradesAdd = new javax.swing.JButton();
        btnStudGradesUpdate = new javax.swing.JButton();
        btnStudGradesDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Information System");
        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFramebg.setBackground(new java.awt.Color(204, 204, 204));
        pnlFramebg.setMinimumSize(new java.awt.Dimension(1080, 720));
        pnlFramebg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeaderbg.setBackground(new java.awt.Color(204, 204, 204));
        pnlHeaderbg.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, null));
        pnlHeaderbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeaderTitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        lblHeaderTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblHeaderTitle.setText("Information System");
        pnlHeaderbg.add(lblHeaderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 430, 44));

        lblDate.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 0));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("January 01, 2000");
        pnlHeaderbg.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 20, 240, 19));

        lblTime.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 0, 0));
        lblTime.setText("12:00:00");
        pnlHeaderbg.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, 19));

        pnlFramebg.add(pnlHeaderbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 870, 80));

        pnlNavbar.setBackground(new java.awt.Color(128, 0, 32));
        pnlNavbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViews.setBackground(new java.awt.Color(128, 0, 32));
        btnViews.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnViews.setForeground(new java.awt.Color(255, 255, 255));
        btnViews.setText("Views");
        btnViews.setOpaque(true);
        btnViews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewsActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnViews, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 249, 210, 60));

        btnSubSched.setBackground(new java.awt.Color(128, 0, 32));
        btnSubSched.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSubSched.setForeground(new java.awt.Color(255, 255, 255));
        btnSubSched.setText("Schedule");
        btnSubSched.setOpaque(true);
        btnSubSched.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubSchedActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnSubSched, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 309, 210, 60));

        btnStudGrades.setBackground(new java.awt.Color(128, 0, 32));
        btnStudGrades.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnStudGrades.setForeground(new java.awt.Color(255, 255, 255));
        btnStudGrades.setText("Grades");
        btnStudGrades.setOpaque(true);
        btnStudGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudGradesActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnStudGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 369, 210, 60));

        pnlFramebg.add(pnlNavbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 720));

        pnlViews.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlViewsHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBgStudentCount.setBackground(new java.awt.Color(128, 0, 32));
        pnlBgStudentCount.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pnlBgStudentCount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContStudentCount.setBackground(new java.awt.Color(204, 204, 204));
        pnlContStudentCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlContStudentCount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleStudentCount.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        lblTitleStudentCount.setForeground(new java.awt.Color(0, 0, 0));
        lblTitleStudentCount.setText("Student Count");
        pnlContStudentCount.add(lblTitleStudentCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 190, 30));

        lblStudentCount.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        lblStudentCount.setForeground(new java.awt.Color(0, 0, 0));
        lblStudentCount.setText("1");
        pnlContStudentCount.add(lblStudentCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 190, 40));

        lblStudentIcon.setToolTipText("label");
        pnlContStudentCount.add(lblStudentIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        pnlBgStudentCount.add(pnlContStudentCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 80));

        pnlViewsHeader.add(pnlBgStudentCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 100));

        pnlBgEmployeeCount.setBackground(new java.awt.Color(128, 0, 32));
        pnlBgEmployeeCount.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pnlBgEmployeeCount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContEmployeeCount.setBackground(new java.awt.Color(204, 204, 204));
        pnlContEmployeeCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlContEmployeeCount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleEmployeeCount.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        lblTitleEmployeeCount.setForeground(new java.awt.Color(0, 0, 0));
        lblTitleEmployeeCount.setText("Employee Count");
        pnlContEmployeeCount.add(lblTitleEmployeeCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 190, 30));

        lblEmployeeCount.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        lblEmployeeCount.setForeground(new java.awt.Color(0, 0, 0));
        lblEmployeeCount.setText("1");
        pnlContEmployeeCount.add(lblEmployeeCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 190, 40));

        lblEmployeeIcon.setToolTipText("label");
        pnlContEmployeeCount.add(lblEmployeeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        pnlBgEmployeeCount.add(pnlContEmployeeCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 80));

        pnlViewsHeader.add(pnlBgEmployeeCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 290, 100));

        pnlViews.add(pnlViewsHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 120));

        tabbViewsNav.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tabbViewsNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbViewsNavMouseClicked(evt);
            }
        });

        pnlSubSchedView.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        pnlSubSchedView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSubSchedSearch.setBackground(new java.awt.Color(204, 204, 204));
        pnlSubSchedSearch.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        pnlSubSchedSearch.setOpaque(false);
        pnlSubSchedSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblssFilterTitle.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblssFilterTitle.setText("Filter by    : ");
        pnlSubSchedSearch.add(lblssFilterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblssSchoolYearFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblssSchoolYearFilter.setText("School Year");
        pnlSubSchedSearch.add(lblssSchoolYearFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        lblssSemesterFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblssSemesterFilter.setText("Semester");
        pnlSubSchedSearch.add(lblssSemesterFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        lblssCollegeFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblssCollegeFilter.setText("Subject Code");
        pnlSubSchedSearch.add(lblssCollegeFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        lblssSubjectCodeFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblssSubjectCodeFilter.setText("Block Number");
        pnlSubSchedSearch.add(lblssSubjectCodeFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        cmbssSchoolYearFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbssSchoolYearFilter.setPreferredSize(new java.awt.Dimension(79, 20));
        pnlSubSchedSearch.add(cmbssSchoolYearFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 160, 20));

        cmbssSemesterFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbssSemesterFilter.setPreferredSize(new java.awt.Dimension(79, 20));
        pnlSubSchedSearch.add(cmbssSemesterFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 160, 20));

        cmbssCollegeFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbssCollegeFilter.setPreferredSize(new java.awt.Dimension(79, 20));
        cmbssCollegeFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbssCollegeFilterActionPerformed(evt);
            }
        });
        pnlSubSchedSearch.add(cmbssCollegeFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 160, 20));

        cmbssBlockNoFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbssBlockNoFilter.setPreferredSize(new java.awt.Dimension(79, 20));
        pnlSubSchedSearch.add(cmbssBlockNoFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 160, 20));

        btnStudentGradesFilter1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnStudentGradesFilter1.setText("Search");
        btnStudentGradesFilter1.setPreferredSize(new java.awt.Dimension(84, 20));
        pnlSubSchedSearch.add(btnStudentGradesFilter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 80, -1));

        pnlSubSchedView.add(pnlSubSchedSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 50));

        tblSubSchedView.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSubSchedView.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSubSchedView.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrllSubSchedView.setViewportView(tblSubSchedView);

        pnlSubSchedView.add(scrllSubSchedView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 870, 440));

        tabbViewsNav.addTab("Subject Schedule", pnlSubSchedView);

        pnlStudGradesViews.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlStudGradesSearch.setBackground(new java.awt.Color(204, 204, 204));
        pnlStudGradesSearch.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        pnlStudGradesSearch.setOpaque(false);
        pnlStudGradesSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblsgFilterTitle.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblsgFilterTitle.setText("Filter by    : ");
        pnlStudGradesSearch.add(lblsgFilterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblsgSchoolYearFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblsgSchoolYearFilter.setText("School Year");
        pnlStudGradesSearch.add(lblsgSchoolYearFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        lblsgSemesterFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblsgSemesterFilter.setText("Semester");
        pnlStudGradesSearch.add(lblsgSemesterFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        lblsgSubjectCodeFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblsgSubjectCodeFilter.setText("Subject Code");
        pnlStudGradesSearch.add(lblsgSubjectCodeFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        lblsgBlockNoFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblsgBlockNoFilter.setText("Block Number");
        pnlStudGradesSearch.add(lblsgBlockNoFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        lblsgStudentNoFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblsgStudentNoFilter.setText("Student Number");
        pnlStudGradesSearch.add(lblsgStudentNoFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        cmbsgSchoolYearFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbsgSchoolYearFilter.setPreferredSize(new java.awt.Dimension(79, 20));
        pnlStudGradesSearch.add(cmbsgSchoolYearFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 20));

        cmbsgSemesterFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbsgSemesterFilter.setPreferredSize(new java.awt.Dimension(79, 20));
        pnlStudGradesSearch.add(cmbsgSemesterFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 100, 20));

        cmbsgSubjectCodeFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbsgSubjectCodeFilter.setPreferredSize(new java.awt.Dimension(79, 20));
        cmbsgSubjectCodeFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsgSubjectCodeFilterActionPerformed(evt);
            }
        });
        pnlStudGradesSearch.add(cmbsgSubjectCodeFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 120, 20));

        cmbsgBlockNoFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbsgBlockNoFilter.setPreferredSize(new java.awt.Dimension(79, 20));
        pnlStudGradesSearch.add(cmbsgBlockNoFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 100, 20));

        txtsgStudentNoFilter.setPreferredSize(new java.awt.Dimension(73, 20));
        pnlStudGradesSearch.add(txtsgStudentNoFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 170, -1));

        btnStudentGradesFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnStudentGradesFilter.setText("Search");
        btnStudentGradesFilter.setPreferredSize(new java.awt.Dimension(84, 20));
        pnlStudGradesSearch.add(btnStudentGradesFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 80, -1));

        pnlStudGradesViews.add(pnlStudGradesSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 50));

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
        tblStudGradesView.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblStudGradesView.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrllStudGradesView.setViewportView(tblStudGradesView);

        pnlStudGradesViews.add(scrllStudGradesView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 870, 440));

        tabbViewsNav.addTab("Student Grades", pnlStudGradesViews);

        pnlViews.add(tabbViewsNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 870, 520));
        tabbViewsNav.getAccessibleContext().setAccessibleName("");

        pnlFramebg.add(pnlViews, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 870, 640));

        pnlSubSched.setBackground(new java.awt.Color(204, 204, 204));
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
        lblssSchoolYear.setText("School Year      :");
        lblssSchoolYear.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssSchoolYear.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 105, 20));

        lblssSemester.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssSemester.setForeground(new java.awt.Color(0, 0, 0));
        lblssSemester.setText("Semester         :");
        lblssSemester.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssSemester.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 65, 105, 20));

        lblssCollegeCode.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssCollegeCode.setForeground(new java.awt.Color(0, 0, 0));
        lblssCollegeCode.setText("College Code   :");
        lblssCollegeCode.setMinimumSize(new java.awt.Dimension(80, 20));
        pnlSubSchedInfo.add(lblssCollegeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 95, 105, 20));

        lblssBlockNo.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssBlockNo.setForeground(new java.awt.Color(0, 0, 0));
        lblssBlockNo.setText("Block No          :");
        lblssBlockNo.setMinimumSize(new java.awt.Dimension(80, 20));
        pnlSubSchedInfo.add(lblssBlockNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, 105, 20));

        lblssSubjectCode.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssSubjectCode.setForeground(new java.awt.Color(0, 0, 0));
        lblssSubjectCode.setText("Subject Code   :");
        lblssSubjectCode.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssSubjectCode.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssSubjectCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, 105, 20));

        lblssDay.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssDay.setForeground(new java.awt.Color(0, 0, 0));
        lblssDay.setText("Day          :");
        lblssDay.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssDay.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 35, 70, -1));

        lblssTime.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssTime.setForeground(new java.awt.Color(0, 0, 0));
        lblssTime.setText("Time        :");
        lblssTime.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssTime.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 65, 70, -1));

        lblssType.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssType.setForeground(new java.awt.Color(0, 0, 0));
        lblssType.setText("Type        :");
        lblssType.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssType.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssType, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 95, 70, -1));

        lblssRoom.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssRoom.setForeground(new java.awt.Color(0, 0, 0));
        lblssRoom.setText("Room      :");
        lblssRoom.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssRoom.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 125, 70, -1));

        lblssSequenceNo.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssSequenceNo.setForeground(new java.awt.Color(0, 0, 0));
        lblssSequenceNo.setText("Sequence No  :");
        lblssSequenceNo.setMinimumSize(new java.awt.Dimension(80, 20));
        pnlSubSchedInfo.add(lblssSequenceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 35, 100, -1));

        lblssFacultyID.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssFacultyID.setForeground(new java.awt.Color(0, 0, 0));
        lblssFacultyID.setText("Faculty ID   :");
        lblssFacultyID.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssFacultyID.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssFacultyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 65, 100, -1));

        lblssFacultyNameTitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssFacultyNameTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblssFacultyNameTitle.setText("Faculty Name  :");
        lblssFacultyNameTitle.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssFacultyNameTitle.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssFacultyNameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 95, 110, -1));

        lblFacultyName.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblFacultyName.setForeground(new java.awt.Color(0, 0, 0));
        lblFacultyName.setText("--");
        lblFacultyName.setMinimumSize(new java.awt.Dimension(80, 20));
        lblFacultyName.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblFacultyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 95, 150, -1));

        txtssTime.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtssTime.setMinimumSize(new java.awt.Dimension(140, 20));
        txtssTime.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(txtssTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 65, 140, 20));

        txtssSequenceNo.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtssSequenceNo.setMinimumSize(new java.awt.Dimension(140, 20));
        txtssSequenceNo.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(txtssSequenceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 35, 140, 20));
        txtssSequenceNo.getAccessibleContext().setAccessibleName("");

        txtssRoom.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtssRoom.setMinimumSize(new java.awt.Dimension(140, 20));
        txtssRoom.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(txtssRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 125, 140, 20));
        txtssRoom.getAccessibleContext().setAccessibleName("");

        cmbssSchoolYear.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssSchoolYear.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssSchoolYear.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 35, 140, 20));

        cmbssCollegeCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssCollegeCode.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssCollegeCode.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssCollegeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 95, 140, 20));

        cmbssSubjectCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssSubjectCode.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssSubjectCode.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssSubjectCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 125, 140, 20));

        cmbssDay.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "T", "W", "TH", "F", "S" }));
        cmbssDay.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssDay.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 35, 140, 20));

        cmbssType.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F2F", "OL" }));
        cmbssType.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssType.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssType, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 95, 140, 20));
        cmbssType.getAccessibleContext().setAccessibleName("");

        cmbssFacultyID.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssFacultyID.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssFacultyID.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssFacultyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 65, 140, 20));

        cmbssSubjectCode1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssSubjectCode1.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssSubjectCode1.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssSubjectCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 155, 140, 20));

        cmbssSemester1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssSemester1.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssSemester1.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssSemester1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 65, 140, 20));

        pnlSubSched.add(pnlSubSchedInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 830, 200));

        pnlSubSchedBtns.setMinimumSize(new java.awt.Dimension(830, 40));
        pnlSubSchedBtns.setOpaque(false);
        pnlSubSchedBtns.setPreferredSize(new java.awt.Dimension(830, 40));
        pnlSubSchedBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubSchedClear.setText("Clear");
        pnlSubSchedBtns.add(btnSubSchedClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 120, 30));

        btnSubSchedAdd.setText("Add");
        pnlSubSchedBtns.add(btnSubSchedAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 120, 30));

        btnSubSchedUpdate.setText("Update");
        pnlSubSchedBtns.add(btnSubSchedUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 120, 30));

        btnSubSchedDelete.setText("Delete");
        pnlSubSchedBtns.add(btnSubSchedDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 120, 30));

        pnlSubSched.add(pnlSubSchedBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 830, 40));

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
        tblSubSched.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSubSched.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSubSchedMouseClicked(evt);
            }
        });
        scrllSubSched.setViewportView(tblSubSched);

        pnlSubSched.add(scrllSubSched, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 830, 380));

        pnlFramebg.add(pnlSubSched, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        pnlStudGrades.setBackground(new java.awt.Color(204, 204, 204));
        pnlStudGrades.setMinimumSize(new java.awt.Dimension(870, 640));
        pnlStudGrades.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlStudGrades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlStudGradesInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), " Grading Details ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
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

        pnlStudGrades.add(pnlStudGradesInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 830, 200));

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
        tblStudGrades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblStudGrades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudGradesMouseClicked(evt);
            }
        });
        scrllStudGrades.setViewportView(tblStudGrades);

        pnlStudGrades.add(scrllStudGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 830, 380));

        pnlStudGradesBtns.setOpaque(false);
        pnlStudGradesBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStudGradesClear.setText("Clear");
        pnlStudGradesBtns.add(btnStudGradesClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 120, 30));

        btnStudGradesAdd.setText("Add");
        pnlStudGradesBtns.add(btnStudGradesAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 120, 30));

        btnStudGradesUpdate.setText("Update");
        pnlStudGradesBtns.add(btnStudGradesUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 120, 30));

        btnStudGradesDelete.setText("Delete");
        pnlStudGradesBtns.add(btnStudGradesDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 120, 30));

        pnlStudGrades.add(pnlStudGradesBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 830, 40));

        pnlFramebg.add(pnlStudGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        getContentPane().add(pnlFramebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void setDate(){
        LocalDateTime curDate = LocalDateTime.now();
        int getYear = curDate.getYear();
        int getDay = curDate.getDayOfMonth();
        
        int getMonth = curDate.getMonthValue();
        String monthString;
        switch (getMonth){
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "null";
        }
        
        String dateToday = monthString + " " + getDay + ", " + getYear;
        lblDate.setText(dateToday);
    }
    
    private void startClock() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new java.util.Date());
                lblTime.setText(currentTime);
            }
        });
        timer.start();
    }
    
    private void tablesLook() {
    // FOR STUDENT GRADES VIEWS - TABLE
            scrllStudGradesView.setOpaque(false);
            scrllStudGradesView.getViewport().setOpaque(false);  
            tblStudGradesView.setOpaque(false);
            tblStudGradesView.setShowGrid(false);  
            tblStudGradesView.setBackground(new Color(0, 0, 0, 0));  

            tblStudGradesView.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {

            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (!isSelected) {
                c.setBackground(new Color(0, 0, 0, 0)); 
                setForeground(Color.BLACK);
            } else {
                c.setBackground(new Color(153, 51, 51));
                c.setForeground(Color.WHITE);  
            }
            return c;
            }
            });
            
        // FOR SUB SCHED VIEWS - TABLE
            scrllSubSchedView.setOpaque(false);
            scrllSubSchedView.getViewport().setOpaque(false);  
            tblSubSchedView.setOpaque(false);
            tblSubSchedView.setShowGrid(false);  
            tblSubSchedView.setBackground(new Color(0, 0, 0, 0));  

            tblSubSchedView.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {

            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (!isSelected) {
                c.setBackground(new Color(0, 0, 0, 0)); 
                setForeground(Color.BLACK);
            } else {
                c.setBackground(new Color(153, 51, 51));
                c.setForeground(Color.WHITE);  
            }
            return c;
            }
            });

        // FOR STUDENT GRADES - TABLE
            scrllStudGrades.setOpaque(false);
            scrllStudGrades.getViewport().setOpaque(false);  
            tblStudGrades.setOpaque(false);
            tblStudGrades.setShowGrid(false);  
            tblStudGrades.setBackground(new Color(0, 0, 0, 0));

            tblStudGrades.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {

            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (!isSelected) {
                c.setBackground(new Color(0, 0, 0, 0)); 
                setForeground(Color.BLACK);
            } else {
                c.setBackground(new Color(153, 51, 51));
                c.setForeground(Color.WHITE);  
            }
            return c;
            }
            });
        
        // FOR SUBJECT SCHEDULE - TABLE
            scrllSubSched.setOpaque(false);
            scrllSubSched.getViewport().setOpaque(false);  
            tblSubSched.setOpaque(false);
            tblSubSched.setShowGrid(false);  
            tblSubSched.setBackground(new Color(0, 0, 0, 0));  

            tblSubSched.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {

            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (!isSelected) {
                c.setBackground(new Color(0, 0, 0, 0)); 
                setForeground(Color.BLACK);
            } else {
                c.setBackground(new Color(153, 51, 51));
                c.setForeground(Color.WHITE);  
            }
            return c;
            }
            });
}
    
    private void buttonsLook() {
            // CLEAR
            btnSubSchedClear.setBackground(new Color(112, 128, 144));  
            btnSubSchedClear.setForeground(Color.WHITE);  
            btnSubSchedClear.setFocusPainted(false);  
            btnSubSchedClear.setBorderPainted(false);  
            btnSubSchedClear.setOpaque(true);
            
            btnStudGradesClear.setBackground(new Color(112, 128, 144));  
            btnStudGradesClear.setForeground(Color.WHITE);  
            btnStudGradesClear.setFocusPainted(false);  
            btnStudGradesClear.setBorderPainted(false);  
            btnStudGradesClear.setOpaque(true);
            
            // ADD
            btnSubSchedAdd.setBackground(new Color(34, 139, 34));   
            btnSubSchedAdd.setForeground(Color.WHITE);  
            btnSubSchedAdd.setFocusPainted(false);  
            btnSubSchedAdd.setBorderPainted(false);  
            btnSubSchedAdd.setOpaque(true);
            
            btnStudGradesAdd.setBackground(new Color(34, 139, 34));   
            btnStudGradesAdd.setForeground(Color.WHITE);  
            btnStudGradesAdd.setFocusPainted(false);  
            btnStudGradesAdd.setBorderPainted(false);  
            btnStudGradesAdd.setOpaque(true);  
            
            // UPDATE
            btnSubSchedUpdate.setBackground(new Color(204, 153, 0));  
            btnSubSchedUpdate.setForeground(Color.WHITE);  
            btnSubSchedUpdate.setFocusPainted(false);  
            btnSubSchedUpdate.setBorderPainted(false);  
            btnSubSchedUpdate.setOpaque(true);  
            
            btnStudGradesUpdate.setBackground(new Color(204, 153, 0));  
            btnStudGradesUpdate.setForeground(Color.WHITE);  
            btnStudGradesUpdate.setFocusPainted(false);  
            btnStudGradesUpdate.setBorderPainted(false);  
            btnStudGradesUpdate.setOpaque(true);  
            
            // DELETE 
            btnSubSchedDelete.setBackground(new Color(204, 0, 0));  
            btnSubSchedDelete.setForeground(Color.WHITE);  
            btnSubSchedDelete.setFocusPainted(false);  
            btnSubSchedDelete.setBorderPainted(false);  
            btnSubSchedDelete.setOpaque(true);

            btnStudGradesDelete.setBackground(new Color(204, 0, 0));  
            btnStudGradesDelete.setForeground(Color.WHITE);  
            btnStudGradesDelete.setFocusPainted(false);  
            btnStudGradesDelete.setBorderPainted(false);  
            btnStudGradesDelete.setOpaque(true);
    }
    
    private void buttonEffects() {
        
        // FOR BUTTON BGCOLOR
        Color NavbtnOriginalColor = new Color(128, 0 ,32);
        Color NavbtnHoverColor = new Color(100, 0, 25);
        Color NavbtnPressedColor = new Color(70, 0, 20);  
        
        // FOR GROUPING
        ArrayList<JButton> buttons = new ArrayList<>();
        buttons.add(btnViews);
        buttons.add(btnSubSched);
        buttons.add(btnStudGrades);
        
        // FOR HOVER
        for (JButton button : buttons) {
        button.setBackground(NavbtnOriginalColor);
        button.setForeground(Color.WHITE);  
        button.setOpaque(true);
        button.setBorderPainted(false);   
        button.setFocusPainted(false);
        
        button.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            if (!button.getBackground().equals(NavbtnPressedColor)) {
                button.setBackground(NavbtnHoverColor);
            }
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            if (!button.getBackground().equals(NavbtnPressedColor)) {
                button.setBackground(NavbtnOriginalColor);
            }
        }
        });

        button.addActionListener(evt -> {
           for (JButton btn : buttons) {
               btn.setBackground(NavbtnOriginalColor);
           }
               button.setBackground(NavbtnPressedColor);
        });
        }
    }
    
    public void refresh(){
        try {
            // sched view
            conn = ConnectDB.Connect();
            ps = conn.prepareStatement("SELECT * FROM plm.subj_sched");
            rs = ps.executeQuery();
            tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            
            // grade view
            ps = conn.prepareStatement("SELECT * FROM plm.stud_grade");
            rs = ps.executeQuery();
            tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
        
            // schedule crud view
            ps = conn.prepareStatement("SELECT * FROM plm.subject_schedule");
            rs = ps.executeQuery();
            tblSubSched.setModel(DbUtils.resultSetToTableModel(rs));

            // grade crud view
            ps = conn.prepareStatement("SELECT * FROM plm.grades");
            rs = ps.executeQuery();
            tblStudGrades.setModel(DbUtils.resultSetToTableModel(rs));
            
            // stats panel
            getStudCount();
            getEmployeeCount();
                    
            getCMBSubSched();
            getCMBStudGrade();
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void getStudCount(){
        int counter = 0;
        try {
            conn = ConnectDB.Connect();
            ps = conn.prepareStatement("SELECT * FROM STUDENT");
            rs = ps.executeQuery();
            while (rs.next())
                ++counter;
        } catch (Exception e){
            e.printStackTrace();
        }
        lblStudentCount.setText(String.valueOf(counter));
    }
    
    public void getEmployeeCount(){
        int counter = 0;
        try {
            conn = ConnectDB.Connect();
            ps = conn.prepareStatement("SELECT * FROM EMPLOYEE");
            rs = ps.executeQuery();
            while (rs.next())
                ++counter;
        } catch (Exception e){
            e.printStackTrace();
        }
        lblEmployeeCount.setText(String.valueOf(counter));
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

    private void tblSubSchedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSubSchedMouseClicked
        int row = tblSubSched.getSelectedRow();
        // s.y cmb box
        cmbssSchoolYear.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 1)));
        cmbssCollegeCode.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 2)));
        cmbssSubjectCode.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 4)));
        // insert block no.
        cmbssDay.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 5)));
        txtssSequenceNo.setText(getValueOrDefault(tblSubSched.getValueAt(row, 6)));
        cmbssType.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 8)));
        txtssRoom.setText(getValueOrDefault(tblSubSched.getValueAt(row, 7)));
//      cmbssSequenceNo.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 9))); // fix, it acts as a dupli daw
        cmbssFacultyID.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 10)));
        
//        txtssTime.setText(String.valueOf(tblSubSched.getValueAt(row, 7)).isBlank() ? " " : String.valueOf(tblSubSched.getValueAt(row, 7)));
    }//GEN-LAST:event_tblSubSchedMouseClicked

    public void getCMBSubSched(){ 
        try {
            cmbssSchoolYear.removeAllItems();
            ps = conn.prepareStatement("SELECT semester FROM plm.semester");
            rs = ps.executeQuery();
            while(rs.next())
                cmbssSchoolYear.addItem(rs.getString("semester"));
            
            cmbssCollegeCode.removeAllItems();
            ps = conn.prepareStatement("SELECT college_code FROM plm.college");
            rs = ps.executeQuery();
            while(rs.next())
                cmbssCollegeCode.addItem(rs.getString("college_code"));
            
            cmbssSubjectCode.removeAllItems();
            ps = conn.prepareStatement("SELECT subject_code FROM plm.subject");
            rs = ps.executeQuery();
            while(rs.next())
                cmbssSubjectCode.addItem(rs.getString("subject_code"));
            
            cmbssFacultyID.removeAllItems();
            ps = conn.prepareStatement("SELECT employee_id FROM plm.employee");
            rs = ps.executeQuery();
            while(rs.next())
                cmbssFacultyID.addItem(rs.getString("employee_id"));
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    private void tblStudGradesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudGradesMouseClicked
        int row = tblStudGrades.getSelectedRow();
        // s.y combo box
        cmbsgSemester.setSelectedItem(getValueOrDefault(tblStudGrades.getValueAt(row, 1)));
        cmbssCollegeCode.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 2)));
        
    }//GEN-LAST:event_tblStudGradesMouseClicked

    private void cmbsgSubjectCodeFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsgSubjectCodeFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsgSubjectCodeFilterActionPerformed

    private void cmbssCollegeFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbssCollegeFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbssCollegeFilterActionPerformed

    public void getCMBStudGrade(){ 
        try {
            cmbsgSemester.removeAllItems();
            ps = conn.prepareStatement("SELECT semester FROM plm.semester");
            rs = ps.executeQuery();
            while(rs.next())
                cmbsgSemester.addItem(rs.getString("semester"));
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    private String getValueOrDefault(Object value) {
        return value == null ? "" : value.toString();
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
    private javax.swing.JButton btnStudGradesClear;
    private javax.swing.JButton btnStudGradesDelete;
    private javax.swing.JButton btnStudGradesUpdate;
    private javax.swing.JButton btnStudentGradesFilter;
    private javax.swing.JButton btnStudentGradesFilter1;
    private javax.swing.JButton btnSubSched;
    private javax.swing.JButton btnSubSchedAdd;
    private javax.swing.JButton btnSubSchedClear;
    private javax.swing.JButton btnSubSchedDelete;
    private javax.swing.JButton btnSubSchedUpdate;
    private javax.swing.JButton btnViews;
    private javax.swing.JComboBox<String> cmbsgBlockNoFilter;
    private javax.swing.JComboBox<String> cmbsgBlockNumber;
    private javax.swing.JComboBox<String> cmbsgCollegeCode;
    private javax.swing.JComboBox<String> cmbsgGrades;
    private javax.swing.JComboBox<String> cmbsgSchoolYearFilter;
    private javax.swing.JComboBox<String> cmbsgSemester;
    private javax.swing.JComboBox<String> cmbsgSemesterFilter;
    private javax.swing.JComboBox<String> cmbsgSubjectCodeFilter;
    private javax.swing.JComboBox<String> cmbssBlockNoFilter;
    private javax.swing.JComboBox<String> cmbssCollegeCode;
    private javax.swing.JComboBox<String> cmbssCollegeFilter;
    private javax.swing.JComboBox<String> cmbssDay;
    private javax.swing.JComboBox<String> cmbssFacultyID;
    private javax.swing.JComboBox<String> cmbssSchoolYear;
    private javax.swing.JComboBox<String> cmbssSchoolYearFilter;
    private javax.swing.JComboBox<String> cmbssSemester1;
    private javax.swing.JComboBox<String> cmbssSemesterFilter;
    private javax.swing.JComboBox<String> cmbssSubjectCode;
    private javax.swing.JComboBox<String> cmbssSubjectCode1;
    private javax.swing.JComboBox<String> cmbssType;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmployeeCount;
    private javax.swing.JLabel lblEmployeeIcon;
    private javax.swing.JLabel lblFacultyName;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblStudentCount;
    private javax.swing.JLabel lblStudentIcon;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitleEmployeeCount;
    private javax.swing.JLabel lblTitleStudentCount;
    private javax.swing.JLabel lblsgBlockNoFilter;
    private javax.swing.JLabel lblsgBlockNumber;
    private javax.swing.JLabel lblsgCollegeCode;
    private javax.swing.JLabel lblsgFilterTitle;
    private javax.swing.JLabel lblsgGrades;
    private javax.swing.JLabel lblsgSchoolYear;
    private javax.swing.JLabel lblsgSchoolYearFilter;
    private javax.swing.JLabel lblsgSemester;
    private javax.swing.JLabel lblsgSemesterFilter;
    private javax.swing.JLabel lblsgStudentNoFilter;
    private javax.swing.JLabel lblsgStudentNumber;
    private javax.swing.JLabel lblsgSubjectCodeFilter;
    private javax.swing.JLabel lblssBlockNo;
    private javax.swing.JLabel lblssCollegeCode;
    private javax.swing.JLabel lblssCollegeFilter;
    private javax.swing.JLabel lblssDay;
    private javax.swing.JLabel lblssFacultyID;
    private javax.swing.JLabel lblssFacultyNameTitle;
    private javax.swing.JLabel lblssFilterTitle;
    private javax.swing.JLabel lblssRoom;
    private javax.swing.JLabel lblssSchoolYear;
    private javax.swing.JLabel lblssSchoolYearFilter;
    private javax.swing.JLabel lblssSemester;
    private javax.swing.JLabel lblssSemesterFilter;
    private javax.swing.JLabel lblssSequenceNo;
    private javax.swing.JLabel lblssSubjectCode;
    private javax.swing.JLabel lblssSubjectCodeFilter;
    private javax.swing.JLabel lblssTime;
    private javax.swing.JLabel lblssType;
    private javax.swing.JPanel pnlBgEmployeeCount;
    private javax.swing.JPanel pnlBgStudentCount;
    private javax.swing.JPanel pnlContEmployeeCount;
    private javax.swing.JPanel pnlContStudentCount;
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
    private javax.swing.JScrollPane scrllSubSched;
    private javax.swing.JScrollPane scrllSubSchedView;
    private javax.swing.JTabbedPane tabbViewsNav;
    private javax.swing.JTable tblStudGrades;
    private javax.swing.JTable tblStudGradesView;
    private javax.swing.JTable tblSubSched;
    private javax.swing.JTable tblSubSchedView;
    private javax.swing.JTextField txtsgSchoolYear;
    private javax.swing.JTextField txtsgStudentNoFilter;
    private javax.swing.JTextField txtsgStudentNumber;
    private javax.swing.JTextField txtssRoom;
    private javax.swing.JTextField txtssSequenceNo;
    private javax.swing.JTextField txtssTime;
    // End of variables declaration//GEN-END:variables
}
