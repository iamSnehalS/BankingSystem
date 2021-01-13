package com.snehal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	private int id;

	private String name;
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee() {
		super();
	}

	public Employee(String name, String city) {
		super();
		this.setName(name);
		this.setCity(city);
	}

	public Employee(int id, String name, String city) {
		super();
		this.setId(id);
		this.setName(name);
		this.setCity(city);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Account{" + "id=" + id + ", name='" + name + '\'' + ", city='" + city + '\'' + '}';
	}
}
