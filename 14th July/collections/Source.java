package com.utils;

import java.util.*;

import com.model.Person;
import com.service.AddPerson;

class Source
{
public static void main(String[] args) {
	AddPerson s=new AddPerson();
	
	Person p1=new Person(10,"ann",6000);
	Person p2=new Person(11,"ann1",16000);
	Person p3=new Person(12,"ann2",26000);
	
s.addPerson(p1);s.addPerson(p2);s.addPerson(p3); 
List<Person> p22=s.returnPersons();
for(Person x:p22)
{
System.out.println(x.getName()+" "+x.getSalary());
System.out.println(x);
}
System.out.println("printing salary>10000");
for(Person x:p22)
{
if(x.getSalary()>10000)
{
	System.out.println(x);
}
}
System.out.println("eneter id to delete");
Scanner sx=new Scanner(System.in);
int k=sx.nextInt();

s.deletePerson(k);


System.out.println("list after deleting");
for(Person x:p22)
{
	
	System.out.println(x);
}
}
}
