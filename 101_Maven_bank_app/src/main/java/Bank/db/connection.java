package Bank.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLException;

import org.postgresql.ds.PGSimpleDataSource;


//Oracle SQL Connevtion
public class connection {
	private static String driver="oracle.jdbc.OracleDriver";
	private static String url="jdbc:oracle:thin:@DESKTOP-IHHCNDI:1521:XE";
	private static String userName="System";
	private static String password="tejas18";
	static {
		 try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public static Connection getconnection()
	 {
		 Connection conn=null;
		
		 try {
			conn=DriverManager.getConnection(url,userName,password);
			System.out.println("connection "+conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return conn;
	 }

}



/*

//Postagre SQL Connection 
public class connection {
    private static String driver = "org.postgresql.Driver";
    private static String url = "jdbc:postgresql://localhost:5432/your_database_name";
    private static String userName = "postgres";
    private static String password = "DreamBig@18";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new IllegalStateException("Failed to load JDBC driver.");
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to PostgreSQL database.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalStateException("Failed to connect to the database.");
        }
        return conn;
    }
}

*/

	

