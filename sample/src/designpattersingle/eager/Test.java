package designpattersingle.eager;


class A{  
	

	 private static A obj =new A();  
	 
	 private A(){
		 
	 }  
	   
	 
	 
	public static A getA() {// Lazy

		
		return obj;
	}
	
	void display()
	{
		System.out.println("Hello Testing");
	}
	 
}

public class Test
{
	public static void main(String args[])
	{
		A aa= A.getA();
		aa.display();
		
		
		A bb=A.getA();
		
		A cc=A.getA();
		
		
		
	}
	
	
}
