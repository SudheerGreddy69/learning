package designpattern;





class A{  
	

	 private static A obj;  
	 
	 private A(){
		 
	 }  
	   
	 
	 
	public static A getA() {// Lazy

		if (obj == null) {

			obj = new A();// instance will be created at request time
		}

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


