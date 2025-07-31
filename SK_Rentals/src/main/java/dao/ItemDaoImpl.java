package dao;
import java.util.List;
import model.Items;


public interface ItemDaoImpl {
	 int createRecord(List<Items> reglst);
	 List<Items> retrive(String Billnumber,String lehangaCode, String blouseCode, String odhaniCode);

}

