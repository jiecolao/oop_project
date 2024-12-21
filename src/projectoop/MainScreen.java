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
    String college;
    String course;
    String studentno;
    String employeeno;
    String subcode;
    
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
        lblSchoolYearTitle = new javax.swing.JLabel();
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
        lblSchoolYearTitle1 = new javax.swing.JLabel();
        scrllSemester = new javax.swing.JScrollPane();
        tblSemester = new javax.swing.JTable();
        pnlSemesterBtns = new javax.swing.JPanel();
        txtSemester = new javax.swing.JTextField();
        lblSemester = new javax.swing.JLabel();
        btnSemesterAdd = new javax.swing.JButton();
        btnSemesterUpdate = new javax.swing.JButton();
        btnSemesterDelete = new javax.swing.JButton();
        pnlCollege = new javax.swing.JPanel();
        scrllCollege = new javax.swing.JScrollPane();
        tblCollege = new javax.swing.JTable();
        lblCollegeCode = new javax.swing.JLabel();
        lblColDesc = new javax.swing.JLabel();
        lblDateOpened = new javax.swing.JLabel();
        lblDateClosed = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtCollegeCode = new javax.swing.JTextField();
        txtColDesc = new javax.swing.JTextField();
        txtDateOpened = new javax.swing.JTextField();
        txtDateClosed = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        btnAddCollege = new javax.swing.JButton();
        btnUpdateCollege = new javax.swing.JButton();
        btnDeleteCollege = new javax.swing.JButton();
        lblmmddyyyy1 = new javax.swing.JLabel();
        lblmmddyyyy2 = new javax.swing.JLabel();
        lblCollegeTItle = new javax.swing.JLabel();
        pnlCourse = new javax.swing.JPanel();
        scrllCourse = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        lblCourseCode = new javax.swing.JLabel();
        lblCollege = new javax.swing.JLabel();
        lblCourseDesc = new javax.swing.JLabel();
        lblDateOpened1 = new javax.swing.JLabel();
        lblDateClosed1 = new javax.swing.JLabel();
        lblStatus1 = new javax.swing.JLabel();
        txtCourseCode = new javax.swing.JTextField();
        txtCourseDesc = new javax.swing.JTextField();
        txtDateOpened1 = new javax.swing.JTextField();
        txtDateClosed1 = new javax.swing.JTextField();
        cmbCollege = new javax.swing.JComboBox<>();
        cmbStatus1 = new javax.swing.JComboBox<>();
        btnAddCourse = new javax.swing.JButton();
        btnUpdateCourse = new javax.swing.JButton();
        btnDeleteCourse = new javax.swing.JButton();
        lblmmddyyyy3 = new javax.swing.JLabel();
        lblmmddyyyy4 = new javax.swing.JLabel();
        lblSchoolYearTitle2 = new javax.swing.JLabel();
        pnlStudent = new javax.swing.JPanel();
        scrllStudent = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        lblStudentNo = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        txtStudentNo = new javax.swing.JTextField();
        cmbCourse = new javax.swing.JComboBox<>();
        btnAddStudent = new javax.swing.JButton();
        btnUpdateStudent = new javax.swing.JButton();
        btnDeleteStudent = new javax.swing.JButton();
        txtDateGraduated = new javax.swing.JTextField();
        lblDateGraduated = new javax.swing.JLabel();
        lblDateStart = new javax.swing.JLabel();
        txtDateStart = new javax.swing.JTextField();
        cmbStatus2 = new javax.swing.JComboBox<>();
        lblStatus2 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        lblLastName1 = new javax.swing.JLabel();
        lblFirstName1 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        lblMobileNo1 = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail1 = new javax.swing.JLabel();
        lblAddress1 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblBirthDate1 = new javax.swing.JLabel();
        txtBirthDate = new javax.swing.JTextField();
        lblmmddyyyy7 = new javax.swing.JLabel();
        lblmmddyyyy10 = new javax.swing.JLabel();
        lblmmddyyyy11 = new javax.swing.JLabel();
        pnlEmployee = new javax.swing.JPanel();
        scrllEmployee = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        txtEmployeeID = new javax.swing.JTextField();
        lblEmployeeID = new javax.swing.JLabel();
        lblLastNameEmp = new javax.swing.JLabel();
        txtLastNameEmp = new javax.swing.JTextField();
        lblFirstNameEmp = new javax.swing.JLabel();
        txtFirstNameEmp = new javax.swing.JTextField();
        lblEmailEmp = new javax.swing.JLabel();
        txtEmailEmp = new javax.swing.JTextField();
        cmbGenderEmp = new javax.swing.JComboBox<>();
        lblGenderEmp = new javax.swing.JLabel();
        lblMobileNoEmp = new javax.swing.JLabel();
        txtMobileNoEmp = new javax.swing.JTextField();
        lblAddressEmp = new javax.swing.JLabel();
        txtAddressEmp = new javax.swing.JTextField();
        lblBirthDateEmp = new javax.swing.JLabel();
        txtBirthDateEmp = new javax.swing.JTextField();
        lblDateStartEmp = new javax.swing.JLabel();
        txtDateStartEmp = new javax.swing.JTextField();
        lblStatus3 = new javax.swing.JLabel();
        cmbStatus3 = new javax.swing.JComboBox<>();
        lblDateGraduatedEmp = new javax.swing.JLabel();
        txtDateGraduatedEmp = new javax.swing.JTextField();
        btnAddEmp = new javax.swing.JButton();
        btnUpdateEmp = new javax.swing.JButton();
        btnDeleteEmp = new javax.swing.JButton();
        lblSchoolYearTitle4 = new javax.swing.JLabel();
        pnlSubject = new javax.swing.JPanel();
        scrllSubject = new javax.swing.JScrollPane();
        tblSubject = new javax.swing.JTable();
        lblSubjectCodeSub = new javax.swing.JLabel();
        txtSubjectCodeSub = new javax.swing.JTextField();
        lblCollegeSub = new javax.swing.JLabel();
        cmbCollegeSub = new javax.swing.JComboBox<>();
        lblSubjDesc = new javax.swing.JLabel();
        txtSubjDesc = new javax.swing.JTextField();
        lblUnits = new javax.swing.JLabel();
        txtUnits = new javax.swing.JTextField();
        lblCurriculumn = new javax.swing.JLabel();
        txtCurriculumn = new javax.swing.JTextField();
        lblDateOpenedSub = new javax.swing.JLabel();
        txtDateOpenedSub = new javax.swing.JTextField();
        lblDateClosedSub = new javax.swing.JLabel();
        txtDateClosedSub = new javax.swing.JTextField();
        lblStatusSub = new javax.swing.JLabel();
        cmbStatusSub = new javax.swing.JComboBox<>();
        btnAddSub = new javax.swing.JButton();
        btnUpdateSub = new javax.swing.JButton();
        btnDeleteSub = new javax.swing.JButton();
        lblmmddyyyy12 = new javax.swing.JLabel();
        lblmmddyyyy13 = new javax.swing.JLabel();

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
        btnViews.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnSubSched.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnStudGrades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnSchoolYear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnSemester.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnCollege.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        btnSubjectScheduleFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnSubjectScheduleFilter.setText("Search");
        btnSubjectScheduleFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        btnStudentGradesFilter.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnStudentGradesFilter.setText("Search");
        btnStudentGradesFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        pnlStudGrades.setRequestFocusEnabled(false);
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
        scrllStudGrades.setViewportView(tblStudGrades);

        pnlStudGrades.add(scrllStudGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 830, 530));

        pnlStudGradesBtns.setOpaque(false);
        pnlStudGradesBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblsgStudentNumber.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lblsgStudentNumber.setText("Student Number  :");
        lblsgStudentNumber.setMinimumSize(new java.awt.Dimension(125, 20));
        lblsgStudentNumber.setPreferredSize(new java.awt.Dimension(125, 20));
        pnlStudGradesBtns.add(lblsgStudentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 125, -1));

        txtsgStudentNumber.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtsgStudentNumber.setMinimumSize(new java.awt.Dimension(140, 20));
        txtsgStudentNumber.setPreferredSize(new java.awt.Dimension(150, 20));
        pnlStudGradesBtns.add(txtsgStudentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 190, 20));

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
        pnlStudGradesBtns.add(btnStudGradesSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 20, 100, 20));

        pnlStudGrades.add(pnlStudGradesBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 830, 40));

        pnlFramebg.add(pnlStudGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        pnlSchoolYear.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlSchoolYear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSchoolYearTitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblSchoolYearTitle.setText("School Year");
        pnlSchoolYear.add(lblSchoolYearTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 230, 44));

        scrllSchoolYear.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        tblSchoolYear.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
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

        pnlSchoolYear.add(scrllSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 430, -1));

        pnlSchoolYearBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDash.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblDash.setText("-");
        pnlSchoolYearBtns.add(lblDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 10, 20));

        lblEndSY.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblEndSY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEndSY.setText("End (YYYY)");
        pnlSchoolYearBtns.add(lblEndSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 70, 20));

        lblStartSY2.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblStartSY2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStartSY2.setText("Start (YYYY)");
        pnlSchoolYearBtns.add(lblStartSY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, 20));

        btnSchoolYearAdd.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnSchoolYearAdd.setText("Add");
        btnSchoolYearAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolYearAddActionPerformed(evt);
            }
        });
        pnlSchoolYearBtns.add(btnSchoolYearAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 110, 120, 30));

        btnSchoolYearUpdate.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnSchoolYearUpdate.setText("Update");
        btnSchoolYearUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolYearUpdateActionPerformed(evt);
            }
        });
        pnlSchoolYearBtns.add(btnSchoolYearUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 150, 120, 30));

        btnSchoolYearDelete.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnSchoolYearDelete.setText("Delete");
        btnSchoolYearDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolYearDeleteActionPerformed(evt);
            }
        });
        pnlSchoolYearBtns.add(btnSchoolYearDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 190, 120, 30));

        txtStartSY.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStartSY.setPreferredSize(new java.awt.Dimension(64, 20));
        pnlSchoolYearBtns.add(txtStartSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 20));

        txtEndSY.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtEndSY.setPreferredSize(new java.awt.Dimension(64, 20));
        pnlSchoolYearBtns.add(txtEndSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 120, 20));

        pnlSchoolYear.add(pnlSchoolYearBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 340, 430));

        pnlFramebg.add(pnlSchoolYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 870, 640));

        pnlSemester.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlSemester.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSchoolYearTitle1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblSchoolYearTitle1.setText("Semester");
        pnlSemester.add(lblSchoolYearTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 230, 44));

        tblSemester.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
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

        pnlSemester.add(scrllSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 430, -1));

        pnlSemesterBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSemester.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemesterActionPerformed(evt);
            }
        });
        pnlSemesterBtns.add(txtSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 150, 20));

        lblSemester.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblSemester.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSemester.setText("Semester");
        pnlSemesterBtns.add(lblSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 90, 20));

        btnSemesterAdd.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnSemesterAdd.setText("Add");
        btnSemesterAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemesterAddActionPerformed(evt);
            }
        });
        pnlSemesterBtns.add(btnSemesterAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, 30));

        btnSemesterUpdate.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnSemesterUpdate.setText("Update");
        btnSemesterUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemesterUpdateActionPerformed(evt);
            }
        });
        pnlSemesterBtns.add(btnSemesterUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 120, 30));

        btnSemesterDelete.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnSemesterDelete.setText("Delete");
        btnSemesterDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemesterDeleteActionPerformed(evt);
            }
        });
        pnlSemesterBtns.add(btnSemesterDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 120, 30));

        pnlSemester.add(pnlSemesterBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 340, 430));

        pnlFramebg.add(pnlSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 870, -1));

        pnlCollege.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlCollege.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCollege.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCollege.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCollege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCollegeMouseClicked(evt);
            }
        });
        scrllCollege.setViewportView(tblCollege);

        pnlCollege.add(scrllCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 430, -1));

        lblCollegeCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblCollegeCode.setText("College Code       :");
        pnlCollege.add(lblCollegeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 105, -1));

        lblColDesc.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblColDesc.setText("Description           :  ");
        pnlCollege.add(lblColDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 105, -1));

        lblDateOpened.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblDateOpened.setText("Date Opened       :  ");
        pnlCollege.add(lblDateOpened, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 105, -1));

        lblDateClosed.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblDateClosed.setText("Date Closed         :  ");
        pnlCollege.add(lblDateClosed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 105, 20));

        lblStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblStatus.setText("Status                   :  ");
        pnlCollege.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 105, -1));

        txtCollegeCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlCollege.add(txtCollegeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 130, 130, 20));

        txtColDesc.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlCollege.add(txtColDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 160, 210, 20));

        txtDateOpened.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlCollege.add(txtDateOpened, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 210, 180, 20));

        txtDateClosed.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlCollege.add(txtDateClosed, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 260, 180, 20));

        cmbStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        pnlCollege.add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 310, 90, 20));

        btnAddCollege.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnAddCollege.setText("Add");
        btnAddCollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCollegeActionPerformed(evt);
            }
        });
        pnlCollege.add(btnAddCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, 30));

        btnUpdateCollege.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnUpdateCollege.setText("Update");
        btnUpdateCollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCollegeActionPerformed(evt);
            }
        });
        pnlCollege.add(btnUpdateCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 380, 100, 30));

        btnDeleteCollege.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnDeleteCollege.setText("Delete");
        btnDeleteCollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCollegeActionPerformed(evt);
            }
        });
        pnlCollege.add(btnDeleteCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 100, 30));

        lblmmddyyyy1.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblmmddyyyy1.setText("MM - DD - YYYY");
        pnlCollege.add(lblmmddyyyy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 280, -1, -1));

        lblmmddyyyy2.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblmmddyyyy2.setText("MM - DD - YYYY");
        pnlCollege.add(lblmmddyyyy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 230, -1, -1));

        lblCollegeTItle.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblCollegeTItle.setText("College");
        pnlCollege.add(lblCollegeTItle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 230, 44));

        pnlFramebg.add(pnlCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));
        pnlCollege.getAccessibleContext().setAccessibleName("");

        pnlCourse.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlCourse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCourseMouseClicked(evt);
            }
        });
        scrllCourse.setViewportView(tblCourse);

        pnlCourse.add(scrllCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 430, -1));

        lblCourseCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblCourseCode.setText("Course Code :");
        pnlCourse.add(lblCourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        lblCollege.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblCollege.setText("College :");
        pnlCourse.add(lblCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 20));

        lblCourseDesc.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblCourseDesc.setText("Description : ");
        pnlCourse.add(lblCourseDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        lblDateOpened1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblDateOpened1.setText("Date Opened :  ");
        pnlCourse.add(lblDateOpened1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 105, 20));

        lblDateClosed1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblDateClosed1.setText("Date Closed:  ");
        pnlCourse.add(lblDateClosed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 105, 20));

        lblStatus1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblStatus1.setText("Status : ");
        pnlCourse.add(lblStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 105, 20));

        txtCourseCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlCourse.add(txtCourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 100, 20));

        txtCourseDesc.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlCourse.add(txtCourseDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 210, 20));

        txtDateOpened1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlCourse.add(txtDateOpened1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 180, 20));

        txtDateClosed1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlCourse.add(txtDateClosed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 180, 20));

        cmbCollege.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlCourse.add(cmbCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 80, 20));

        cmbStatus1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbStatus1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        pnlCourse.add(cmbStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, 20));

        btnAddCourse.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnAddCourse.setText("Add");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });
        pnlCourse.add(btnAddCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, 30));

        btnUpdateCourse.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnUpdateCourse.setText("Update");
        btnUpdateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCourseActionPerformed(evt);
            }
        });
        pnlCourse.add(btnUpdateCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 380, 100, 30));

        btnDeleteCourse.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnDeleteCourse.setText("Delete");
        btnDeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCourseActionPerformed(evt);
            }
        });
        pnlCourse.add(btnDeleteCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 100, 30));

        lblmmddyyyy3.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblmmddyyyy3.setText("MM - DD - YYYY");
        pnlCourse.add(lblmmddyyyy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        lblmmddyyyy4.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblmmddyyyy4.setText("MM - DD - YYYY");
        pnlCourse.add(lblmmddyyyy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        lblSchoolYearTitle2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblSchoolYearTitle2.setText("Course");
        pnlCourse.add(lblSchoolYearTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 230, 44));

        pnlFramebg.add(pnlCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        pnlStudent.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
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
        tblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentMouseClicked(evt);
            }
        });
        scrllStudent.setViewportView(tblStudent);

        pnlStudent.add(scrllStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 430, 500));

        lblStudentNo.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblStudentNo.setText("Student No : ");
        pnlStudent.add(lblStudentNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 20));

        lblCourse.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblCourse.setText("Course : ");
        pnlStudent.add(lblCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 20));

        txtStudentNo.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlStudent.add(txtStudentNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 220, 20));

        cmbCourse.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlStudent.add(cmbCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, 20));

        btnAddStudent.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnAddStudent.setText("Add");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });
        pnlStudent.add(btnAddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 100, 30));

        btnUpdateStudent.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnUpdateStudent.setText("Update");
        btnUpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStudentActionPerformed(evt);
            }
        });
        pnlStudent.add(btnUpdateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 550, 100, 30));

        btnDeleteStudent.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnDeleteStudent.setText("Delete");
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });
        pnlStudent.add(btnDeleteStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 100, 30));

        txtDateGraduated.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlStudent.add(txtDateGraduated, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 435, 210, 20));

        lblDateGraduated.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblDateGraduated.setText("Date Graduated:  ");
        pnlStudent.add(lblDateGraduated, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 435, -1, 20));

        lblDateStart.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblDateStart.setText("Date Started:  ");
        lblDateStart.setToolTipText("");
        pnlStudent.add(lblDateStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, 20));

        txtDateStart.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlStudent.add(txtDateStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 210, 20));

        cmbStatus2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbStatus2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        pnlStudent.add(cmbStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 90, 20));

        lblStatus2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblStatus2.setText("Status : ");
        pnlStudent.add(lblStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, 20));

        txtLastName.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtLastName.setToolTipText("");
        pnlStudent.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 20));

        txtFirstName.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtFirstName.setToolTipText("");
        pnlStudent.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 190, 20));

        lblLastName1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblLastName1.setText("Last Name ");
        pnlStudent.add(lblLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        lblFirstName1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblFirstName1.setText("First Name");
        pnlStudent.add(lblFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, 20));

        lblGender.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblGender.setText("Gender : ");
        pnlStudent.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        cmbGender.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        pnlStudent.add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, 20));

        lblMobileNo1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblMobileNo1.setText("Mobile No :");
        pnlStudent.add(lblMobileNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 235, -1, 20));

        txtMobileNo.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtMobileNo.setToolTipText("");
        pnlStudent.add(txtMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 235, 210, 20));

        txtEmail.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtEmail.setToolTipText("");
        pnlStudent.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 210, 20));

        lblEmail1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblEmail1.setText("Email : ");
        pnlStudent.add(lblEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        lblAddress1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblAddress1.setText("Address : ");
        pnlStudent.add(lblAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 305, -1, 20));

        txtAddress.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtAddress.setToolTipText("");
        pnlStudent.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 305, 210, 20));

        lblBirthDate1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblBirthDate1.setText("Birthdate:  ");
        pnlStudent.add(lblBirthDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 20));

        txtBirthDate.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlStudent.add(txtBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 210, 20));

        lblmmddyyyy7.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblmmddyyyy7.setText("MM - DD - YYYY");
        pnlStudent.add(lblmmddyyyy7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        lblmmddyyyy10.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblmmddyyyy10.setText("MM - DD - YYYY");
        pnlStudent.add(lblmmddyyyy10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 455, -1, -1));

        lblmmddyyyy11.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblmmddyyyy11.setText("MM - DD - YYYY");
        pnlStudent.add(lblmmddyyyy11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        pnlFramebg.add(pnlStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        pnlEmployee.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        scrllEmployee.setViewportView(tblEmployee);

        pnlEmployee.add(scrllEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 430, -1));
        pnlEmployee.add(txtEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, -1));

        lblEmployeeID.setText("Employee ID : ");
        pnlEmployee.add(lblEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        lblLastNameEmp.setText("Last Name : ");
        pnlEmployee.add(lblLastNameEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtLastNameEmp.setToolTipText("");
        pnlEmployee.add(txtLastNameEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 110, -1));

        lblFirstNameEmp.setText("First Name : ");
        pnlEmployee.add(lblFirstNameEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        txtFirstNameEmp.setToolTipText("");
        pnlEmployee.add(txtFirstNameEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 110, -1));

        lblEmailEmp.setText("Email : ");
        pnlEmployee.add(lblEmailEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtEmailEmp.setToolTipText("");
        pnlEmployee.add(txtEmailEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, -1));

        cmbGenderEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        pnlEmployee.add(cmbGenderEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 100, -1));

        lblGenderEmp.setText("Gender : ");
        pnlEmployee.add(lblGenderEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        lblMobileNoEmp.setText("Mobile No :");
        pnlEmployee.add(lblMobileNoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        txtMobileNoEmp.setToolTipText("");
        pnlEmployee.add(txtMobileNoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 110, -1));

        lblAddressEmp.setText("Address : ");
        pnlEmployee.add(lblAddressEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        txtAddressEmp.setToolTipText("");
        pnlEmployee.add(txtAddressEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 110, -1));

        lblBirthDateEmp.setText("Birthdate (MM-DD-YYYY)  :  ");
        pnlEmployee.add(lblBirthDateEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));
        pnlEmployee.add(txtBirthDateEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 90, -1));

        lblDateStartEmp.setText("Date Started (MM-DD-YYYY)  :  ");
        lblDateStartEmp.setToolTipText("");
        pnlEmployee.add(lblDateStartEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));
        pnlEmployee.add(txtDateStartEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 90, -1));

        lblStatus3.setText("Status : ");
        pnlEmployee.add(lblStatus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        cmbStatus3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        pnlEmployee.add(cmbStatus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 90, 20));

        lblDateGraduatedEmp.setText("Date Graduated (MM-DD-YYYY)  :  ");
        pnlEmployee.add(lblDateGraduatedEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 20));
        pnlEmployee.add(txtDateGraduatedEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 90, 20));

        btnAddEmp.setText("Add");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });
        pnlEmployee.add(btnAddEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 100, 30));

        btnUpdateEmp.setText("Update");
        btnUpdateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmpActionPerformed(evt);
            }
        });
        pnlEmployee.add(btnUpdateEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 100, 30));

        btnDeleteEmp.setText("Delete");
        btnDeleteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmpActionPerformed(evt);
            }
        });
        pnlEmployee.add(btnDeleteEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 100, 30));

        lblSchoolYearTitle4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblSchoolYearTitle4.setText("Employee");
        pnlEmployee.add(lblSchoolYearTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 230, 44));

        pnlFramebg.add(pnlEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        pnlSubject.setPreferredSize(new java.awt.Dimension(870, 640));
        pnlSubject.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSubject.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSubjectMouseClicked(evt);
            }
        });
        scrllSubject.setViewportView(tblSubject);

        pnlSubject.add(scrllSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 430, -1));

        lblSubjectCodeSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblSubjectCodeSub.setText("Course Code :");
        pnlSubject.add(lblSubjectCodeSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        txtSubjectCodeSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlSubject.add(txtSubjectCodeSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, 20));

        lblCollegeSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblCollegeSub.setText("College :");
        pnlSubject.add(lblCollegeSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, 20));

        cmbCollegeSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlSubject.add(cmbCollegeSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 100, 20));

        lblSubjDesc.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblSubjDesc.setText("Description : ");
        pnlSubject.add(lblSubjDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 115, -1, 20));

        txtSubjDesc.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlSubject.add(txtSubjDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 115, 220, 20));

        lblUnits.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblUnits.setText("Units : ");
        pnlSubject.add(lblUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        txtUnits.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlSubject.add(txtUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 70, 20));

        lblCurriculumn.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblCurriculumn.setText("Curriculumn : ");
        pnlSubject.add(lblCurriculumn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 185, -1, 20));

        txtCurriculumn.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlSubject.add(txtCurriculumn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 185, 220, 20));

        lblDateOpenedSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblDateOpenedSub.setText("Date Opened:  ");
        pnlSubject.add(lblDateOpenedSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 20));

        txtDateOpenedSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlSubject.add(txtDateOpenedSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 220, 20));

        lblDateClosedSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblDateClosedSub.setText("Date Closed:  ");
        pnlSubject.add(lblDateClosedSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 20));

        txtDateClosedSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        pnlSubject.add(txtDateClosedSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 220, 20));

        lblStatusSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblStatusSub.setText("Status : ");
        pnlSubject.add(lblStatusSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 20));

        cmbStatusSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cmbStatusSub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        pnlSubject.add(cmbStatusSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 90, 20));

        btnAddSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnAddSub.setText("Add");
        btnAddSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSubActionPerformed(evt);
            }
        });
        pnlSubject.add(btnAddSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 100, 30));

        btnUpdateSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnUpdateSub.setText("Update");
        btnUpdateSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSubActionPerformed(evt);
            }
        });
        pnlSubject.add(btnUpdateSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 470, 100, 30));

        btnDeleteSub.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnDeleteSub.setText("Delete");
        btnDeleteSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSubActionPerformed(evt);
            }
        });
        pnlSubject.add(btnDeleteSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 100, 30));

        lblmmddyyyy12.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblmmddyyyy12.setText("MM - DD - YYYY");
        pnlSubject.add(lblmmddyyyy12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        lblmmddyyyy13.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        lblmmddyyyy13.setText("MM - DD - YYYY");
        pnlSubject.add(lblmmddyyyy13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

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
            
    // FOR SCHOOL YEAR - TABLE
            scrllSchoolYear.setOpaque(false);
            scrllSchoolYear.getViewport().setOpaque(false);  
            tblSchoolYear.setOpaque(false);
            tblSchoolYear.setShowGrid(false);  
            tblSchoolYear.setBackground(new Color(0, 0, 0, 0));  

            tblSchoolYear.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
            
    // FOR SEMESTER - TABLE
            scrllSemester.setOpaque(false);
            scrllSemester.getViewport().setOpaque(false);  
            tblSemester.setOpaque(false);
            tblSemester.setShowGrid(false);  
            tblSemester.setBackground(new Color(0, 0, 0, 0));  

            tblSemester.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
            
    // FOR COLLEGE - TABLE
            scrllCollege.setOpaque(false);
            scrllCollege.getViewport().setOpaque(false);  
            tblCollege.setOpaque(false);
            tblCollege.setShowGrid(false);  
            tblCollege.setBackground(new Color(0, 0, 0, 0));  

            tblCollege.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
            
    // FOR COURSE - TABLE
            scrllCourse.setOpaque(false);
            scrllCourse.getViewport().setOpaque(false);  
            tblCourse.setOpaque(false);
            tblCourse.setShowGrid(false);  
            tblCourse.setBackground(new Color(0, 0, 0, 0));  

            tblCourse.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
            
    // FOR STUDENT - TABLE
            scrllStudent.setOpaque(false);
            scrllStudent.getViewport().setOpaque(false);  
            tblStudent.setOpaque(false);
            tblStudent.setShowGrid(false);  
            tblStudent.setBackground(new Color(0, 0, 0, 0));  

            tblStudent.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
            
    // FOR EMPLOYEE - TABLE
            scrllEmployee.setOpaque(false);
            scrllEmployee.getViewport().setOpaque(false);  
            tblEmployee.setOpaque(false);
            tblEmployee.setShowGrid(false);  
            tblEmployee.setBackground(new Color(0, 0, 0, 0));  

            tblEmployee.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
            
    // FOR SUBJECT - TABLE
            scrllSubject.setOpaque(false);
            scrllSubject.getViewport().setOpaque(false);  
            tblSubject.setOpaque(false);
            tblSubject.setShowGrid(false);  
            tblSubject.setBackground(new Color(0, 0, 0, 0));  

            tblSubject.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
        // FOR CLEAR AND SEARCH BUTTONS
        ArrayList<JButton> buttonsSearchandClear = new ArrayList<>();
            buttonsSearchandClear.add(btnSubSchedClear);
            buttonsSearchandClear.add(btnSubjectScheduleFilter);
            buttonsSearchandClear.add(btnStudentGradesFilter);
            buttonsSearchandClear.add(btnStudGradesSearch);
            
        for (JButton buttonSrchnClr : buttonsSearchandClear) {
            buttonSrchnClr.setBackground(new Color(112, 128, 144));
            buttonSrchnClr.setForeground(Color.WHITE);  
            buttonSrchnClr.setFocusPainted(false);  
            buttonSrchnClr.setBorderPainted(false);  
            buttonSrchnClr.setOpaque(true);
            buttonSrchnClr.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        
        // FOR ADD BUTTONS
        ArrayList<JButton> buttonsAdd = new ArrayList<>();
        buttonsAdd.add(btnSubSchedAdd);
        buttonsAdd.add(btnStudGradesAdd);
        buttonsAdd.add(btnSchoolYearAdd);
        buttonsAdd.add(btnSemesterAdd);
        buttonsAdd.add(btnAddCollege);
        buttonsAdd.add(btnAddCourse);
        buttonsAdd.add(btnAddStudent);
        buttonsAdd.add(btnAddEmp);
        buttonsAdd.add(btnAddSub);
        
        for (JButton buttonAdd : buttonsAdd) {
            buttonAdd.setBackground(new Color(34, 139, 34));   
            buttonAdd.setForeground(Color.WHITE);  
            buttonAdd.setFocusPainted(false);  
            buttonAdd.setBorderPainted(false);  
            buttonAdd.setOpaque(true);
            buttonAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        
        // FOR UPDATE BUTTONS
        ArrayList<JButton> buttonsUpdate = new ArrayList<>();
        buttonsUpdate.add(btnSubSchedUpdate);
        buttonsUpdate.add(btnStudGradesUpdate);
        buttonsUpdate.add(btnSchoolYearUpdate);
        buttonsUpdate.add(btnSemesterUpdate);
        buttonsUpdate.add(btnUpdateCollege);
        buttonsUpdate.add(btnUpdateCourse);
        buttonsUpdate.add(btnUpdateStudent);
        buttonsUpdate.add(btnUpdateEmp);
        buttonsUpdate.add(btnUpdateSub);
        
        for (JButton buttonUpd : buttonsUpdate) {
            buttonUpd.setBackground(new Color(220, 153, 0));   
            buttonUpd.setForeground(Color.WHITE);  
            buttonUpd.setFocusPainted(false);  
            buttonUpd.setBorderPainted(false);
            buttonUpd.setOpaque(true);
            buttonUpd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }  
        
        // FOR DELETE BUTTONS
        ArrayList<JButton> buttonsDelete = new ArrayList<>();
        buttonsDelete.add(btnSubSchedDelete);
        buttonsDelete.add(btnStudGradesDelete);
        buttonsDelete.add(btnSchoolYearDelete);
        buttonsDelete.add(btnSemesterDelete);
        buttonsDelete.add(btnDeleteCollege);
        buttonsDelete.add(btnDeleteCourse);
        buttonsDelete.add(btnDeleteStudent);
        buttonsDelete.add(btnDeleteEmp);
        buttonsDelete.add(btnDeleteSub);
        
        for (JButton buttonDel : buttonsDelete) {
            buttonDel.setBackground(new Color(153, 51, 51));  
            buttonDel.setForeground(Color.WHITE);  
            buttonDel.setFocusPainted(false);  
            buttonDel.setBorderPainted(false);  
            buttonDel.setOpaque(true);
            buttonDel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
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
        buttons.add(btnSchoolYear);
        buttons.add(btnSemester);
        buttons.add(btnCollege);
        buttons.add(btnCourse);
        buttons.add(btnStudent);
        buttons.add(btnEmployee);
        buttons.add(btnSubject);
        
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

            // college
            ps = conn.prepareStatement("SELECT * FROM plm.college");
            rs = ps.executeQuery();
            tblCollege.setModel(DbUtils.resultSetToTableModel(rs));
            
            // course
            ps = conn.prepareStatement("SELECT * FROM plm.course");
            rs = ps.executeQuery();
            tblCourse.setModel(DbUtils.resultSetToTableModel(rs));
            
            // student
            ps = conn.prepareStatement("SELECT * FROM plm.student");
            rs = ps.executeQuery();
            tblStudent.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            // employee 
            ps = conn.prepareStatement("SELECT * FROM plm.employee");
            rs = ps.executeQuery();
            tblEmployee.setModel(DbUtils.resultSetToTableModel(rs));
            
            // subject 
            ps = conn.prepareStatement("SELECT * FROM plm.subject");
            rs = ps.executeQuery();
            tblSubject.setModel(DbUtils.resultSetToTableModel(rs));
            
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
            while (rs.next()){
                cmbssCollegeFilter.addItem(rs.getString("college_code"));
                cmbCollege.addItem(rs.getString("college_code"));
                cmbCollegeSub.addItem(rs.getString("college_code"));
            }
            cmbssBlockNoFilter.removeAllItems();
            ps = conn.prepareStatement("SELECT block_no FROM subject_schedule");
            rs = ps.executeQuery();
            cmbssBlockNoFilter.addItem(" -- ");
            while (rs.next())
                cmbssBlockNoFilter.addItem(rs.getString("block_no"));
            
            // -- 
            cmbCourse.removeAllItems();
            ps = conn.prepareStatement("SELECT course_code FROM course");
            rs = ps.executeQuery();
            while (rs.next())
                cmbCourse.addItem(rs.getString("course_code"));
            
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

    private void tblCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCollegeMouseClicked
        int row = tblCollege.getSelectedRow();
        txtCollegeCode.setText(getValueOrDefault(tblCollege.getValueAt(row, 0)));
        txtColDesc.setText(getValueOrDefault(tblCollege.getValueAt(row, 1)));
        txtDateOpened.setText(getValueOrDefault(tblCollege.getValueAt(row, 2)));
        txtDateClosed.setText(getValueOrDefault(tblCollege.getValueAt(row, 3)));
        cmbStatus.setSelectedItem(getValueOrDefault(tblCollege.getValueAt(row, 4)));
        this.college = tblCollege.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tblCollegeMouseClicked

    private void btnAddCollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCollegeActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to ADD record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("INSERT INTO college(college_code, description, date_opened, date_closed, status) VALUES (?, ?, ?, ?, ?)");
                ps.setObject(1, txtCollegeCode.getText().trim());
                ps.setObject(2, txtColDesc.getText().trim());
                if (txtDateOpened.getText().trim().isBlank()){
                    ps.setObject(3, txtDateOpened.getText().trim());
                } else if (txtDateOpened.getText().trim().matches("\\d{2}-\\d{2}-\\d{4}")){                
                    ps.setObject(3, txtDateOpened.getText().trim());
                }
                if (txtDateClosed.getText().trim().isBlank()){
                    ps.setObject(4, txtDateClosed.getText().trim());
                } else if (txtDateClosed.getText().trim().matches("\\d{2}-\\d{2}-\\d{4}")){                
                    ps.setObject(4, txtDateClosed.getText().trim());
                }
                ps.setObject(5, cmbStatus.getSelectedItem());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record successfully added.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Please follow the format.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Add was aborted.");
        }
    }//GEN-LAST:event_btnAddCollegeActionPerformed

    private void btnUpdateCollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCollegeActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to UPDATE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("UPDATE college SET "
                        + "college_code = ?, "
                        + "description = ?, "
                        + "date_opened = ?, "
                        + "date_closed = ?, "
                        + "status = ? "
                        + "WHERE "
                        + "college_code = ?");
                ps.setObject(1, txtCollegeCode.getText().trim());
                ps.setObject(2, txtColDesc.getText().trim());
                ps.setObject(3, txtDateOpened.getText().trim());
                ps.setObject(4, txtDateClosed.getText().trim());
                ps.setObject(5, cmbStatus.getSelectedItem());
                ps.setObject(6, college);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record updated successfully.");
            } catch (SQLDataException e) {
                JOptionPane.showMessageDialog(null, "Please follow the format.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "UPDATE was aborted.");
        }
    }//GEN-LAST:event_btnUpdateCollegeActionPerformed

    private void btnDeleteCollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCollegeActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to DELETE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("DELETE FROM college WHERE college_code = ?");
                ps.setObject(1, txtCollegeCode.getText().trim());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record deleted successfully.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Deletion was aborted.");
        }
    }//GEN-LAST:event_btnDeleteCollegeActionPerformed

    private void tblCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCourseMouseClicked
        int row = tblCourse.getSelectedRow();
        txtCourseCode.setText(getValueOrDefault(tblCourse.getValueAt(row, 0)));
        txtCourseDesc.setText(getValueOrDefault(tblCourse.getValueAt(row, 1)));
        cmbCollege.setSelectedItem(getValueOrDefault(tblCourse.getValueAt(row, 2)));
        txtDateOpened1.setText(getValueOrDefault(tblCourse.getValueAt(row, 3)));
        txtDateClosed1.setText(getValueOrDefault(tblCourse.getValueAt(row, 4)));
        cmbStatus1.setSelectedItem(getValueOrDefault(tblCourse.getValueAt(row, 5)));
        this.course = tblCourse.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tblCourseMouseClicked

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        // TODO add your handling code here:
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to ADD record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("INSERT INTO course(course_code, description, college_code, date_opened, date_closed, status) "
                        + "VALUES (?, ?, ?, ?, ?, ?)");
                ps.setObject(1, txtCourseCode.getText().trim());
                ps.setObject(2, txtCourseDesc.getText().trim());
                ps.setObject(3, cmbCollege.getSelectedItem());
                if (txtDateOpened1.getText().trim().isBlank()){
                    ps.setObject(4, txtDateOpened1.getText().trim());
                } else if (txtDateOpened1.getText().trim().matches("\\d{2}-\\d{2}-\\d{4}")){                
                    ps.setObject(4, txtDateOpened1.getText().trim());
                }
                if (txtDateClosed1.getText().trim().isBlank()){
                    ps.setObject(5, txtDateClosed1.getText().trim());
                } else if (txtDateClosed1.getText().trim().matches("\\d{2}-\\d{2}-\\d{4}")){                
                    ps.setObject(5, txtDateClosed1.getText().trim());
                }
                ps.setObject(6, cmbStatus1.getSelectedItem());
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
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnUpdateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCourseActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to UPDATE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("UPDATE course SET "
                        + "course_code = ?, "
                        + "description = ?, "
                        + "college_code = ?, "
                        + "date_opened = ?, "
                        + "date_closed = ?, "
                        + "status = ? "
                        + "WHERE "
                        + "course_code = ?");
                ps.setObject(1, txtCourseCode.getText().trim());
                ps.setObject(2, txtCourseDesc.getText().trim());
                ps.setObject(3, cmbCollege.getSelectedItem());
                ps.setObject(4, txtDateOpened1.getText().trim());
                ps.setObject(5, txtDateClosed1.getText().trim());
                ps.setObject(6, cmbStatus1.getSelectedItem());
                ps.setObject(7, course);
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
    }//GEN-LAST:event_btnUpdateCourseActionPerformed

    private void btnDeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCourseActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to DELETE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("DELETE FROM course WHERE course_code = ?");
                ps.setObject(1, txtCourseCode.getText().trim());
                ps.executeQuery();
                JOptionPane.showMessageDialog(null, "Record deleted successfully.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Deletion was aborted.");
        }
    }//GEN-LAST:event_btnDeleteCourseActionPerformed

    private void tblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentMouseClicked
        int row = tblStudent.getSelectedRow();
        txtStudentNo.setText(getValueOrDefault(tblStudent.getValueAt(row, 0)));
        txtLastName.setText(getValueOrDefault(tblStudent.getValueAt(row, 1)));
        txtFirstName.setText(getValueOrDefault(tblStudent.getValueAt(row, 2)));
        txtEmail.setText(getValueOrDefault(tblStudent.getValueAt(row, 3)));
        cmbGender.setSelectedItem(getValueOrDefault(tblStudent.getValueAt(row, 4)));
        cmbCourse.setSelectedItem(getValueOrDefault(tblStudent.getValueAt(row, 5)));
        txtMobileNo.setText(getValueOrDefault(tblStudent.getValueAt(row, 6)));
        txtAddress.setText(getValueOrDefault(tblStudent.getValueAt(row, 7)));
        txtBirthDate.setText(getValueOrDefault(tblStudent.getValueAt(row, 8)));
        cmbStatus2.setSelectedItem(getValueOrDefault(tblStudent.getValueAt(row, 9)));
        txtDateStart.setText(getValueOrDefault(tblStudent.getValueAt(row, 10)));
        txtDateGraduated.setText(getValueOrDefault(tblStudent.getValueAt(row, 11)));
        this.studentno = tblStudent.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tblStudentMouseClicked

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to ADD record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("INSERT INTO student ("
                        + "student_no, lastname, firstname, email, "
                        + "gender, course_code, cp_num, address, "
                        + "bday, status, date_started, date_graduated) "
                        + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                ps.setObject(1, txtStudentNo.getText().trim());
                ps.setObject(2, txtLastName.getText().trim());
                ps.setObject(3, txtFirstName.getText().trim());
                ps.setObject(4, txtEmail.getText().trim());
                ps.setObject(5, cmbGender.getSelectedItem());
                ps.setObject(6, cmbCourse.getSelectedItem());
                ps.setObject(7, txtMobileNo.getText().trim());
                ps.setObject(8, txtAddress.getText().trim());
                ps.setObject(9, txtBirthDate.getText().trim());
                ps.setObject(10, cmbStatus2.getSelectedItem());
                if (txtDateStart.getText().trim().isBlank()){
                    ps.setObject(11, txtDateStart.getText().trim());
                } else if (txtDateStart.getText().trim().matches("\\d{2}-\\d{2}-\\d{4}")){                
                    ps.setObject(11, txtDateStart.getText().trim());
                }
                if (txtDateGraduated.getText().trim().isBlank()){
                    ps.setObject(12, txtDateGraduated.getText().trim());
                } else if (txtDateGraduated.getText().trim().matches("\\d{2}-\\d{2}-\\d{4}")){                
                    ps.setObject(12, txtDateGraduated.getText().trim());
                }
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record added successfully.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Please follow the format.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Add was aborted.");
        }
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudentActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to UPDATE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("UPDATE student SET "
                        + "student_no = ?, "
                        + "lastname = ?, "
                        + "firstname = ?, "
                        + "email = ?, "
                        + "gender = ?, "
                        + "course_code = ?, "
                        + "cp_num = ?, "
                        + "address = ?, "
                        + "bday = ?, "
                        + "status = ?, "
                        + "date_started = ?, "
                        + "date_graduated = ? "
                        + "WHERE "
                        + "student_no = ?");
                ps.setObject(1, txtStudentNo.getText().trim());
                ps.setObject(2, txtLastName.getText().trim());
                ps.setObject(3, txtFirstName.getText().trim());
                ps.setObject(4, txtEmail.getText().trim());
                ps.setObject(5, cmbGender.getSelectedItem());
                ps.setObject(6, cmbCourse.getSelectedItem());
                ps.setObject(7, txtMobileNo.getText().trim());
                ps.setObject(8, txtAddress.getText().trim());
                ps.setObject(9, txtBirthDate.getText().trim());
                ps.setObject(10, cmbStatus2.getSelectedItem());
                ps.setObject(11, txtDateStart.getText().trim());
                ps.setObject(12, txtDateGraduated.getText().trim());
                ps.setObject(13, studentno);
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
    }//GEN-LAST:event_btnUpdateStudentActionPerformed

    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to DELETE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("DELETE FROM student WHERE student_no = ?");
                ps.setObject(1, txtStudentNo.getText().trim());
                ps.executeQuery();
                JOptionPane.showMessageDialog(null, "Record deleted successfully.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Deletion was aborted.");
        }
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        int row = tblEmployee.getSelectedRow();
        txtEmployeeID.setText(getValueOrDefault(tblEmployee.getValueAt(row, 0)));
        txtLastNameEmp.setText(getValueOrDefault(tblEmployee.getValueAt(row, 1)));
        txtFirstNameEmp.setText(getValueOrDefault(tblEmployee.getValueAt(row, 2)));
        txtEmailEmp.setText(getValueOrDefault(tblEmployee.getValueAt(row, 3)));
        cmbGenderEmp.setSelectedItem(getValueOrDefault(tblEmployee.getValueAt(row, 4)));
        txtMobileNoEmp.setText(getValueOrDefault(tblEmployee.getValueAt(row, 5)));
        txtAddressEmp.setText(getValueOrDefault(tblEmployee.getValueAt(row, 6)));
        txtBirthDateEmp.setText(getValueOrDefault(tblEmployee.getValueAt(row, 7)));
        cmbStatus3.setSelectedItem(getValueOrDefault(tblEmployee.getValueAt(row, 8)));
        txtDateStartEmp.setText(getValueOrDefault(tblEmployee.getValueAt(row, 9)));
        txtDateGraduatedEmp.setText(getValueOrDefault(tblEmployee.getValueAt(row, 10)));
        this.employeeno = tblEmployee.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to ADD record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("INSERT INTO employee ("
                        + "employee_id, lastname, firstname, email, "
                        + "gender, cp_num, address, bday, status, "
                        + "date_started, date_resigned) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                ps.setObject(1, txtEmployeeID.getText().trim());
                ps.setObject(2, txtLastNameEmp.getText().trim());
                ps.setObject(3, txtFirstNameEmp.getText().trim());
                ps.setObject(4, txtEmailEmp.getText().trim());
                ps.setObject(5, cmbGenderEmp.getSelectedItem());
                ps.setObject(6, txtMobileNoEmp.getText().trim());
                ps.setObject(7, txtAddressEmp.getText().trim());
                ps.setObject(8, txtBirthDateEmp.getText().trim());
                ps.setObject(9, cmbStatus3.getSelectedItem());
                if (txtDateStartEmp.getText().trim().isBlank()){
                    ps.setObject(10, txtDateStartEmp.getText().trim());
                } else if (txtDateStartEmp.getText().trim().matches("\\d{2}-\\d{2}-\\d{4}")){                
                    ps.setObject(10, txtDateStartEmp.getText().trim());
                }
                if (txtDateGraduatedEmp.getText().trim().isBlank()){
                    ps.setObject(11, txtDateGraduatedEmp.getText().trim());
                } else if (txtDateGraduatedEmp.getText().trim().matches("\\d{2}-\\d{2}-\\d{4}")){                
                    ps.setObject(11, txtDateGraduatedEmp.getText().trim());
                }
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
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnUpdateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmpActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to UPDATE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("UPDATE employee SET "
                        + "employee_id = ?, "
                        + "lastname = ?, "
                        + "firstname = ?, "
                        + "email = ?, "
                        + "gender = ?, "
                        + "cp_num = ?, "
                        + "address = ?, "
                        + "bday = ?, "
                        + "status = ?, "
                        + "date_started = ?, "
                        + "date_resigned = ? "
                        + "WHERE "
                        + "employee_id = ?");
                ps.setObject(1, txtEmployeeID.getText().trim());
                ps.setObject(2, txtLastNameEmp.getText().trim());
                ps.setObject(3, txtFirstNameEmp.getText().trim());
                ps.setObject(4, txtEmailEmp.getText().trim());
                ps.setObject(5, cmbGenderEmp.getSelectedItem());
                ps.setObject(6, txtMobileNoEmp.getText().trim());
                ps.setObject(7, txtAddressEmp.getText().trim());
                ps.setObject(8, txtBirthDateEmp.getText().trim());
                ps.setObject(9, cmbStatus3.getSelectedItem());
                ps.setObject(10, txtDateStartEmp.getText().trim());
                ps.setObject(11, txtDateGraduatedEmp.getText().trim());
                ps.setObject(12, employeeno);
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
    }//GEN-LAST:event_btnUpdateEmpActionPerformed

    private void btnDeleteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmpActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to DELETE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("DELETE FROM employee WHERE employee_id = ?");
                ps.setObject(1, txtEmployeeID.getText().trim());
                ps.executeQuery();
                JOptionPane.showMessageDialog(null, "Record deleted successfully.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Deletion was aborted.");
        }
    }//GEN-LAST:event_btnDeleteEmpActionPerformed

    private void tblSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSubjectMouseClicked
        int row = tblSubject.getSelectedRow();
        txtSubjectCodeSub.setText(getValueOrDefault(tblSubject.getValueAt(row, 0)));
        txtSubjDesc.setText(getValueOrDefault(tblSubject.getValueAt(row, 1)));
        txtUnits.setText(getValueOrDefault(tblSubject.getValueAt(row, 2)));
        txtCurriculumn.setText(getValueOrDefault(tblSubject.getValueAt(row, 3)));
        cmbCollegeSub.setSelectedItem(getValueOrDefault(tblSubject.getValueAt(row, 4)));
        cmbStatusSub.setSelectedItem(getValueOrDefault(tblSubject.getValueAt(row, 5)));
        txtDateOpenedSub.setText(getValueOrDefault(tblSubject.getValueAt(row, 6)));
        txtDateClosedSub.setText(getValueOrDefault(tblSubject.getValueAt(row, 7)));
        this.subcode = tblSubject.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tblSubjectMouseClicked

    private void btnAddSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSubActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to ADD record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("INSERT INTO subject ("
                        + "subject_code, description, units, curriculum, college_code, status, date_opened, date_closed"
                        + ") "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                ps.setObject(1, txtSubjectCodeSub.getText().trim());
                ps.setObject(2, txtSubjDesc.getText().trim());
                ps.setObject(3, txtUnits.getText().trim());
                ps.setObject(4, txtCurriculumn.getText().trim());
                ps.setObject(5, cmbCollegeSub.getSelectedItem());
                ps.setObject(6, cmbStatusSub.getSelectedItem());
                if (txtDateOpenedSub.getText().trim().isBlank()){
                    ps.setObject(7, txtDateOpenedSub.getText().trim());
                } else if (txtDateOpenedSub.getText().trim().matches("\\d{2}-\\d{2}-\\d{4}")){                
                    ps.setObject(7, txtDateOpenedSub.getText().trim());
                }
                if (txtDateClosedSub.getText().trim().isBlank()){
                    ps.setObject(8, txtDateClosedSub.getText().trim());
                } else if (txtDateClosedSub.getText().trim().matches("\\d{2}-\\d{2}-\\d{4}")){                
                    ps.setObject(8, txtDateClosedSub.getText().trim());
                }
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record added successfully.");
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Please follow the format.");
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Add was aborted.");
        }
    }//GEN-LAST:event_btnAddSubActionPerformed

    private void btnUpdateSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSubActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to UPDATE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("UPDATE subject SET "
                        + "subject_code = ?, "
                        + "description = ?, "
                        + "units = ?, "
                        + "curriculum = ?, "
                        + "college_code = ?, "
                        + "status = ?, "
                        + "date_opened = ?, "
                        + "date_closed = ? "
                        + "WHERE "
                        + "subject_code = ?");
                ps.setObject(1, txtSubjectCodeSub.getText().trim());
                ps.setObject(2, txtSubjDesc.getText().trim());
                ps.setObject(3, txtUnits.getText().trim());
                ps.setObject(4, txtCurriculumn.getText().trim());
                ps.setObject(5, cmbCollegeSub.getSelectedItem());
                ps.setObject(6, cmbStatusSub.getSelectedItem());
                ps.setObject(7, txtDateOpenedSub.getText().trim());
                ps.setObject(8, txtDateClosedSub.getText().trim());
                ps.setObject(9, subcode);
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
    }//GEN-LAST:event_btnUpdateSubActionPerformed

    private void btnDeleteSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSubActionPerformed
        int respond = JOptionPane.showConfirmDialog(null, "Do you want to DELETE record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (respond == JOptionPane.YES_OPTION){ 
            try {
                ps = conn.prepareStatement("DELETE FROM subject WHERE subject_code = ?");
                ps.setObject(1, txtSubjectCodeSub.getText().trim());
                ps.executeQuery();
                JOptionPane.showMessageDialog(null, "Record deleted successfully.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Deletion was aborted.");
        }
    }//GEN-LAST:event_btnDeleteSubActionPerformed

    private void txtSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemesterActionPerformed

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
    private javax.swing.JButton btnAddCollege;
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAddSub;
    private javax.swing.JButton btnCollege;
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnDeleteCollege;
    private javax.swing.JButton btnDeleteCourse;
    private javax.swing.JButton btnDeleteEmp;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnDeleteSub;
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
    private javax.swing.JButton btnUpdateCollege;
    private javax.swing.JButton btnUpdateCourse;
    private javax.swing.JButton btnUpdateEmp;
    private javax.swing.JButton btnUpdateStudent;
    private javax.swing.JButton btnUpdateSub;
    private javax.swing.JButton btnViews;
    private javax.swing.JComboBox<String> cmbCollege;
    private javax.swing.JComboBox<String> cmbCollegeSub;
    private javax.swing.JComboBox<String> cmbCourse;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbGenderEmp;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> cmbStatus1;
    private javax.swing.JComboBox<String> cmbStatus2;
    private javax.swing.JComboBox<String> cmbStatus3;
    private javax.swing.JComboBox<String> cmbStatusSub;
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
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblAddressEmp;
    private javax.swing.JLabel lblBirthDate1;
    private javax.swing.JLabel lblBirthDateEmp;
    private javax.swing.JLabel lblColDesc;
    private javax.swing.JLabel lblCollege;
    private javax.swing.JLabel lblCollegeCode;
    private javax.swing.JLabel lblCollegeSub;
    private javax.swing.JLabel lblCollegeTItle;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblCourseCode;
    private javax.swing.JLabel lblCourseDesc;
    private javax.swing.JLabel lblCurriculumn;
    private javax.swing.JLabel lblDash;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateClosed;
    private javax.swing.JLabel lblDateClosed1;
    private javax.swing.JLabel lblDateClosedSub;
    private javax.swing.JLabel lblDateGraduated;
    private javax.swing.JLabel lblDateGraduatedEmp;
    private javax.swing.JLabel lblDateOpened;
    private javax.swing.JLabel lblDateOpened1;
    private javax.swing.JLabel lblDateOpenedSub;
    private javax.swing.JLabel lblDateStart;
    private javax.swing.JLabel lblDateStartEmp;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEmailEmp;
    private javax.swing.JLabel lblEmployeeCount;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblEmployeeIcon;
    private javax.swing.JLabel lblEndSY;
    private javax.swing.JLabel lblFacultyName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblFirstNameEmp;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGenderEmp;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblLastName1;
    private javax.swing.JLabel lblLastNameEmp;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMobileNo1;
    private javax.swing.JLabel lblMobileNoEmp;
    private javax.swing.JLabel lblOthers;
    private javax.swing.JLabel lblSchoolYearTitle;
    private javax.swing.JLabel lblSchoolYearTitle1;
    private javax.swing.JLabel lblSchoolYearTitle2;
    private javax.swing.JLabel lblSchoolYearTitle4;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblStartSY2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JLabel lblStatus2;
    private javax.swing.JLabel lblStatus3;
    private javax.swing.JLabel lblStatusSub;
    private javax.swing.JLabel lblStudentCount;
    private javax.swing.JLabel lblStudentIcon;
    private javax.swing.JLabel lblStudentNo;
    private javax.swing.JLabel lblSubjDesc;
    private javax.swing.JLabel lblSubjectCodeSub;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitleEmployeeCount;
    private javax.swing.JLabel lblTitleStudentCount;
    private javax.swing.JLabel lblUnits;
    private javax.swing.JLabel lblmmddyyyy1;
    private javax.swing.JLabel lblmmddyyyy10;
    private javax.swing.JLabel lblmmddyyyy11;
    private javax.swing.JLabel lblmmddyyyy12;
    private javax.swing.JLabel lblmmddyyyy13;
    private javax.swing.JLabel lblmmddyyyy2;
    private javax.swing.JLabel lblmmddyyyy3;
    private javax.swing.JLabel lblmmddyyyy4;
    private javax.swing.JLabel lblmmddyyyy7;
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
    private javax.swing.JScrollPane scrllCollege;
    private javax.swing.JScrollPane scrllCourse;
    private javax.swing.JScrollPane scrllEmployee;
    private javax.swing.JScrollPane scrllSchoolYear;
    private javax.swing.JScrollPane scrllSemester;
    private javax.swing.JScrollPane scrllStudGrades;
    private javax.swing.JScrollPane scrllStudGradesView;
    private javax.swing.JScrollPane scrllStudent;
    private javax.swing.JScrollPane scrllSubSched;
    private javax.swing.JScrollPane scrllSubSchedView;
    private javax.swing.JScrollPane scrllSubject;
    private javax.swing.JTabbedPane tabbViewsNav;
    private javax.swing.JTable tblCollege;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTable tblSchoolYear;
    private javax.swing.JTable tblSemester;
    private javax.swing.JTable tblStudGrades;
    private javax.swing.JTable tblStudGradesView;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTable tblSubSched;
    private javax.swing.JTable tblSubSchedView;
    private javax.swing.JTable tblSubject;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddressEmp;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtBirthDateEmp;
    private javax.swing.JTextField txtColDesc;
    private javax.swing.JTextField txtCollegeCode;
    private javax.swing.JTextField txtCourseCode;
    private javax.swing.JTextField txtCourseDesc;
    private javax.swing.JTextField txtCurriculumn;
    private javax.swing.JTextField txtDateClosed;
    private javax.swing.JTextField txtDateClosed1;
    private javax.swing.JTextField txtDateClosedSub;
    private javax.swing.JTextField txtDateGraduated;
    private javax.swing.JTextField txtDateGraduatedEmp;
    private javax.swing.JTextField txtDateOpened;
    private javax.swing.JTextField txtDateOpened1;
    private javax.swing.JTextField txtDateOpenedSub;
    private javax.swing.JTextField txtDateStart;
    private javax.swing.JTextField txtDateStartEmp;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailEmp;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtEndSY;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFirstNameEmp;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLastNameEmp;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtMobileNoEmp;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtStartSY;
    private javax.swing.JTextField txtStudentNo;
    private javax.swing.JTextField txtSubjDesc;
    private javax.swing.JTextField txtSubjectCodeSub;
    private javax.swing.JTextField txtUnits;
    private javax.swing.JTextField txtsgStudentNoFilter;
    private javax.swing.JTextField txtsgStudentNumber;
    private javax.swing.JTextField txtssBlockNo;
    private javax.swing.JTextField txtssRoom;
    private javax.swing.JTextField txtssSequenceNo;
    private javax.swing.JTextField txtssTime;
    // End of variables declaration//GEN-END:variables
}
