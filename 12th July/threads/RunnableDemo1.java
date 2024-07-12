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
		System.out.println(Thread.currentThread().getName());
	}
	
}
}
public class RunnableDemo {

	public static void main(String[] args) {
		Multithread obj=new Multithread();
		Multithread obj1=new Multithread();
		//obj.run();  if we directly call run() here, until run() completes, it will not proceed to remaining code.
		Thread t=new Thread(obj);  //new state
		t.start();	 // my  thread is in pool..from pool it will go to running state
		Thread t1=new Thread(obj1);
		t.setName("fred");
		t1.setName("lusy");
		t1.start();
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
