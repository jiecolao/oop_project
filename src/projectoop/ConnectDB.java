/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

import java.sql.*;

public class ConnectDB {
      public static Connection Connect(){
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "plm", "plm");
            System.out.println("Connection Successful");
        } catch (Exception e) {
            System.out.println("Error");
        }
        return conn;
    }

}
