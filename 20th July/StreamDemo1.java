package com.java8new;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,2,4,5,3,6,7);
	Stream<Integer> s=	l.stream();
	
//	for(Integer x: l)
//	{
//		sysout(x);
//	}
//	Stream<Integer> unique=s.distinct();
//	unique.forEach(x->System.out.println(x));
	//System.out.println(unique.count());
//l.stream().distinct().forEach(x->System.out.println(x));
//System.out.println(l.stream().distinct().count());
Stream<Integer> s5=l.stream().filter(x->x>4);
System.out.println(s5.mapToInt(x->x).sum());
// 21 +22 can be written as
System.out.println(l.stream().filter(x->x>4).mapToInt(x->x).sum());
	}

}
