package iopack;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileOutputStream fout=new FileOutputStream("C:\\Sudheer\\Java\\testout.txt");
			
			
			//fout.write(65);
			
			
			String s= "Welcome to javatpoint";
			
			byte b[]=s.getBytes();
			
			fout.write(b);
			
			
			fout.close();
			
		}catch(Exception e)
		{
		
		}

	}

}
