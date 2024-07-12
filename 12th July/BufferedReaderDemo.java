import java.io.*;
public class BufferedReaderDemo {

	public static void main(String[] args) {
		try {
		FileReader fr=new FileReader("d://a.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}

	}
		catch(Exception e)
		{
			
		}
	}
}
