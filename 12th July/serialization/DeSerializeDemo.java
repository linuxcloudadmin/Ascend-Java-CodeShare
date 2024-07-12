import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializeDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("d://streamdemo.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Account a=(Account)ois.readObject();
			System.out.println("object deserialized");
			System.out.println(a);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
