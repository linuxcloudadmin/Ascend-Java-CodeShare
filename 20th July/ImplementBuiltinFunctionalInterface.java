package com.java8new;

import java.util.function.*;

public class ImplementBuiltinFunctionalInterface {

	public static void main(String[] args) {
		Function<Integer,Double> obj= (x)->Math.sqrt(x);
		System.out.println(obj.apply(16));
		
		
		Consumer<String> c=(z)->System.out.println(z.length());
		c.accept("walmart");
		Supplier<String> s=()->"walmart";
		System.out.println(s.get());
		BiFunction<String,String,Integer> obj1=(str1,str2)->str1.compareTo(str2);
		System.out.println(obj1.apply("hello","Hello"));
		
		Predicate<Integer> p=(x)->x>10;
		System.out.println(p.test(5));
		System.out.println(p.test(15));

	}

}
