package newpackage;

import java.sql.*;

public class UserDatabase {
    Connection con ;

    public UserDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveUser(User user2){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into user2(name,email,password) values(?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, user2.getName());
           pt.setString(2, user2.getEmail());
           pt.setString(3, user2.getPassword());
           
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
}