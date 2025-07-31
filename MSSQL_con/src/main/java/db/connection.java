package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
public class connection {
//	public static void main(String[] args) {
//
//  }
//	Connection con;
	public Connection getconnection() {
      String connectionString = "jdbc:sqlserver://DESKTOP-IHHCNDI\\TEJASSRV;databaseName=demo;encrypt=true;trustServerCertificate=true;";
      String username = "sa";  // ← replace with actual username
      String password = "123456";  // ← replace with actual password
      	Connection con = null;
	
	try {
    
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
 //     try (Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-IHHCNDI\\TEJASSRV;databaseName=demo;", username, password)) {

        con = DriverManager.getConnection(connectionString, username, password);
// try (Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-IHHCNDI\\TEJASSRV;databaseName=demo;", username, password)) {
        System.out.println("Connection done");
    } catch (ClassNotFoundException e) {
        System.out.println("Driver not found: " + e.getMessage());
    } catch (SQLException e) {
        System.out.println("Error in connection: " + e.getMessage());
    }

    return con;
}
}