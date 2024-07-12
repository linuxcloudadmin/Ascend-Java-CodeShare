package com.io;import java.io.*;

public class FileReadWrite {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("d://a.txt");
			fos=new FileOutputStream("d://walmartbatch2.txt");
			int c;
			while((c=fis.read())!=-1)
			{
				fos.write((char)c);
			}
		}
		catch(Exception e) {}
	}
}
