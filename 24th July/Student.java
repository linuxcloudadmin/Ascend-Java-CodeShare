package com.db;

import java.time.LocalDate;

public class Student {
int sid;
String sname;
float marks;
LocalDate dob;
public Student(int sid, String sname, float marks, LocalDate dob) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.marks = marks;
	this.dob = dob;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", Sname=" + sname + ", marks=" + marks + ", dob=" + dob + "]";
}



}
