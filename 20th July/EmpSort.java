package com.java8new;
import java.util.*;
import java.util.stream.*;
class Employee

{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
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
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
}
public class EmpSort {

	public static void main(String[] args) {
	List<Employee >l=new ArrayList();
	l.add(new Employee(10,"ann",8000) );
	l.add(new Employee(11,"zann",28000) );
	l.add(new Employee(12,"pann",18000) );
	l.add(new Employee(13,"dann",38000) );
	
	/*
	System.out.println("sorting on salary using anonymous class");
	l.stream().sorted(new Comparator<Employee>()
	{
		public int compare(Employee o1,Employee o2){  
		return 	(int)(o1.getSalary()-o2.getSalary());
			
		}}).forEach(System.out::println);
	
	*/
	System.out.println("sorting on salary using lambda expression");
	
	l.stream().sorted((Employee o1,Employee o2)->{  
		return 	(int)(o1.getSalary()-o2.getSalary());
			
		}).forEach(System.out::println);
	
	System.out.println("sorting using Method Reference");
	
	l.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);;
}
}
