package JDBC;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import com.sun.net.httpserver.Authenticator.Result;


public class CrudApplication {

	public static void main(String[] args) {
		System.out.println("--------------------Welcome In Java World-------------------------");
		System.out.println("--------------------JDBC CRUD Application-------------------------");
		Scanner sc=new Scanner(System.in);
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@DESKTOP-IHHCNDI:1521:XE";
		String userName="System";
		String password="tejas18";
		int ch=0;
		try {
			//Step 1: Loading the Oracle JDBC driver class
			Class.forName(driver);
			//Step 2: Establishing a connection to the Oracle database
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection to Database: "+con);
			
			
			System.out.println("1 insert\n2 Delete \n3 update \n4 search \n5 Display all");
			System.out.println("Enter your Choice ");
			ch=sc.nextInt();
				
				
				
			
				
				
			if(ch==1) {
				//PreparedStatement pstate=con.prepareStatement("insert into linkcode values(?,?,?)");
				
			}
		
		
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("                   ...Thank You");
	}

}
