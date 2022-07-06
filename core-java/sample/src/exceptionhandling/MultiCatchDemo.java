package exceptionhandling;

public class MultiCatchDemo {

	public static void main(String[] args) {
		try
		{
			
			int data=100/0;
			System.out.println(data);
			
			String s1=null;
			System.out.println(s1.length());
			
			
			
			String s11="abc";
			Integer i=Integer.valueOf(s11);
			System.out.println(i);
			
			
           int a[]= new int[5];
			
			a[10] = 50;
			System.out.println(a[4]);
			
			
			try
			{
				
			}
			catch(Exception e)
			{
				
			}
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
				
	   catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e) // this should be last
		{
			System.out.println(e);
		}
	}

}
