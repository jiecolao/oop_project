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
        
        String a = "13-12-1212";
//        System.out.println(a.matches("\\d{2}-\\d{2}-\\d{4}"));
        
//        t.setVisible(true);
        jfMS.setVisible(true);
    }    
}
