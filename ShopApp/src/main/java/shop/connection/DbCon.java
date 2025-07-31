package shop.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {
	private static Connection connection = null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if(connection == null){
        	Class.forName("oracle.jdbc.OracleDriver");
        	connection= DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-IHHCNDI:1521:XE","System","tejas18");
            System.out.print("connected");
        }
        return connection;
    }

}
