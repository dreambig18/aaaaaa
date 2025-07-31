package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Model.Login;
import com.Model.Register;

public class RegisterDao {
	int i=0;
	Connection con=null;
	MyConnection m=new MyConnection();
	PreparedStatement pstate;    //used to execute parameterized query. 
	
	
	public int createAccount(Register register) {
		con =m.getConnetion();
		
		try {
				pstate=con.prepareStatement("insert into AccountInto values(?,?,?)");
				pstate.setInt(1,register.getAccNo());
				pstate.setString(2,register.getCustName());
				pstate.setInt(3, register.getAccBal());
				 i=pstate.executeUpdate();   //i mde sarv value ah
				if(i>0) {
					System.out.println("Acoount Created.>>>");
				}
		}catch (Exception e) {
			System.out.println(e);
		}	
		return i;
	}


	public boolean validateUser(Login lobj) {

		boolean b=false;
		con=MyConnection.getConnetion();
		try {
			PreparedStatement ps=con.prepareStatement("select * from AccountInto where AccNo=? And custName=?");
			ps.setInt(1, lobj.getAccNo());
			ps.setString(2, lobj.getCname());
			ResultSet rs=ps.executeQuery();
			if (rs.next()) {
				b=true;
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}


	
}
