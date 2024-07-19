package com.java8;

//A interface with single abstract method is called Functional Interface(SAM)
interface i3
{
	void   meth(int x,int y);
	
}
/*
class A implements i3
{
	public void meth(int g)
	{
		System.out.println("hello"+g);
	}
}
*/
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		//i3 obj=new A();
		//obj.meth(4);
		
	System.out.println("implementing by anonymous class");	
		
	i3 obj=new i3()
	{
		public void  meth(int g,int k)
		{
			System.out.println(g+k);
		}
	}	;	
		
	obj.meth(4,45);
	//lambda expression is used to implement functional interface
	i3 obj2=( g,h)->
		
			System.out.println(g+h);
			
		
	obj2.meth(41,23);
	
	
	}

}
