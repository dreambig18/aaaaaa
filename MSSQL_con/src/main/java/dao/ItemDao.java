package dao;

import java.util.List;

import model.Items;

public interface ItemDao {
	 int createRecord(List<Items> reglst);
	   List<Items> retrive(int billNumber,String lehangaCode, String blouseCode, String odhaniCode);

}
