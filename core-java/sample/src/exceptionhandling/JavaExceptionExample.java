package exceptionhandling;

public class JavaExceptionExample {

	public static void main(String[] args) {

		
		try
		{
			
			int data=100/0;
			System.out.println(data);
			
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Arthmetic block completed");
		}
		
		
		
		try
		{
			
			String s1=null;
			System.out.println(s1.length());
			
			
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		try
		{
			
			String s1="abc";
			Integer i=Integer.valueOf(s1);
			System.out.println(i);
			
			
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
		
		try
		{
			
			int a[]= new int[5];
			
			a[10] = 50;
			System.out.println(a[4]);
			
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		
		
		
	}

}
