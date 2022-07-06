package sample;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Arithmetic operator
		//logical operator
		//ternary operator

		
		//+ ,-,*,/,%
		
		int a=20;
		int b=30;
		
		
		int c =a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a%b; //20/30 
		
		
		//&& , ||
		
		if(a==20 && b==30)
		{
			System.out.println("Both are okay");
		}
		
		if(a==20 || b==20)
		{
			System.out.println("Condition are satfisfied");
		}
		
		
		
		int min=(a<b) ? a : b;  
		
		
		
		System.out.println( c +" "+d+ " "+e+" "+f+" "+g+" "+min);
	}

}
