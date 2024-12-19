package projectoop;

public class Grades {
    private String syear;
    private String semester;
    private String student_no;
    private String subject_code;
    private String block_no;
    private int grade;

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

    /**
     * @return the syear
     */
    public String getSyear() {
        return syear;
    }

    /**
     * @param syear the syear to set
     */
    public void setSyear(String syear) {
        this.syear = syear;
    }

    /**
     * @return the semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * @return the student_no
     */
    public String getStudent_no() {
        return student_no;
    }

    /**
     * @param student_no the student_no to set
     */
    public void setStudent_no(String student_no) {
        this.student_no = student_no;
    }

    /**
     * @return the subject_code
     */
    public String getSubject_code() {
        return subject_code;
    }

    /**
     * @param subject_code the subject_code to set
     */
    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    /**
     * @return the block_no
     */
    public String getBlock_no() {
        return block_no;
    }

    /**
     * @param block_no the block_no to set
     */
    public void setBlock_no(String block_no) {
        this.block_no = block_no;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    
    
}
