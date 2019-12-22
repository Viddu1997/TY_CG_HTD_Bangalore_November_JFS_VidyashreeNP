package com.capgemini.filpkart.bean;

import java.io.Serializable;

public class ProductBean implements Serializable {
	private int pid;
	private String pname;
	private int pcost;
	private String color;
	private String pdesc;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPCost() {
		return pcost;
	}
	public void setPCost(int cost) {
		this.pcost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	
	

}
