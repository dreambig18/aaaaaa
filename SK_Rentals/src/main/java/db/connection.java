package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://DESKTOP-IHHCNDI\\TEJASSRV:1433;databaseName=demo;encrypt=false;trustServerCertificate=true;";
    private static String userName = "sa";  
    private static String password = "123456";  

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); 
        }
    }

    public static void getconnection() {
       // Connection con = null;
        try (Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-IHHCNDI\\TEJASSRV;databaseName=demo;", userName, password)) {
            System.out.println("Connection done");
        } catch (SQLException e) {
            System.out.println("Error in connection.....");
            e.printStackTrace();
        }
       // return con;
    }
}
