package com.java8new;

interface i5
{
	void meth(int x);
}
 class app
 {
	   void disp(double y,int g)
	  {
		  System.out.println(y+g);
	  }
	 
	   void disp1(int y)
	  {
		  System.out.println(++y);
	  }
 }

public class InstanceMethodRefDemo {

	public static void main(String[] args) {
		app obj=new app();
i5 obj6=(x)->obj.disp1(x);
obj6.meth(5);


i5 obj1=obj::disp1;
obj1.meth(8);

	}

}
