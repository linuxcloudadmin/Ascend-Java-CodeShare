import java.io.*;
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try {
		File outFile = new File("d://outFile.txt");
		FileOutputStream fos = new FileOutputStream(outFile,true);
		
		String text = "Hello";
		byte[] textBytes = text.getBytes();
		fos.write(textBytes);
		System.out.println("hello");//
		/*out is static varaible of System class and out is also an
		object of PrintStream class*/
		


	}
				
//		catch(FileNotFoundException e)
//		{
//			System.out.println(e);
//		}
		catch(IOException e)
		{
			System.out.println(e);
		}

}
}
