package com.Model;

public class Register {
	private int regno;
	private String custName;
	private int accBal;
	public Register(int regno, String custName, int accBal) {
		super();
		this.regno = regno;
		this.custName = custName;
		this.accBal = accBal;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getAccBal() {
		return accBal;
	}
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
	

}
