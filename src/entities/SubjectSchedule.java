package entities;

public class SubjectSchedule {
    
    private String syear;
    private String semester;
    private String college_code;
    private String block_no;
    private String subject_code;
    private String day;
    private String time;
    private String room;
    private String type;
    private int sequence_no;
    private String employee_id;
    
    public SubjectSchedule(){   
    }

    public SubjectSchedule(String syear, String semester, String college_code, String block_no, String subject_code, String day, String time, String room, String type, int sequence_no, String employee_id) {
        this.syear = syear;
        this.semester = semester;
        this.college_code = college_code;
        this.block_no = block_no;
        this.subject_code = subject_code;
        this.day = day;
        this.time = time;
        this.room = room;
        this.type = type;
        this.sequence_no = sequence_no;
        this.employee_id = employee_id;
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
    
    public String getCollege_code() {
        return college_code;
    }
    
    public void setCollege_code(String college_code) {
        this.college_code = college_code;
    }
    
    public String getBlock_no() {
        return block_no;
    }
    
    public void setBlock_no(String block_no) {
        this.block_no = block_no;
    }
    
    public String getSubject_code() {
        return subject_code;
    }
    
    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }
    
    public String getDay() {
        return day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    
    public String getRoom() {
        return room;
    }
    
    public void setRoom(String room) {
        this.room = room;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getSequence_no() {
        return sequence_no;
    }
    
    public void setSequence_no(int sequence_no) {
        this.sequence_no = sequence_no;
    }
    
    public String getEmployee_id() {
        return employee_id;
    }
    
    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
}
