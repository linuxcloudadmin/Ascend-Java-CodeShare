package com.threads;

class Multithread implements Runnable
{
//in running state
@Override
public void run() {
	for(int i=0;i<5;i++)
	{
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("in child");
	}
	
}
}
public class RunnableDemo {

	public static void main(String[] args) {
		Multithread obj=new Multithread();
		//obj.run();
		Thread t=new Thread(obj);  //new state
		t.start();// my  thread is in pool..from pool it will go to running state
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("in main");
		}
		
	}

}
