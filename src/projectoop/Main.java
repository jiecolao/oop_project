package projectoop;

import entities.Grades;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // TODO: wag magclear ang subsched n grades kapag aalis
        //       catch cases sa filter, what if sa gitna walang filter?
        //       Optimize faculty_id w faculty name, is it conventional?
        //       table display for both INSERTS panel
        //       INSERT schedule: maglalagay ba default option?, blk txtfield component
        //       fix table in VIEW GRADES
        //       anticipate error: sequence no input sa subj sched, naglagay string
        ConnectDB clConnect = new ConnectDB();
        MainScreen jfMS = new MainScreen();
        Test t = new Test();
        
        Grades a = new Grades();
        // ArrayList<String> b = a.getSemester_opt();
        // b.forEach(item -> System.out.println(item));
        
//        t.setVisible(true);
        jfMS.setVisible(true);
    }    
}
