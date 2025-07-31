package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPro {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-IHHCNDI","System","tejas18");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}