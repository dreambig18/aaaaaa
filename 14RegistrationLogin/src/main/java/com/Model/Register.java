package com.Model;

public class Register {
	private int accNo;
	private String cname;
	private int accBal;
	public Register(int accNo, String cname, int accBal) {
		super();
		this.accNo = accNo;
		this.cname = cname;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return cname;
	}
	public void setCustName(String custName) {
		this.cname = custName;
	}
	public int getAccBal() {
		return accBal;
	}
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
	
	

}
