package com.java8;
interface i31
{
	int  meth(int x,int y);
	default void meth1() 
	{
		System.out.println("hello");
	
	}
}
public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {
	i31 obj2=( g,h)->
	{
		g++;h++;
	return (g+h);
	};
	
	i31 obj22=( g,h)-> { g++;h++; return (g+h);};
	System.out.println(obj2.meth(41,23));
	System.out.println(obj22.meth(1,2));
	
	}

}
