package iopack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream in= new FileInputStream("C:\\Sudheer\\Java\\testout.txt");
			
			int i=0;
			
			
			
			while((i=in.read())!= -1)
					{
				System.out.print((char)i);
					}
			
		} catch (Exception e) {
			
		}
		

	}

}
