package com.java8new;

interface i5
{
	void meth(int x);
}
 class app
 {
	 static  void disp(double y,int g)
	  {
		  System.out.println(y+g);
	  }
	 
	 static  void disp1(int y)
	  {
		  System.out.println(++y);
	  }
 }

public class StaticMethodRefDemo {

	public static void main(String[] args) {
		
i5 obj=(x)->app.disp1(x);
obj.meth(5);
i5 obj1=app::disp1;
obj1.meth(8);

	}

}
