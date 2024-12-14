package projectoop;

public class Main {
    public static void main(String[] args) {
        // TODO: wag magclear ang subsched n grades kapag aalis
        //       Statistics sa dashboard
        ConnectDB clConnect = new ConnectDB();
        MainScreen jfMS = new MainScreen();

        jfMS.setVisible(true);
    }    
}
