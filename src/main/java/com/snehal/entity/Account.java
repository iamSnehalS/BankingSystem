package com.snehal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	private int accountid;

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;
	private Double balance;

	public Account() {
		super();
	}

	public Account(String type, Double balance) {
		super();
		this.setType(type);
		this.setBalance(balance);
	}

	public Account(int accountid, String type, Double balance) {
		super();
		this.setAccountid(accountid);
		this.setType(type);
		this.setBalance(balance);
	}


	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account{" + "accountid" + accountid + ", type='" + type + '\'' + ", balance='" + balance + '\'' + '}';
	}
}
