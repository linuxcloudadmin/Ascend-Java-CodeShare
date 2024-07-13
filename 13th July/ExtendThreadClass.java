public class ExtendThreadClass extends Thread{
	
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
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	

	public static void main(String[] args) {
		ExtendThreadClass obj=new ExtendThreadClass();
		ExtendThreadClass obj1=new ExtendThreadClass();
		obj.setName("fred");
		obj1.setName("lucy");  
		
 obj.setPriority(8);
 obj1.setPriority(4);
obj.start();
obj1.start();
		
		
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
