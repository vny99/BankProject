package com.democal;

public class Bank {
	private int bankId;
	private String bankName;
	private String accNum;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", accNum=" + accNum + "]";
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int bankId, String bankName, String accNum) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.accNum = accNum;
	}
	

}
