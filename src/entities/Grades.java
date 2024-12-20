package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import projectoop.ConnectDB;

public class Grades {
    
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    private String syear;
    private String semester;
    private String student_no;
    private String subject_code;
    private String block_no;
    private int grade;
    
    private ArrayList<String> syear_opt;
    private ArrayList<String> semester_opt;
    private ArrayList<String> subcode_opt;
    private ArrayList<String> blockno_opt;
    
    public Grades() {
    }

    public Grades(String syear, String semester, String student_no, String subject_code, String block_no, int grade) {
        this.syear = syear;
        this.semester = semester;
        this.student_no = student_no;
        this.subject_code = subject_code;
        this.block_no = block_no;
        this.grade = grade;
    }
    
    public String getSyear() {
        return syear;
    }
    
    public void setSyear(String syear) {
        this.syear = syear;
    }
    
    public String getSemester() {
        return semester;
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public String getStudent_no() {
        return student_no;
    }
    
    public void setStudent_no(String student_no) {
        this.student_no = student_no;
    }
    
    public String getSubject_code() {
        return subject_code;
    }
    
    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }
    
    public String getBlock_no() {
        return block_no;
    }
    
    public void setBlock_no(String block_no) {
        this.block_no = block_no;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        this.grade = grade;
    }
        
    public ArrayList<String> getSyear_opt() {
        return syear_opt;
    }
    
    public void setSyear_opt(ArrayList<String> syear_opt) {
        this.syear_opt = syear_opt;
    }
    
    public ArrayList<String> getSemester_opt() {
        return semester_opt;
    }
    public void setSemester_opt(ArrayList<String> semester_opt) {
        this.semester_opt = semester_opt;
    }
    
    public ArrayList<String> getSubcode_opt() {
        return subcode_opt;
    }
    
    public void setSubcode_opt(ArrayList<String> subcode_opt) {
        this.subcode_opt = subcode_opt;
    }
    
    public ArrayList<String> getBlockno_opt() {
        return blockno_opt;
    }
    
    public void setBlockno_opt(ArrayList<String> blockno_opt) {
        this.blockno_opt = blockno_opt;
    }
    
    // ---
    private void setSemesterValues(){
        try {
            ArrayList<String> val = new ArrayList<>();
            conn = ConnectDB.Connect();
            ps = conn.prepareStatement("SELECT semester FROM plm.semester");
            rs = ps.executeQuery();
            while(rs.next())
                val.add(rs.getString("semester"));
            setSemester_opt(val);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void addSemOpt(String val){
        this.semester_opt.add(val);
    }
}
