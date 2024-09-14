package com.SpringJDBC.GroceryStore.Model;
import java.util.*;
/* create table grocery(pid int,pname varchar(20),mfgdate date,expdate date,cost int)*/
public class Product {

	int pid;
	String pname;
	Date mfgdate;
	Date Expdate;
	int cost;
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
	public Date getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(Date mfgdate) {
		this.mfgdate = mfgdate;
	}
	public Date getExpdate() {
		return Expdate;
	}
	public void setExpdate(Date expdate) {
		Expdate = expdate;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", mfgdate=" + mfgdate + ", Expdate=" + Expdate + ", cost="
				+ cost + "]";
	}
	
	
}
