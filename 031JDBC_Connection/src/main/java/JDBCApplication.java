import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCApplication {
	 // The main method is the entry point of the Java application
    public static void main(String[] args) {
    	
        // Print a welcome message to the console
        System.out.println("Welcome...");

        try {
            // Attempt to load the Oracle JDBC driver class dynamically
            Class.forName("oracle.jdbc.OracleDriver");

            // Establish a connection to the Oracle database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tejas18");

            // Print the information about the established database connection
            System.out.println("Connection to DB: " + con);

        } catch (ClassNotFoundException e) {
            // Handle the case where the Oracle JDBC driver class is not found
            e.printStackTrace();
        } catch (SQLException e) {
            // Handle SQL exceptions, such as issues with the database connection
            System.out.println(e);
        }

        // Print a concluding message to the console
        System.out.println("Thank You...");
	
}
}
