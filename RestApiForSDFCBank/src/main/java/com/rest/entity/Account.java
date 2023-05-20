package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	private long accountNumber;
	private String name;
	private String password;
	private String confornPassword;
	private double balance;
	private String address;
	private long mobileNumber;
	private double depositeAmt;
	private double withdrawAmt;
	private double oldBalance;
	private long transAcno;
	private double transAmt;
	private double transAcOldBalance;
	private double transAcNewBalance;
	public Account() {
		super();
	}
	public Account(long accountNumber, String name, String password, String confornPassword, double balance,
			String address, long mobileNumber, double depositeAmt, double withdrawAmt, double oldBalance,
			long transAcno, double transAmt, double transAcOldBalance, double transAcNewBalance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.password = password;
		this.confornPassword = confornPassword;
		this.balance = balance;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.depositeAmt = depositeAmt;
		this.withdrawAmt = withdrawAmt;
		this.oldBalance = oldBalance;
		this.transAcno = transAcno;
		this.transAmt = transAmt;
		this.transAcOldBalance = transAcOldBalance;
		this.transAcNewBalance = transAcNewBalance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfornPassword() {
		return confornPassword;
	}
	public void setConfornPassword(String confornPassword) {
		this.confornPassword = confornPassword;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public double getDepositeAmt() {
		return depositeAmt;
	}
	public void setDepositeAmt(double depositeAmt) {
		this.depositeAmt = depositeAmt;
	}
	public double getWithdrawAmt() {
		return withdrawAmt;
	}
	public void setWithdrawAmt(double withdrawAmt) {
		this.withdrawAmt = withdrawAmt;
	}
	public double getOldBalance() {
		return oldBalance;
	}
	public void setOldBalance(double oldBalance) {
		this.oldBalance = oldBalance;
	}
	public long getTransAcno() {
		return transAcno;
	}
	public void setTransAcno(long transAcno) {
		this.transAcno = transAcno;
	}
	public double getTransAmt() {
		return transAmt;
	}
	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}
	public double getTransAcOldBalance() {
		return transAcOldBalance;
	}
	public void setTransAcOldBalance(double transAcOldBalance) {
		this.transAcOldBalance = transAcOldBalance;
	}
	public double getTransAcNewBalance() {
		return transAcNewBalance;
	}
	public void setTransAcNewBalance(double transAcNewBalance) {
		this.transAcNewBalance = transAcNewBalance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", password=" + password
				+ ", confornPassword=" + confornPassword + ", balance=" + balance + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + ", depositeAmt=" + depositeAmt + ", withdrawAmt=" + withdrawAmt
				+ ", oldBalance=" + oldBalance + ", transAcno=" + transAcno + ", transAmt=" + transAmt
				+ ", transAcOldBalance=" + transAcOldBalance + ", transAcNewBalance=" + transAcNewBalance + "]";
	}
	
	
}
