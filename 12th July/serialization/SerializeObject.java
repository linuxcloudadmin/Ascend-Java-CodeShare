import java.io.*;
public class SerializeObject {

	public static void main(String[] args) {
		Account acc=new Account(10,"ann",4000.00);
		try {
			FileOutputStream fos=new FileOutputStream("d://streamdemo.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(acc);
			System.out.println("object serialized");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
