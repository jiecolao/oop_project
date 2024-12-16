package projectoop;

public class Main {
    public static void main(String[] args) {
        // TODO: wag magclear ang subsched n grades kapag aalis
        //       catch cases sa filter, what if sa gitna walang filter?
        //       Optimize faculty_id w faculty name, is it conventional?
        ConnectDB clConnect = new ConnectDB();
        MainScreen jfMS = new MainScreen();

        jfMS.setVisible(true);
    }    
}
