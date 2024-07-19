package com.collections;
import java.util.*;
class Student implements Comparable<Student>{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
  
public int compareTo(Student st){  
//if(age==st.age)  
//return 0;  
//else if(age>st.age)  
//return 1;  
//else  
//return -1;  
	//	return age-st.age;
	return name.compareTo(st.name);
}  
}  
 
public class ComparableDemo{  
public static void main(String args[]){  
ArrayList<Student> al=new ArrayList<Student>(); 
Student st=new Student(104,"Pen",45); 
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Jai",21));  
  al.add(st);
Collections.sort(al);
Collections.reverse(al);

for(Student st2:al){  
System.out.println(st2.rollno+" "+st2.name+" "+st2.age);  
}  
}  
}  
