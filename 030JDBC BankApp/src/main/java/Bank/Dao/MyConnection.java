package Bank.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static Connection getConnetion() {
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			 con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-IHHCNDI:1521:XE","System","tejas18");
			//System.out.println("Connection to DB :"+con);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection To Database...");
		return con;
	}

}
