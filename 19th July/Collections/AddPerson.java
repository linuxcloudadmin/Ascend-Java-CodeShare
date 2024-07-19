package com.service;
import java.util.*;
import com.model.*;
public class AddPerson {
public static List<Person> p21=new ArrayList();
	
public List<Person> returnPersons()
{
	return p21;
}
	public void addPerson(Person p)
	{
		p21.add(p);
	}
	
	public void deletePerson(int p)
	{
		for(Person x:p21)
		{
			if(x.getId()==p)
			{
				p21.remove(x);
				break;
			}
		}
		
	}
}
