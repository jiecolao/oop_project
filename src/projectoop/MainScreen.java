package projectoop;

import entities.SubjectSchedule;
import entities.Grades;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

import net.proteanit.sql.DbUtils;

public class MainScreen extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    SubjectSchedule SubjectSchedule;
    Grades Grades;
    
    String syear; 
    String sem;
    
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
            pnlSchoolYear.setVisible(false);
            pnlSemester.setVisible(false);
            pnlCollege.setVisible(false);
            pnlCourse.setVisible(false);
            pnlStudent.setVisible(false);
            pnlEmployee.setVisible(false);
            pnlSubject.setVisible(false);
            
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
        btnSubject = new javax.swing.JButton();
        btnSchoolYear = new javax.swing.JButton();
        btnSemester = new javax.swing.JButton();
        btnCollege = new javax.swing.JButton();
        btnCourse = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        lblOthers = new javax.swing.JLabel();
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
        btnSubjectScheduleFilter = new javax.swing.JButton();
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
        txtssBlockNo = new javax.swing.JTextField();
        cmbssDay = new javax.swing.JComboBox<>();
        cmbssType = new javax.swing.JComboBox<>();
        cmbssFacultyID = new javax.swing.JComboBox<>();
        cmbssSubjectCode = new javax.swing.JComboBox<>();
        cmbssSemester1 = new javax.swing.JComboBox<>();
        pnlSubSchedBtns = new javax.swing.JPanel();
        btnSubSchedClear = new javax.swing.JButton();
        btnSubSchedAdd = new javax.swing.JButton();
        btnSubSchedUpdate = new javax.swing.JButton();
        btnSubSchedDelete = new javax.swing.JButton();
        scrllSubSched = new javax.swing.JScrollPane();
        tblSubSched = new javax.swing.JTable();
        pnlStudGrades = new javax.swing.JPanel();
        scrllStudGrades = new javax.swing.JScrollPane();
        tblStudGrades = new javax.swing.JTable();
        pnlStudGradesBtns = new javax.swing.JPanel();
        lblsgStudentNumber = new javax.swing.JLabel();
        txtsgStudentNumber = new javax.swing.JTextField();
        btnStudGradesAdd = new javax.swing.JButton();
        btnStudGradesUpdate = new javax.swing.JButton();
        btnStudGradesDelete = new javax.swing.JButton();
        btnStudGradesSearch = new javax.swing.JButton();
        pnlSchoolYear = new javax.swing.JPanel();
        scrllSchoolYear = new javax.swing.JScrollPane();
        tblSchoolYear = new javax.swing.JTable();
        pnlSchoolYearBtns = new javax.swing.JPanel();
        lblDash = new javax.swing.JLabel();
        lblEndSY = new javax.swing.JLabel();
        lblStartSY2 = new javax.swing.JLabel();
        btnSchoolYearAdd = new javax.swing.JButton();
        btnSchoolYearUpdate = new javax.swing.JButton();
        btnSchoolYearDelete = new javax.swing.JButton();
        txtStartSY = new javax.swing.JTextField();
        txtEndSY = new javax.swing.JTextField();
        pnlSemester = new javax.swing.JPanel();
        scrllSemester = new javax.swing.JScrollPane();
        tblSemester = new javax.swing.JTable();
        pnlSemesterBtns = new javax.swing.JPanel();
        lblSemester = new javax.swing.JLabel();
        btnSemesterAdd = new javax.swing.JButton();
        btnSemesterUpdate = new javax.swing.JButton();
        btnSemesterDelete = new javax.swing.JButton();
        txtSemester = new javax.swing.JTextField();
        pnlCollege = new javax.swing.JPanel();
        pnlCourse = new javax.swing.JPanel();
        pnlStudent = new javax.swing.JPanel();
        pnlEmployee = new javax.swing.JPanel();
        pnlSubject = new javax.swing.JPanel();

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
        lblHeaderTitle.setText("Information System");
        pnlHeaderbg.add(lblHeaderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 430, 44));

        lblDate.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("January 01, 2000");
        pnlHeaderbg.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 20, 240, 19));

        lblTime.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
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
        pnlNavbar.add(btnViews, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 60));

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
        pnlNavbar.add(btnSubSched, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 60));

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
        pnlNavbar.add(btnStudGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 60));

        btnSubject.setBackground(new java.awt.Color(128, 0, 32));
        btnSubject.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSubject.setForeground(new java.awt.Color(255, 255, 255));
        btnSubject.setText("Subject");
        btnSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubjectActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 210, 60));

        btnSchoolYear.setBackground(new java.awt.Color(128, 0, 32));
        btnSchoolYear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSchoolYear.setForeground(new java.awt.Color(255, 255, 255));
        btnSchoolYear.setText("School Year");
        btnSchoolYear.setOpaque(true);
        btnSchoolYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolYearActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 210, 60));

        btnSemester.setBackground(new java.awt.Color(128, 0, 32));
        btnSemester.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSemester.setForeground(new java.awt.Color(255, 255, 255));
        btnSemester.setText("Semester");
        btnSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemesterActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 210, 60));

        btnCollege.setBackground(new java.awt.Color(128, 0, 32));
        btnCollege.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnCollege.setForeground(new java.awt.Color(255, 255, 255));
        btnCollege.setText("College");
        btnCollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollegeActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 210, 60));

        btnCourse.setBackground(new java.awt.Color(128, 0, 32));
        btnCourse.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnCourse.setText("Course");
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 210, 60));

        btnStudent.setBackground(new java.awt.Color(128, 0, 32));
        btnStudent.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnStudent.setText("Student");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 210, 60));

        btnEmployee.setBackground(new java.awt.Color(128, 0, 32));
        btnEmployee.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployee.setText("Employee");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });
        pnlNavbar.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 210, 60));

        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setText("MENU");
        pnlNavbar.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblOthers.setForeground(new java.awt.Color(255, 255, 255));
        lblOthers.setText("OTHERS");
        lblOthers.setToolTipText("");
        pnlNavbar.add(lblOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

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
        lblTitleStudentCount.setText("Student Count");
        pnlContStudentCount.add(lblTitleStudentCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 190, 30));

        lblStudentCount.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
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
        lblTitleEmployeeCount.setText("Employee Count");
        pnlContEmployeeCount.add(lblTitleEmployeeCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 190, 30));

        lblEmployeeCount.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        lblEmployeeCount.setText("1");
        pnlContEmployeeCount.add(lblEmployeeCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 190, 40));

        lblEmployeeIcon.setToolTipText("label");
        pnlContEmployeeCount.add(lblEmployeeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        pnlBgEmployeeCount.add(pnlContEmployeeCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 80));

        pnlViewsHeader.add(pnlBgEmployeeCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 290, 100));

        pnlViews.add(pnlViewsHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 120));

        tabbViewsNav.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N

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
        lblssCollegeFilter.setText("College");
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

        btnSubjectScheduleFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnSubjectScheduleFilter.setText("Search");
        btnSubjectScheduleFilter.setPreferredSize(new java.awt.Dimension(84, 20));
        btnSubjectScheduleFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubjectScheduleFilterActionPerformed(evt);
            }
        });
        pnlSubSchedSearch.add(btnSubjectScheduleFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 80, -1));

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
        btnStudentGradesFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentGradesFilterActionPerformed(evt);
            }
        });
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

        pnlSubSchedInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), " Course Details ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 18))); // NOI18N
        pnlSubSchedInfo.setMinimumSize(new java.awt.Dimension(830, 200));
        pnlSubSchedInfo.setOpaque(false);
        pnlSubSchedInfo.setPreferredSize(new java.awt.Dimension(830, 200));
        pnlSubSchedInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblssSchoolYear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssSchoolYear.setText("School Year      :");
        lblssSchoolYear.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssSchoolYear.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 105, 20));

        lblssSemester.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssSemester.setText("Semester         :");
        lblssSemester.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssSemester.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 65, 105, 20));

        lblssCollegeCode.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssCollegeCode.setText("College Code   :");
        lblssCollegeCode.setMinimumSize(new java.awt.Dimension(80, 20));
        pnlSubSchedInfo.add(lblssCollegeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 95, 105, 20));

        lblssBlockNo.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssBlockNo.setText("Block No          :");
        lblssBlockNo.setMinimumSize(new java.awt.Dimension(80, 20));
        pnlSubSchedInfo.add(lblssBlockNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, 105, 20));

        lblssSubjectCode.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssSubjectCode.setText("Subject Code   :");
        lblssSubjectCode.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssSubjectCode.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssSubjectCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, 105, 20));

        lblssDay.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssDay.setText("Day          :");
        lblssDay.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssDay.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 35, 70, -1));

        lblssTime.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssTime.setText("Time        :");
        lblssTime.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssTime.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 65, 70, -1));

        lblssType.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssType.setText("Type        :");
        lblssType.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssType.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssType, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 95, 70, -1));

        lblssRoom.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssRoom.setText("Room      :");
        lblssRoom.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssRoom.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 125, 70, -1));

        lblssSequenceNo.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssSequenceNo.setText("Sequence No  :");
        lblssSequenceNo.setMinimumSize(new java.awt.Dimension(80, 20));
        pnlSubSchedInfo.add(lblssSequenceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 35, 100, -1));

        lblssFacultyID.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssFacultyID.setText("Faculty ID   :");
        lblssFacultyID.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssFacultyID.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssFacultyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 65, 100, -1));

        lblssFacultyNameTitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblssFacultyNameTitle.setText("Faculty Name  :");
        lblssFacultyNameTitle.setMinimumSize(new java.awt.Dimension(80, 20));
        lblssFacultyNameTitle.setPreferredSize(new java.awt.Dimension(100, 20));
        pnlSubSchedInfo.add(lblssFacultyNameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 95, 110, -1));

        lblFacultyName.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
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
        cmbssSchoolYear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbssSchoolYear.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssSchoolYear.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 35, 140, 20));

        cmbssCollegeCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssCollegeCode.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssCollegeCode.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssCollegeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 95, 140, 20));

        txtssBlockNo.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtssBlockNo.setMinimumSize(new java.awt.Dimension(140, 20));
        txtssBlockNo.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(txtssBlockNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 125, 140, 20));

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
        cmbssFacultyID.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbssFacultyIDPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        pnlSubSchedInfo.add(cmbssFacultyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 65, 140, 20));

        cmbssSubjectCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbssSubjectCode.setMinimumSize(new java.awt.Dimension(140, 20));
        cmbssSubjectCode.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlSubSchedInfo.add(cmbssSubjectCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 155, 140, 20));

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
        btnSubSchedClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubSchedClearActionPerformed(evt);
            }
        });
        pnlSubSchedBtns.add(btnSubSchedClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 120, 30));

        btnSubSchedAdd.setText("Add");
        btnSubSchedAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubSchedAddActionPerformed(evt);
            }
        });
        pnlSubSchedBtns.add(btnSubSchedAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 120, 30));

        btnSubSchedUpdate.setText("Update");
        btnSubSchedUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubSchedUpdateActionPerformed(evt);
            }
        });
        pnlSubSchedBtns.add(btnSubSchedUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 120, 30));

        btnSubSchedDelete.setText("Delete");
        btnSubSchedDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubSchedDeleteActionPerformed(evt);
            }
        });
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
        tblStudGrades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudGradesMouseClicked(evt);
            }
        });
        scrllStudGrades.setViewportView(tblStudGrades);

        pnlStudGrades.add(scrllStudGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 830, 530));

        pnlStudGradesBtns.setOpaque(false);
        pnlStudGradesBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblsgStudentNumber.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lblsgStudentNumber.setText("Student Number  :");
        lblsgStudentNumber.setMinimumSize(new java.awt.Dimension(125, 20));
        lblsgStudentNumber.setPreferredSize(new java.awt.Dimension(125, 20));
        pnlStudGradesBtns.add(lblsgStudentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 125, -1));

        txtsgStudentNumber.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtsgStudentNumber.setMinimumSize(new java.awt.Dimension(140, 20));
        txtsgStudentNumber.setPreferredSize(new java.awt.Dimension(150, 20));
        pnlStudGradesBtns.add(txtsgStudentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 150, 20));

        btnStudGradesAdd.setText("Add");
        btnStudGradesAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnStudGradesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudGradesAddActionPerformed(evt);
            }
        });
        pnlStudGradesBtns.add(btnStudGradesAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 120, 30));

        btnStudGradesUpdate.setText("Update");
        btnStudGradesUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudGradesUpdateActionPerformed(evt);
            }
        });
        pnlStudGradesBtns.add(btnStudGradesUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 120, 30));

        btnStudGradesDelete.setText("Delete");
        btnStudGradesDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudGradesDeleteActionPerformed(evt);
            }
        });
        pnlStudGradesBtns.add(btnStudGradesDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 120, 30));

        btnStudGradesSearch.setText("Search");
        btnStudGradesSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnStudGradesSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudGradesSearchActionPerformed(evt);
            }
        });
        pnlStudGradesBtns.add(btnStudGradesSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 70, 30));

        pnlStudGrades.add(pnlStudGradesBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 830, 40));

        pnlFramebg.add(pnlStudGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        pnlSchoolYear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSchoolYear.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSchoolYear.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSchoolYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSchoolYearMouseClicked(evt);
            }
        });
        scrllSchoolYear.setViewportView(tblSchoolYear);

        pnlSchoolYear.add(scrllSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 270, -1));

        pnlSchoolYearBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDash.setText("-");
        pnlSchoolYearBtns.add(lblDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 10, 20));

        lblEndSY.setText("End (YYYY)");
        pnlSchoolYearBtns.add(lblEndSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, 20));

        lblStartSY2.setText("Start (YYYY)");
        pnlSchoolYearBtns.add(lblStartSY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 70, 20));

        btnSchoolYearAdd.setText("Add");
        btnSchoolYearAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolYearAddActionPerformed(evt);
            }
        });
        pnlSchoolYearBtns.add(btnSchoolYearAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 120, -1));

        btnSchoolYearUpdate.setText("Update");
        btnSchoolYearUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolYearUpdateActionPerformed(evt);
            }
        });
        pnlSchoolYearBtns.add(btnSchoolYearUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 120, -1));

        btnSchoolYearDelete.setText("Delete");
        btnSchoolYearDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolYearDeleteActionPerformed(evt);
            }
        });
        pnlSchoolYearBtns.add(btnSchoolYearDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 120, -1));

        txtStartSY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartSYActionPerformed(evt);
            }
        });
        pnlSchoolYearBtns.add(txtStartSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 80, -1));
        pnlSchoolYearBtns.add(txtEndSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 80, -1));

        pnlSchoolYear.add(pnlSchoolYearBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 300, 430));

        pnlFramebg.add(pnlSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 870, 640));

        pnlSemester.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlSemester.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSemester.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSemester.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSemesterMouseClicked(evt);
            }
        });
        scrllSemester.setViewportView(tblSemester);

        pnlSemester.add(scrllSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 270, -1));

        pnlSemesterBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSemester.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSemester.setText("Semester");
        pnlSemesterBtns.add(lblSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 90, 20));

        btnSemesterAdd.setText("Add");
        btnSemesterAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemesterAddActionPerformed(evt);
            }
        });
        pnlSemesterBtns.add(btnSemesterAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, -1));

        btnSemesterUpdate.setText("Update");
        btnSemesterUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemesterUpdateActionPerformed(evt);
            }
        });
        pnlSemesterBtns.add(btnSemesterUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 90, -1));

        btnSemesterDelete.setText("Delete");
        btnSemesterDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemesterDeleteActionPerformed(evt);
            }
        });
        pnlSemesterBtns.add(btnSemesterDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 90, -1));
        pnlSemesterBtns.add(txtSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 90, -1));

        pnlSemester.add(pnlSemesterBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 300, 430));

        pnlFramebg.add(pnlSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        pnlCollege.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlCollege.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlFramebg.add(pnlCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));
        pnlCollege.getAccessibleContext().setAccessibleName("");

        pnlCourse.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlFramebg.add(pnlCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        pnlStudent.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlFramebg.add(pnlStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        pnlEmployee.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlFramebg.add(pnlEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        pnlSubject.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlFramebg.add(pnlSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

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
        // for tables
        setTableDisplays();
        
        // for stats panel
        setStudCount();
        setEmployeeCount();

        // for cmbbx VIEWS
        setCMBSubSchedViewFilter();
        setCMBStudGradeViewFilter();
        
        setCMBSubSched();
    }
    
    public void setTableDisplays(){
        try {
            // sched view
            conn = ConnectDB.Connect();
            ps = conn.prepareStatement("SELECT * FROM plm.subj_sched");
            rs = ps.executeQuery();
            tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            
            // grade view
            ps = conn.prepareStatement("SELECT * FROM plm.stud_gradeTwo"); // stud_grade
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
            
            // schoolyear 
            ps = conn.prepareStatement("SELECT * FROM plm.schoolyear");
            rs = ps.executeQuery();
            tblSchoolYear.setModel(DbUtils.resultSetToTableModel(rs));
            
            // semester
            ps = conn.prepareStatement("SELECT * FROM plm.semester");
            rs = ps.executeQuery();
            tblSemester.setModel(DbUtils.resultSetToTableModel(rs));

            // 
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void setStudCount(){
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
    
    public void setEmployeeCount(){
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

    public void setCMBSubSchedViewFilter(){
        try {
            cmbssSchoolYearFilter.removeAllItems();
            ps = conn.prepareStatement("SELECT syear FROM schoolyear");
            rs = ps.executeQuery();
            cmbssSchoolYearFilter.addItem(" -- ");
            while (rs.next())
                cmbssSchoolYearFilter.addItem(rs.getString("syear"));
            
            cmbssSemesterFilter.removeAllItems();
            ps = conn.prepareStatement("SELECT semester FROM semester");
            rs = ps.executeQuery();
            cmbssSemesterFilter.addItem(" -- ");
            while (rs.next())
                cmbssSemesterFilter.addItem(rs.getString("semester"));
            
            cmbssCollegeFilter.removeAllItems();
            ps = conn.prepareStatement("SELECT college_code FROM college");
            rs = ps.executeQuery();
            cmbssCollegeFilter.addItem(" -- ");
            while (rs.next())
                cmbssCollegeFilter.addItem(rs.getString("college_code"));
            
            cmbssBlockNoFilter.removeAllItems();
            ps = conn.prepareStatement("SELECT block_no FROM subject_schedule");
            rs = ps.executeQuery();
            cmbssBlockNoFilter.addItem(" -- ");
            while (rs.next())
                cmbssBlockNoFilter.addItem(rs.getString("block_no"));
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void setCMBStudGradeViewFilter(){
        try {
            cmbsgSchoolYearFilter.removeAllItems();
            ps = conn.prepareStatement("SELECT syear FROM schoolyear");
            rs = ps.executeQuery();
            cmbsgSchoolYearFilter.addItem(" -- ");
            while (rs.next())
                cmbsgSchoolYearFilter.addItem(rs.getString("syear"));
            
            cmbsgSemesterFilter.removeAllItems();
            ps = conn.prepareStatement("SELECT semester FROM semester");
            rs = ps.executeQuery();
            cmbsgSemesterFilter.addItem(" -- ");
            while (rs.next())
                cmbsgSemesterFilter.addItem(rs.getString("semester"));
            
            cmbsgSubjectCodeFilter.removeAllItems();
            ps = conn.prepareStatement("SELECT subject_code FROM plm.subject");
            rs = ps.executeQuery();
            cmbsgSubjectCodeFilter.addItem(" -- ");
            while(rs.next())
                cmbsgSubjectCodeFilter.addItem(rs.getString("subject_code"));
            
            cmbsgBlockNoFilter.removeAllItems();
            ps = conn.prepareStatement("SELECT block_no FROM subject_schedule");
            rs = ps.executeQuery();
            cmbsgBlockNoFilter.addItem(" -- ");
            while (rs.next())
                cmbsgBlockNoFilter.addItem(rs.getString("block_no"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    private void btnViewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewsActionPerformed
        // TODO add your handling code here:
        pnlViews.setVisible(true);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(false);
        pnlSchoolYear.setVisible(false);
        pnlSemester.setVisible(false);
        pnlCollege.setVisible(false);
        pnlCourse.setVisible(false);
        pnlStudent.setVisible(false);
        pnlEmployee.setVisible(false);
        pnlSubject.setVisible(false);
        refresh();
    }//GEN-LAST:event_btnViewsActionPerformed

    private void btnSubSchedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubSchedActionPerformed
        // TODO add your handling code here:
        pnlViews.setVisible(false);
        pnlSubSched.setVisible(true);
        pnlStudGrades.setVisible(false);
        pnlSchoolYear.setVisible(false);
        pnlSemester.setVisible(false);
        pnlCollege.setVisible(false);
        pnlCourse.setVisible(false);
        pnlStudent.setVisible(false);
        pnlEmployee.setVisible(false);
        pnlSubject.setVisible(false);
        refresh();
    }//GEN-LAST:event_btnSubSchedActionPerformed

    private void btnStudGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudGradesActionPerformed
        // TODO add your handling code here:
        pnlViews.setVisible(false);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(true);
        pnlSchoolYear.setVisible(false);
        pnlSemester.setVisible(false);
        pnlCollege.setVisible(false);
        pnlCourse.setVisible(false);
        pnlStudent.setVisible(false);
        pnlEmployee.setVisible(false);
        pnlSubject.setVisible(false);
        refresh();
    }//GEN-LAST:event_btnStudGradesActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        refresh();
    }//GEN-LAST:event_formWindowActivated

    private void tblSubSchedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSubSchedMouseClicked
        int row = tblSubSched.getSelectedRow();
        cmbssSchoolYear.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 0)));
        cmbssSemester1.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 1)));
        cmbssCollegeCode.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 2)));
        txtssBlockNo.setText(getValueOrDefault(tblSubSched.getValueAt(row, 3)));
        cmbssSubjectCode.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 4)));
        cmbssDay.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 5)));
        txtssTime.setText(getValueOrDefault(tblSubSched.getValueAt(row, 6)));
        cmbssType.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 8)));
        txtssRoom.setText(getValueOrDefault(tblSubSched.getValueAt(row, 7)));
        txtssSequenceNo.setText(getValueOrDefault(tblSubSched.getValueAt(row, 9)));
        cmbssFacultyID.setSelectedItem(getValueOrDefault(tblSubSched.getValueAt(row, 10)));
        setFacultyEmployee();
        SubjectSchedule draft = new SubjectSchedule(
                cmbssSchoolYear.getSelectedItem().toString(), cmbssSemester1.getSelectedItem().toString(), cmbssCollegeCode.getSelectedItem().toString(),
                txtssBlockNo.getText().toString(), cmbssSubjectCode.getSelectedItem().toString(), cmbssDay.getSelectedItem().toString(),
                txtssTime.getText().toString(), cmbssType.getSelectedItem().toString(), txtssRoom.getText().toString(),
                Integer.parseInt(txtssSequenceNo.getText()), cmbssFacultyID.getSelectedItem().toString());
        this.SubjectSchedule = draft;
    }//GEN-LAST:event_tblSubSchedMouseClicked

    public void setCMBSubSched(){ 
        try {
            cmbssSchoolYear.removeAllItems();
            ps = conn.prepareStatement("SELECT syear FROM plm.schoolyear");
            rs = ps.executeQuery();
            while(rs.next())
                cmbssSchoolYear.addItem(rs.getString("syear"));
            
            cmbssSemester1.removeAllItems();
            ps = conn.prepareStatement("SELECT semester FROM plm.semester");
            rs = ps.executeQuery();
            while(rs.next())
                cmbssSemester1.addItem(rs.getString("semester"));
            
            cmbssCollegeCode.removeAllItems();
            ps = conn.prepareStatement("SELECT college_code FROM plm.college");
            rs = ps.executeQuery();
            while(rs.next())
                cmbssCollegeCode.addItem(rs.getString("college_code"));
            
            // blk no. textfield
            
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
            
            setFacultyEmployee();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    private void tblStudGradesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudGradesMouseClicked
        // needs design fix
    }//GEN-LAST:event_tblStudGradesMouseClicked

    private void cmbsgSubjectCodeFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsgSubjectCodeFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsgSubjectCodeFilterActionPerformed

    private void cmbssCollegeFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbssCollegeFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbssCollegeFilterActionPerformed
                                                     
    private void btnSubjectScheduleFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubjectScheduleFilterActionPerformed
        try {
            if (cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("A: all --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched");
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    !cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    !cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    !cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){ 
                System.out.println("B: all has choices");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "school_year LIKE ? AND "
                        + "sem LIKE ? AND "
                        + "college LIKE ? AND "
                        + "block LIKE ?");
                ps.setString(1, cmbssSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbssSemesterFilter.getSelectedItem().toString());
                ps.setString(3, cmbssCollegeFilter.getSelectedItem().toString());
                ps.setString(4, cmbssBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("C: A is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "school_year LIKE ?");
                ps.setString(1, cmbssSchoolYearFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    !cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("D: A and B is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "school_year LIKE ? AND "
                        + "sem LIKE ?");
                ps.setString(1, cmbssSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbssSemesterFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    !cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    !cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("E: A, B, and C is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "school_year LIKE ? AND "
                        + "sem LIKE ? AND "
                        + "college LIKE ?");
                ps.setString(1, cmbssSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbssSemesterFilter.getSelectedItem().toString());
                ps.setString(3, cmbssCollegeFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    !cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    !cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    !cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("F: B, C, and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "sem LIKE ? AND "
                        + "college LIKE ? AND "
                        + "block LIKE ?");
                ps.setString(1, cmbssSemesterFilter.getSelectedItem().toString());
                ps.setString(2, cmbssCollegeFilter.getSelectedItem().toString());
                ps.setString(3, cmbssBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    !cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    !cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("G: C and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "college LIKE ? AND "
                        + "block LIKE ?");
                ps.setString(1, cmbssCollegeFilter.getSelectedItem().toString());
                ps.setString(2, cmbssBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    !cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("H: D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "block LIKE ?");
                ps.setString(1, cmbssBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    !cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("I: A and C is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "school_year LIKE ? AND "
                        + "college LIKE ?");
                ps.setString(1, cmbssSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbssCollegeFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    !cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    !cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("J: B and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "sem LIKE ? AND "
                        + "block LIKE ?");
                ps.setString(1, cmbssSemesterFilter.getSelectedItem().toString());
                ps.setString(2, cmbssBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    !cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("K: A and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "school_year LIKE ? AND "
                        + "block LIKE ?");
                ps.setString(1, cmbssSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbssBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    !cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    !cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("L: B and C is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "sem LIKE ? AND "
                        + "college LIKE ?");
                ps.setString(1, cmbssSemesterFilter.getSelectedItem().toString());
                ps.setString(2, cmbssCollegeFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    !cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("M: B is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "sem LIKE ?");
                ps.setString(1, cmbssSemesterFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    !cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("N: C is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "college LIKE ?");
                ps.setString(1, cmbssCollegeFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    !cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    !cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("O: A, B, and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "school_year LIKE ? AND "
                        + "sem LIKE ? AND "
                        + "block LIKE ?");
                ps.setString(1, cmbssSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbssSemesterFilter.getSelectedItem().toString());
                ps.setString(3, cmbssBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbssSchoolYearFilter.getSelectedItem().equals(cmbssSchoolYearFilter.getItemAt(0)) && 
                    cmbssSemesterFilter.getSelectedItem().equals(cmbssSemesterFilter.getItemAt(0)) &&
                    !cmbssCollegeFilter.getSelectedItem().equals(cmbssCollegeFilter.getItemAt(0)) &&
                    !cmbssBlockNoFilter.getSelectedItem().equals(cmbssBlockNoFilter.getItemAt(0))){
                System.out.println("P: A, C, and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.subj_sched WHERE "
                        + "school_year LIKE ? AND "
                        + "college LIKE ? AND "
                        + "block LIKE ?");
                ps.setString(1, cmbssSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbssCollegeFilter.getSelectedItem().toString());
                ps.setString(3, cmbssBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblSubSchedView.setModel(DbUtils.resultSetToTableModel(rs));   
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSubjectScheduleFilterActionPerformed

    private void btnStudentGradesFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentGradesFilterActionPerformed
        try {
            if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("1: all has choices");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "semester LIKE ? AND "
                        + "subject_code LIKE ? AND "
                        + "block_no LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(3, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(4, cmbsgBlockNoFilter.getSelectedItem().toString());
                ps.setString(5, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("2: A, B, C, and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "semester LIKE ? AND "
                        + "subject_code LIKE ? AND "
                        + "block_no LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(3, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(4, cmbsgBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("3: A, B, C, and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "semester LIKE ? AND "
                        + "subject_code LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(3, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(4, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("4: A, B, C is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "semester LIKE ? AND "
                        + "subject_code LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(3, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("5: A, B, D, and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "semester LIKE ? AND "
                        + "block_no LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(3, cmbsgBlockNoFilter.getSelectedItem().toString());
                ps.setString(4, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("6: A, B, and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "semester LIKE ? AND "
                        + "block_no LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(3, cmbsgBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("7: A, B, and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "semester LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(3, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("8: A and B is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "semester LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSemesterFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("9: A, C, D, and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "subject_code LIKE ? AND "
                        + "block_no LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgBlockNoFilter.getSelectedItem().toString());
                ps.setString(3, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("10: A, C, and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "subject_code LIKE ? AND "
                        + "block_no LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(3, cmbsgBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("11: A, C, and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "subject_code LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(3, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("12: A and C is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "subject_code LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("13: A, D, and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "block_no LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgBlockNoFilter.getSelectedItem().toString());
                ps.setString(3, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("14: A and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "block_no LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("15: A and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                ps.setString(2, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (!cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("16: A is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "school_year LIKE ?");
                ps.setString(1, cmbsgSchoolYearFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("17: B, C, D, and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "semester LIKE ? AND "
                        + "subject_code LIKE ? AND "
                        + "block_no LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(3, cmbsgBlockNoFilter.getSelectedItem().toString());
                ps.setString(4, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("18: B, C, and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "semester LIKE ? AND "
                        + "subject_code LIKE ? AND "
                        + "block_no LIKE ?");
                ps.setString(1, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(3, cmbsgBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("19: B, C, and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "semester LIKE ? AND "
                        + "subject_code LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(3, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("20: B and C is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "semester LIKE ? AND "
                        + "subject_code LIKE ?");
                ps.setString(1, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("21: B, D, and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "semester LIKE ? AND "
                        + "block_no LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgBlockNoFilter.getSelectedItem().toString());
                ps.setString(3, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("22: B and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "semester LIKE ? AND "
                        + "block_no LIKE ?");
                ps.setString(1, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("23: B and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "semester LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSemesterFilter.getSelectedItem().toString());
                ps.setString(2, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                !cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("24: B is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "semester LIKE ?");
                ps.setString(1, cmbsgSemesterFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("25: C, D, and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "subject_code LIKE ? AND "
                        + "block_no LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgBlockNoFilter.getSelectedItem().toString());
                ps.setString(3, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("26: C and D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "subject_code LIKE ? AND "
                        + "block_no LIKE ?");
                ps.setString(1, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(2, cmbsgBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("27: C and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "subject_code LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                ps.setString(2, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                !cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("28: C is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "subject_code LIKE ?");
                ps.setString(1, cmbsgSubjectCodeFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("29: D and E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "block_no LIKE ? AND "
                        + "student_number LIKE ?");
                ps.setString(1, cmbsgBlockNoFilter.getSelectedItem().toString());
                ps.setString(2, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                !cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("30: D is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "block_no LIKE ?");
                ps.setString(1, cmbsgBlockNoFilter.getSelectedItem().toString());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                !txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("31: E is not --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade WHERE "
                        + "student_number LIKE ?");
                ps.setString(1, txtsgStudentNoFilter.getText().trim());
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (cmbsgSchoolYearFilter.getSelectedItem().equals(cmbsgSchoolYearFilter.getItemAt(0)) && 
                cmbsgSemesterFilter.getSelectedItem().equals(cmbsgSemesterFilter.getItemAt(0)) && 
                cmbsgSubjectCodeFilter.getSelectedItem().equals(cmbsgSubjectCodeFilter.getItemAt(0)) && 
                cmbsgBlockNoFilter.getSelectedItem().equals(cmbsgBlockNoFilter.getItemAt(0)) && 
                txtsgStudentNoFilter.getText().trim().isBlank()){
                System.out.println("32: all are --");
                ps = conn.prepareStatement("SELECT * FROM plm.stud_grade");
                rs = ps.executeQuery();
                tblStudGradesView.setModel(DbUtils.resultSetToTableModel(rs));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnStudentGradesFilterActionPerformed

    private void cmbssFacultyIDPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbssFacultyIDPopupMenuWillBecomeInvisible
        setFacultyEmployee();
    }//GEN-LAST:event_cmbssFacultyIDPopupMenuWillBecomeInvisible
    
    public void setFacultyEmployee(){
        try {
            ps = conn.prepareStatement("SELECT * FROM plm.employee WHERE "
                    + "employee_id LIKE ?");
            ps.setString(1, cmbssFacultyID.getSelectedItem().toString());
            rs = ps.executeQuery();
            while(rs.next())
                lblFacultyName.setText(rs.getString("lastname") + ", " + rs.getString("firstname"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    private void btnSubSchedClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubSchedClearActionPerformed
        cmbssSchoolYear.setSelectedItem(cmbssSchoolYear.getItemAt(0));
        cmbssSemester1.setSelectedItem(cmbssSemester1.getItemAt(0));
        cmbssCollegeCode.setSelectedItem(cmbssCollegeCode.getItemAt(0));
        txtssBlockNo.setText("");
        cmbssSubjectCode.setSelectedItem(cmbssSubjectCode.getItemAt(0));
        cmbssDay.setSelectedItem(cmbssDay.getItemAt(0));
        txtssTime.setText("");
        cmbssType.setSelectedItem(cmbssType.getItemAt(0));
        txtssRoom.setText("");
        txtssSequenceNo.setText("");
        cmbssFacultyID.setSelectedItem(cmbssFacultyID.getItemAt(0));
        setFacultyEmployee();
    }//GEN-LAST:event_btnSubSchedClearActionPerformed

    // IMPROVE
    private void btnSubSchedAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubSchedAddActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to add?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){
            try {
                ps = conn.prepareStatement("INSERT INTO plm.subject_schedule "
                        + "(syear, semester, college_code, block_no, subject_code, "
                        + "day, time, room, type, sequence_no, employee_id) VALUES "
                        + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, cmbssSchoolYear.getSelectedItem().toString());
                ps.setString(2, cmbssSemester1.getSelectedItem().toString());
                ps.setString(3, cmbssCollegeCode.getSelectedItem().toString());
                ps.setString(4, txtssBlockNo.getText().trim());
                ps.setString(5, cmbssSubjectCode.getSelectedItem().toString());
                ps.setString(6, cmbssDay.getSelectedItem().toString());
                ps.setString(7, txtssTime.getText().trim());
                ps.setString(8, txtssRoom.getText().trim());
                ps.setString(9, cmbssType.getSelectedItem().toString());
                ps.setString(10, txtssSequenceNo.getText().trim());
                ps.setString(11, cmbssFacultyID.getSelectedItem().toString());
                rs = ps.executeQuery();
                JOptionPane.showMessageDialog(null, "Subject Schedule ADDED Successfully");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Syear, Semester, College, Block No, Sequence No, Employee No\nalready exists!");
            }
        } else
            JOptionPane.showMessageDialog(null, "Add was aborted.");
    }//GEN-LAST:event_btnSubSchedAddActionPerformed

    // NEEDS FIX (Catch selected values to map to filter)
    private void btnSubSchedUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubSchedUpdateActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to Edit?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){
            try {
                ps = conn.prepareStatement("UPDATE plm.subject_schedule SET "
                        + "syear = ?, "
                        + "semester = ?, "
                        + "college_code = ?, "
                        + "block_no = ?, "
                        + "subject_code = ?, "
                        + "day = ?, "
                        + "time = ?, "
                        + "room = ?, "
                        + "type = ?, "
                        + "sequence_no = ?, "
                        + "employee_id = ? "
                        + " WHERE "
                        + "syear = ? AND "
                        + "semester = ? AND "
                        + "college_code = ? AND "
                        + "block_no = ? AND "
                        + "subject_code = ? AND "
                        + "sequence_no = ?"); // 17
                ps.setString(1, cmbssSchoolYear.getSelectedItem().toString());
                ps.setString(2, cmbssSemester1.getSelectedItem().toString());
                ps.setString(3, cmbssCollegeCode.getSelectedItem().toString());
                ps.setString(4, txtssBlockNo.getText().trim());
                ps.setString(5, cmbssSubjectCode.getSelectedItem().toString());
                ps.setString(6, cmbssDay.getSelectedItem().toString());
                ps.setString(7, txtssTime.getText().trim());
                ps.setString(8, txtssRoom.getText().trim());
                ps.setString(9, cmbssType.getSelectedItem().toString());
                ps.setInt(10, Integer.parseInt(txtssSequenceNo.getText().trim()));
                ps.setString(11, cmbssFacultyID.getSelectedItem().toString());
                ps.setString(12, SubjectSchedule.getSyear());
                ps.setString(13, SubjectSchedule.getSemester());
                ps.setString(14, SubjectSchedule.getCollege_code());
                ps.setString(15, SubjectSchedule.getBlock_no());
                ps.setString(16, SubjectSchedule.getSubject_code());
                ps.setInt(17, SubjectSchedule.getSequence_no());
                rs = ps.executeQuery();
                JOptionPane.showMessageDialog(null, "Subject Schedule UPDATED Successfully ");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Syear, Semester, College, Block No, Sequence No, Employee No\nalready exists!");
            }
        } else
            JOptionPane.showMessageDialog(null, "Edit was aborted.");
    }//GEN-LAST:event_btnSubSchedUpdateActionPerformed

    private void btnSubSchedDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubSchedDeleteActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){
            try {
                ps = conn.prepareStatement("DELETE FROM plm.subject_schedule WHERE "
                        + "syear = ? AND "
                        + "semester = ? AND "
                        + "college_code = ? AND "
                        + "block_no = ? AND "
                        + "subject_code = ? AND "
                        + "sequence_no = ?");
                ps.setString(1, cmbssSchoolYear.getSelectedItem().toString());
                ps.setString(2, cmbssSemester1.getSelectedItem().toString());
                ps.setString(3, cmbssCollegeCode.getSelectedItem().toString());
                ps.setString(4, txtssBlockNo.getText());
                ps.setString(5, cmbssSubjectCode.getSelectedItem().toString());
                ps.setString(6, txtssSequenceNo.getText());
                rs = ps.executeQuery();
                JOptionPane.showMessageDialog(null, "Subject Schedule DELETED Successfully ");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Syear, Semester, College, Block No, Sequence No, Employee No\nalready exists!");
            }
        } else
            JOptionPane.showMessageDialog(null, "Delete was aborted.");
    }//GEN-LAST:event_btnSubSchedDeleteActionPerformed

    private void btnStudGradesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudGradesAddActionPerformed
        AddStudGrades addframe = new AddStudGrades();
        addframe.setVisible(true);
    }//GEN-LAST:event_btnStudGradesAddActionPerformed

    private void btnStudGradesUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudGradesUpdateActionPerformed
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

                for (int row = 0; row < tblStudGrades.getRowCount(); ++row){
                    for (int col = 0; col < tblStudGrades.getColumnCount(); ++col){
                        Object obj = tblStudGrades.getValueAt(row, col);
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
                refresh();
                JOptionPane.showMessageDialog(null, "Grades updated successfully.");
            } catch (SQLSyntaxErrorException e) { 
                JOptionPane.showMessageDialog(null, "Please input a valid number for grade.");
            } catch (Exception e){
                e.printStackTrace();  
            }
        } else 
            JOptionPane.showMessageDialog(null, "Update was aborted.");
    }//GEN-LAST:event_btnStudGradesUpdateActionPerformed

    private void btnStudGradesDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudGradesDeleteActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to DELETE selected records?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){            
            try {            
                ps = conn.prepareStatement("DELETE FROM plm.grades WHERE "
                        + "syear = ? AND "
                        + "semester = ? AND "
                        + "student_no = ? AND "
                        + "subject_code = ? AND "
                        + "block_no = ?");

                int[] c = tblStudGrades.getSelectedRows();
                for (int a : c){
                    ps.setObject(1, tblStudGrades.getValueAt(a, 0));
                    ps.setObject(2, tblStudGrades.getValueAt(a, 1));
                    ps.setObject(3, tblStudGrades.getValueAt(a, 2));
                    ps.setObject(4, tblStudGrades.getValueAt(a, 3));
                    ps.setObject(5, tblStudGrades.getValueAt(a, 4));
                    ps.executeUpdate();
                }
                refresh();
                JOptionPane.showMessageDialog(null, "Records deleted successfully.");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else 
            JOptionPane.showMessageDialog(null, "Deletion was aborted.");
    }//GEN-LAST:event_btnStudGradesDeleteActionPerformed

    private void btnStudGradesSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudGradesSearchActionPerformed
        if (!txtsgStudentNumber.getText().trim().isBlank()){
            try {
                ps = conn.prepareStatement("SELECT * FROM grades WHERE student_no = ?");
                ps.setObject(1, txtsgStudentNumber.getText().trim());
                rs = ps.executeQuery();
                if (rs.next()){
                    rs = ps.executeQuery();
                    tblStudGrades.setModel(DbUtils.resultSetToTableModel(rs));
                } else {
                    JOptionPane.showMessageDialog(null, "No record found for \"" + txtsgStudentNumber.getText().trim() + "\"");
                    txtsgStudentNumber.setText("");
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        } else
            JOptionPane.showMessageDialog(null, "Please input a student number. " + txtsgStudentNumber.getText().trim());
    }//GEN-LAST:event_btnStudGradesSearchActionPerformed

    private void btnSchoolYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchoolYearActionPerformed
        // TODO add your handling code here:
        pnlViews.setVisible(false);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(false);
        pnlSchoolYear.setVisible(true);
        pnlSemester.setVisible(false);
        pnlCollege.setVisible(false);
        pnlCourse.setVisible(false);
        pnlStudent.setVisible(false);
        pnlEmployee.setVisible(false);
        pnlSubject.setVisible(false);
        refresh();
    }//GEN-LAST:event_btnSchoolYearActionPerformed

    private void btnSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemesterActionPerformed
        // TODO add your handling code here:
        pnlViews.setVisible(false);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(false);
        pnlSchoolYear.setVisible(false);
        pnlSemester.setVisible(true);
        pnlCollege.setVisible(false);
        pnlCourse.setVisible(false);
        pnlStudent.setVisible(false);
        pnlEmployee.setVisible(false);
        pnlSubject.setVisible(false);
        refresh();
    }//GEN-LAST:event_btnSemesterActionPerformed

    private void txtStartSYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartSYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartSYActionPerformed

    private void btnSchoolYearAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchoolYearAddActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to ADD school year?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){            
            try {
                ps = conn.prepareStatement("INSERT INTO schoolyear VALUES (?)");
                if (txtStartSY.getText().trim().matches("\\d+") && txtEndSY.getText().trim().matches("\\d+") && 
                        txtStartSY.getText().trim().length() >= 4 && txtEndSY.getText().trim().length() >= 4){
                    ps.setObject(1, txtStartSY.getText().trim()+ "-" + txtEndSY.getText().trim());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "School Year added successfully.");
                } else 
                    JOptionPane.showMessageDialog(null, "Please enter a valid year!");
            } catch (SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "School year already exists!");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else 
            JOptionPane.showMessageDialog(null, "Add was aborted.");
    }//GEN-LAST:event_btnSchoolYearAddActionPerformed

    private void btnSchoolYearDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchoolYearDeleteActionPerformed
        Object obj = tblSchoolYear.getValueAt(tblSchoolYear.getSelectedRow(), tblSchoolYear.getSelectedColumn());
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to DELETE " + obj + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){            
            try {
                ps = conn.prepareStatement("DELETE FROM plm.schoolyear WHERE syear = ?");
                ps.setObject(1, obj);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "School year deletion successful");
            } catch (SQLIntegrityConstraintViolationException e){
                JOptionPane.showMessageDialog(null, obj + " cannot be deleted as it contains records!");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Deletion was aborted.");
        }
    }//GEN-LAST:event_btnSchoolYearDeleteActionPerformed

    private void btnSchoolYearUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchoolYearUpdateActionPerformed
        // not optimized
        Object obj = tblSchoolYear.getValueAt(tblSchoolYear.getSelectedRow(), tblSchoolYear.getSelectedColumn());
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to UPDATE " + obj + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){   
            try {
                ps = conn.prepareStatement("UPDATE schoolyear SET syear = ? WHERE syear = ?");
                
                if (obj.toString().matches("\\d{4}-\\d{4}")){
                     ps.setObject(1, obj);
                     ps.setObject(2, syear);
                     ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "School Year updated successfully.");
                } else 
                    JOptionPane.showMessageDialog(null, "Please enter a valid year!");
            } catch (SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "School year already exists!");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else 
            JOptionPane.showMessageDialog(null, "Update was aborted.");
    }//GEN-LAST:event_btnSchoolYearUpdateActionPerformed

    private void tblSchoolYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSchoolYearMouseClicked
        this.syear = tblSchoolYear.getValueAt(tblSchoolYear.getSelectedRow(), tblSchoolYear.getSelectedColumn()).toString();
    }//GEN-LAST:event_tblSchoolYearMouseClicked

    private void btnSemesterAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemesterAddActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to ADD semester?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){  
            try {
                ps = conn.prepareStatement("INSERT INTO semester VALUES (?)");
                ps.setObject(1, txtSemester.getText().trim());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Semester added successfully");
            } catch (SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "Semester already exists!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else 
            JOptionPane.showMessageDialog(null, "Add was aborted.");
    }//GEN-LAST:event_btnSemesterAddActionPerformed

    private void btnSemesterUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemesterUpdateActionPerformed
        Object obj = tblSemester.getValueAt(tblSemester.getSelectedRow(), tblSemester.getSelectedColumn());
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to UPDATE " + obj + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){   
            try {
                ps = conn.prepareStatement("UPDATE semester SET semester = ? WHERE semester = ?");
                ps.setObject(1, obj);
                ps.setObject(2, sem);
                System.out.println(sem);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Semester updated successfully.");
            } catch (SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "Semester already exists!");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else 
            JOptionPane.showMessageDialog(null, "Update was aborted."); 
    }//GEN-LAST:event_btnSemesterUpdateActionPerformed

    private void tblSemesterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSemesterMouseClicked
        this.sem = tblSemester.getValueAt(tblSemester.getSelectedRow(), tblSemester.getSelectedColumn()).toString();
    }//GEN-LAST:event_tblSemesterMouseClicked

    private void btnSemesterDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemesterDeleteActionPerformed
        Object obj = tblSemester.getValueAt(tblSemester.getSelectedRow(), tblSemester.getSelectedColumn());
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to DELETE " + obj + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){            
            try {
                ps = conn.prepareStatement("DELETE FROM plm.semester WHERE semester = ?");
                ps.setObject(1, obj);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Semester deleted successfully");
            } catch (SQLIntegrityConstraintViolationException e){
                JOptionPane.showMessageDialog(null, obj + " cannot be deleted as it contains records!");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Deletion was aborted.");
        }
    }//GEN-LAST:event_btnSemesterDeleteActionPerformed

    private void btnCollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollegeActionPerformed
        pnlViews.setVisible(false);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(false);
        pnlSchoolYear.setVisible(false);
        pnlSemester.setVisible(false);
        pnlCollege.setVisible(true);
        pnlCourse.setVisible(false);
        pnlStudent.setVisible(false);
        pnlEmployee.setVisible(false);
        pnlSubject.setVisible(false);
        refresh();
    }//GEN-LAST:event_btnCollegeActionPerformed

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        pnlViews.setVisible(false);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(false);
        pnlSchoolYear.setVisible(false);
        pnlSemester.setVisible(false);
        pnlCollege.setVisible(false);
        pnlCourse.setVisible(true);
        pnlStudent.setVisible(false);
        pnlEmployee.setVisible(false);
        pnlSubject.setVisible(false);
        refresh();
    }//GEN-LAST:event_btnCourseActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        pnlViews.setVisible(false);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(false);
        pnlSchoolYear.setVisible(false);
        pnlSemester.setVisible(false);
        pnlCollege.setVisible(false);
        pnlCourse.setVisible(false);
        pnlStudent.setVisible(true);
        pnlEmployee.setVisible(false);
        pnlSubject.setVisible(false);
        refresh();
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        pnlViews.setVisible(false);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(false);
        pnlSchoolYear.setVisible(false);
        pnlSemester.setVisible(false);
        pnlCollege.setVisible(false);
        pnlCourse.setVisible(false);
        pnlStudent.setVisible(false);
        pnlEmployee.setVisible(true);
        pnlSubject.setVisible(false);
        refresh();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubjectActionPerformed
        pnlViews.setVisible(false);
        pnlSubSched.setVisible(false);
        pnlStudGrades.setVisible(false);
        pnlSchoolYear.setVisible(false);
        pnlSemester.setVisible(false);
        pnlCollege.setVisible(false);
        pnlCourse.setVisible(false);
        pnlStudent.setVisible(false);
        pnlEmployee.setVisible(false);
        pnlSubject.setVisible(true);
        refresh();
    }//GEN-LAST:event_btnSubjectActionPerformed

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
    private javax.swing.JButton btnCollege;
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnSchoolYear;
    private javax.swing.JButton btnSchoolYearAdd;
    private javax.swing.JButton btnSchoolYearDelete;
    private javax.swing.JButton btnSchoolYearUpdate;
    private javax.swing.JButton btnSemester;
    private javax.swing.JButton btnSemesterAdd;
    private javax.swing.JButton btnSemesterDelete;
    private javax.swing.JButton btnSemesterUpdate;
    private javax.swing.JButton btnStudGrades;
    private javax.swing.JButton btnStudGradesAdd;
    private javax.swing.JButton btnStudGradesDelete;
    private javax.swing.JButton btnStudGradesSearch;
    private javax.swing.JButton btnStudGradesUpdate;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnStudentGradesFilter;
    private javax.swing.JButton btnSubSched;
    private javax.swing.JButton btnSubSchedAdd;
    private javax.swing.JButton btnSubSchedClear;
    private javax.swing.JButton btnSubSchedDelete;
    private javax.swing.JButton btnSubSchedUpdate;
    private javax.swing.JButton btnSubject;
    private javax.swing.JButton btnSubjectScheduleFilter;
    private javax.swing.JButton btnViews;
    private javax.swing.JComboBox<String> cmbsgBlockNoFilter;
    private javax.swing.JComboBox<String> cmbsgSchoolYearFilter;
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
    private javax.swing.JComboBox<String> cmbssType;
    private javax.swing.JLabel lblDash;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmployeeCount;
    private javax.swing.JLabel lblEmployeeIcon;
    private javax.swing.JLabel lblEndSY;
    private javax.swing.JLabel lblFacultyName;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblOthers;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblStartSY2;
    private javax.swing.JLabel lblStudentCount;
    private javax.swing.JLabel lblStudentIcon;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitleEmployeeCount;
    private javax.swing.JLabel lblTitleStudentCount;
    private javax.swing.JLabel lblsgBlockNoFilter;
    private javax.swing.JLabel lblsgFilterTitle;
    private javax.swing.JLabel lblsgSchoolYearFilter;
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
    private javax.swing.JPanel pnlCollege;
    private javax.swing.JPanel pnlContEmployeeCount;
    private javax.swing.JPanel pnlContStudentCount;
    private javax.swing.JPanel pnlCourse;
    private javax.swing.JPanel pnlEmployee;
    private javax.swing.JPanel pnlFramebg;
    private javax.swing.JPanel pnlHeaderbg;
    private javax.swing.JPanel pnlNavbar;
    private javax.swing.JPanel pnlSchoolYear;
    private javax.swing.JPanel pnlSchoolYearBtns;
    private javax.swing.JPanel pnlSemester;
    private javax.swing.JPanel pnlSemesterBtns;
    private javax.swing.JPanel pnlStudGrades;
    private javax.swing.JPanel pnlStudGradesBtns;
    private javax.swing.JPanel pnlStudGradesSearch;
    private javax.swing.JPanel pnlStudGradesViews;
    private javax.swing.JPanel pnlStudent;
    private javax.swing.JPanel pnlSubSched;
    private javax.swing.JPanel pnlSubSchedBtns;
    private javax.swing.JPanel pnlSubSchedInfo;
    private javax.swing.JPanel pnlSubSchedSearch;
    private javax.swing.JPanel pnlSubSchedView;
    private javax.swing.JPanel pnlSubject;
    private javax.swing.JPanel pnlViews;
    private javax.swing.JPanel pnlViewsHeader;
    private javax.swing.JScrollPane scrllSchoolYear;
    private javax.swing.JScrollPane scrllSemester;
    private javax.swing.JScrollPane scrllStudGrades;
    private javax.swing.JScrollPane scrllStudGradesView;
    private javax.swing.JScrollPane scrllSubSched;
    private javax.swing.JScrollPane scrllSubSchedView;
    private javax.swing.JTabbedPane tabbViewsNav;
    private javax.swing.JTable tblSchoolYear;
    private javax.swing.JTable tblSemester;
    private javax.swing.JTable tblStudGrades;
    private javax.swing.JTable tblStudGradesView;
    private javax.swing.JTable tblSubSched;
    private javax.swing.JTable tblSubSchedView;
    private javax.swing.JTextField txtEndSY;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtStartSY;
    private javax.swing.JTextField txtsgStudentNoFilter;
    private javax.swing.JTextField txtsgStudentNumber;
    private javax.swing.JTextField txtssBlockNo;
    private javax.swing.JTextField txtssRoom;
    private javax.swing.JTextField txtssSequenceNo;
    private javax.swing.JTextField txtssTime;
    // End of variables declaration//GEN-END:variables
}
