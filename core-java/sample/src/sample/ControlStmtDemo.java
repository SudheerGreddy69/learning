package sample;

public class ControlStmtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10;
		int b=20;
		
		
		if(a==10)
		{
			System.out.println("The value of a is 10");
		}

		
		
		
		if(a==20)
		{
			System.out.println("The value of a is 20");
		}
		else
		{
			System.out.println("The vlaue of a is not 20");
		}
		
		
		
		if(a==20)
		{
			System.out.println("The vlaue of a is 20");
		}
		else if (a==30)
		{
			System.out.println("The value of a is 30");
		}
		else
		{
			System.out.println("The value is not 20 or 30");
		}
		
		
		
		
		switch(a)
		{
		case 10:
			System.out.println("The value of a is 10");
		break;
		
		case 20:
			System.out.println("The value of a is 20");
		break;
			
		default:
			System.out.println("The value of a is not 10 or 20");
		break;
		}
		
		
		
		
		//loop
		int i=0;
		
		while(i<5)
		{
			System.out.println("The value of i "+ i);
			i++;
		}
		
		int k=0;
		do
		{
			System.out.println("The value of k "+ k);
			k++;
		}while(k<5);
		
		
		
		for(int j=0;j<5;j++)
		{
			System.out.println("the value of j is "+j);
		}
		
		
		
	}

}
