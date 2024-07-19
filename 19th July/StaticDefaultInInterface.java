package com.java8;


interface car
{
	void fun();
	 default void airbags() {System.out.println(2);}
	 static void meth() {
		 System.out.println("sensor operatored");
	 }
	
}
class BMW implements car
{
	public void airbags() {System.out.println(6);}
	public void fun() {
		System.out.println("hello BMW");
	}
}
class Alto implements car
{
	
	public void fun() {
		System.out.println("hello alto");
	}
}

 
public class StaticDefaultInInterface {

	public static void main(String[] args) {
		
car c1=new BMW();
c1.airbags();c1.fun();
car.meth();
c1=new Alto();
c1.airbags();c1.fun();
car.meth();
	}

}
