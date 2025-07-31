package model;

public class Items {
	private int billNumber;
	private String lehangaCode;
	private String blouseCode;
	private String odhaniCode;
	public Items(int billNumber, String lehangaCode, String blouseCode, String odhaniCode) {
		super();
		this.billNumber = billNumber;
		this.lehangaCode = lehangaCode;
		this.blouseCode = blouseCode;
		this.odhaniCode = odhaniCode;
	}
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public String getLehangaCode() {
		return lehangaCode;
	}
	public void setLehangaCode(String lehangaCode) {
		this.lehangaCode = lehangaCode;
	}
	public String getBlouseCode() {
		return blouseCode;
	}
	public void setBlouseCode(String blouseCode) {
		this.blouseCode = blouseCode;
	}
	public String getOdhaniCode() {
		return odhaniCode;
	}
	public void setOdhaniCode(String odhaniCode) {
		this.odhaniCode = odhaniCode;
	}
	

}



