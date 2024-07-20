package com.java8new;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String name="aa@gmail.com";
//		Optional obj=Optional.empty();
//		System.out.println(obj);
		
		Optional s=Optional.ofNullable(name);
		if(s.isPresent())
		{
			System.out.println(s.get());
		}
		else
		{
			System.out.println("not present");
		}
		

	}

}
