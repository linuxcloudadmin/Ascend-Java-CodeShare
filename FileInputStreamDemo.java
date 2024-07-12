import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			//File f=new File("d://a.txt");
		fis=new FileInputStream("d://a.txt");
		int c;
		try {
			while((c=fis.read())!=-1)
					{
				System.out.print((char)c);
					}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
finally
{
	try {
		fis.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
}
