package Bank.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.sql.Statement;

import Bank.Model.Account;

public class AccountDao {
	static Connection con=null;
	{
		con=MyConnection.getConnetion();
	}
	public void create(List<Account> lstacc) {
		Account acc=lstacc.get(0);
			try {
			PreparedStatement pstate=con.prepareStatement("insert into bankAccount values(?,?,?)");
			pstate.setInt(1, acc.getAccNo());
			pstate.setString(2, acc.getCustName());
			pstate.setDouble(3,acc.getAccBal());
			
			int i=pstate.executeUpdate();
			if (i>0) {
				System.out.println("Record Save...");
			}
			else {
				System.out.println("Record not save...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Account> retrive(int accNo) {
		ArrayList<Account> alist=null;
		try {
			
		
		PreparedStatement pstat=con.prepareStatement("select ");
		pstat.setInt(1, accNo);
		ResultSet result=pstat.executeQuery();
		if (result.next()) {
			Account acc=new Account(result.getInt(1), result.getString(2), result.getDouble(3));
			alist.add(acc);	
		}	
	} catch (Exception e) 
		{
		// TODO: handle exception
		e.printStackTrace();
		}
		return alist;
	}	
	public List<Account> diplay() {
		List<Account> lst=new LinkedList<Account>();
		String str="select * from bankAccount";
		try {
		Statement stat=con.createStatement();
		ResultSet resultSet=stat.executeQuery(str);
		while(resultSet.next()) {
			Account acc=new Account(resultSet.getInt(1),resultSet.getString(2),resultSet.getDouble(3));
			lst.add(acc);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lst;

	} 
	

}
