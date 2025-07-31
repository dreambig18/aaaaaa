import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JdbcConnection {

	public static void main(String[] args) {
		System.out.println("Welcome...");
	
	try {
		//step 1
			Class.forName("oracle.jdbc.OracleDriver");
		//step 2 connection to db
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-IHHCNDI:1521:XE","System","tejas18");
			System.out.println("Connection to DB :"+con);
	} catch (Exception e) {
		System.out.println(e);

	}
	System.out.println("Thank you..");

	}

}
