package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import db.connection;

 
import model.Items;

public class ItemDaoImp implements ItemDao {
	connection c=new connection();
	
	@Override
	public int createRecord(List<Items> lst) {
		
		Connection conn=null;
		Items robj=lst.get(0);
//	Items iboj=ilst.get(0);
		int i=0;
		try {
			conn=c.getconnection();
			PreparedStatement pstate=conn.prepareStatement("insert into ****** values(?,?,?,?,?)");
			pstate.setInt(1,robj.getBillNumber() );
			pstate.setString(2, robj.getLehangaCode());
			pstate.setString(3, robj.getBlouseCode());
			pstate.setString(4, robj.getOdhaniCode());
			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return i;
		// TODO Auto-generated method stub
//		return 0;
	}

	@Override
	public List<Items> retrive(int billNumber, String lehangaCode, String blouseCode, String odhaniCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
