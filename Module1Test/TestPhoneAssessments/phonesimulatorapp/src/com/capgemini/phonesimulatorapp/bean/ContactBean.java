package com.capgemini.phonesimulatorapp.bean;

import java.io.Serializable;

public class ContactBean implements Serializable {
	private String name;
	private int number;
	private String groupname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	@Override
	public String toString() {
		return "ContactBean [name=" + name + ", number=" + number + ", groupname=" + groupname + "]";
	}
	
	

}
