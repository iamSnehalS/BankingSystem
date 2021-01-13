package com.snehal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cust")
public class Customer {

	@Id
	private int cid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}



	private int accountid;
	private String name;


	public Customer() {
		super();
	}

	public Customer(String name, String city) {
		super();
		this.setName(name);
	}

	public Customer(int cid, String name, int accountid) {
		super();
		this.setAccountid(accountid);
		this.setName(name);
		this.setCid(cid);
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Account{" + "cid=" + cid + ", name='" + name + '\'' + ", accountid='" + accountid + '\'' + '}';
	}
}
