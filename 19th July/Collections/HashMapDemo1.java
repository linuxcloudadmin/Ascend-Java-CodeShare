package com.collections;
import java.util.*;
public class HashMapDemo1 {

	public static void main(String[] args) {
	/*	Map m=new HashMap();
		m.put(1,"ann");//entry
		m.put("bennie", 2);
		m.put(1,"dann");
		System.out.println(m);
		System.out.println(m.get(1));*/
		
		Map<Integer,String> m1=new HashMap();
		m1.put(1,"rakesh");
		m1.put(2,"nitin");
		m1.put(3,"divya");
		//System.out.println(m1.get(2));
		for(Map.Entry<Integer,String>  walmart : m1.entrySet())
		{
			
			System.out.println(walmart.getKey()+" : "+walmart.getValue());
		}
	int id=21;
	System.out.println(m1.containsKey(id));
	
	System.out.println("printing only keys");
	Set<Integer> s=m1.keySet();
	System.out.println(s);
	System.out.println("printing values");
	Collection<String> str=m1.values();
	System.out.println(str);
	

	}

}
