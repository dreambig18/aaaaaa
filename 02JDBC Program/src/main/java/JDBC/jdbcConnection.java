package JDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import com.sun.net.httpserver.Authenticator.Result;

public class jdbcConnection {
	public static void main(String[] args) {
		System.out.println("\n\n--------------------Welcome In Java World-------------------------");
		System.out.println("--------------------JDBC CRUD Application-------------------------\n\n");
		
		Scanner sc=new Scanner(System.in);
	
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user_name="System";
		String pass="tejas18";
		
		int ch=0;
		try {
			    //Step 1: Loading the Oracle JDBC driver class
				Class.forName(driver);

				//Step 2: Establishing a connection to the Oracle database
				Connection con = DriverManager.getConnection(url,user_name,pass);
				System.out.println("\nConnection to DB :"+con);
				do {
				System.out.println("1 insert\n2 Delete \n3 update \n4 search \n5 Display All");  //CRUD
				System.out.println("Enter your Choice: ");
				ch=sc.nextInt();
						
				if(ch==1) {
					PreparedStatement pstate=con.prepareStatement("insert into linkcode values(?,?,?)");
					System.out.println("\n\nEnter Student Id, Name, perct...");
					pstate.setInt(1, sc.nextInt());   //?
					pstate.setString(2, sc.next());   //?
					pstate.setFloat(3, sc.nextFloat());//?
					int i=pstate.executeUpdate();
					if (i>0) {
						System.out.println("\nRecord Inserted...");
			
					}
					else {
						System.out.println("\nUnable to save Inserted ...");
					}
				}
								
				else if (ch==2) {
					System.out.println("\n\nEnter the id to delete the record ...");
					int stud_id=sc.nextInt();
					PreparedStatement pstate=con.prepareStatement("delete from linkcode where stud_id= (?)");
					pstate.setInt(1, stud_id);
					int i=pstate.executeUpdate();
					
					if (i>0) {
						System.out.println("\nRecord Deleted ...");
					}
					else {
						System.out.println("\nUnables to delete the decord...");
					}
				}
				
				
				else if (ch==3) {
					System.out.println("\n\nEnter Student ID and percentage to update in Database ");
					int stud_id=sc.nextInt();
					float perct=sc.nextFloat();
					PreparedStatement pstate=con.prepareStatement("update linkcode set stud_perct=? where stud_id= (?)");
					pstate.setInt(2, stud_id);
					pstate.setFloat(1, perct);
					int i=pstate.executeUpdate();
					if (i>0) {
						System.out.println("\nRecord updated ...");
					}
					else {
						System.out.println("\nUnables to update the decord...");
					}
				}
				
				else if (ch==4) {
					System.out.println("\n\nEnter student id to search the record...");
					PreparedStatement pstate=con.prepareStatement("select * from linkcode where stud_id=?");
					pstate.setInt(1,sc.nextInt());
					ResultSet result=pstate.executeQuery();
					if (result.next()) {
						System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getFloat(3));
					}
					else {
						System.out.println("\nUnables to Search the record...");
					}
				}
				
				
				else if (ch==5) {
					System.out.println("\n");
					String str="select * from linkcode";
					Statement stat=con.createStatement();
					ResultSet result=stat.executeQuery(str);
					while (result.next()) {
						System.out.println("\n"+result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getFloat(3));
					}					
				}
				System.out.println("\n\n\nDo you want to continue yes or no...");
				} while (sc.next().equals("yes"));
				System.out.println("\n\n\n-------------------------THANK YOU-----------------------------");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
