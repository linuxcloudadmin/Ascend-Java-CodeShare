package com.collections;

import java.util.HashMap;
import java.util.Map;

class Emp
{
	private int id;
	private String name;
	private double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}


public class HashMapDemo2 {

	public static void main(String[] args) {
	Emp e1=new Emp(100,"ann",7000.00);
	Emp e2=new Emp(101,"zann",27000.00);
	Emp e3=new Emp(102,"pann",17000.00);
	Map<Integer, Emp> m=new HashMap();
	m.put(e1.getId(), e1);
	m.put(e2.getId(), e2);
	m.put(e3.getId(), e3);
	for(Map.Entry<Integer,Emp>  walmart : m.entrySet())
	{
		
		System.out.println(walmart.getKey()+" : "+walmart.getValue());
	}
	//retreiveing value based on key 
	int keytoSearch=101;
	if(m.containsKey(keytoSearch))
	{
		System.out.println(m.get(keytoSearch));
	}
	System.out.println("deleting entry based on key");
	if(m.containsKey(keytoSearch))
	{
		System.out.println(m.remove(keytoSearch));
		
	}
	for(Map.Entry<Integer,Emp>  walmart : m.entrySet())
	{
		System.out.println(walmart.getKey()+" : "+walmart.getValue());
		
	}

	}

}
