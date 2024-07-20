package com.java8;

/*
class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child"+i);
		}
	}
}
*/
public class RunnableDemo {

	public static void main(String[] args) {
//	A obj=new A();
//Thread t=new Thread(obj);
	Runnable r=	()->{
	for(int i=0;i<5;i++)
	{
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child"+i);
	}};
	Thread t=new Thread(r);
t.start();

for(int i=0;i<5;i++)
{
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("main"+i);
		
}	
	}		
	

}
