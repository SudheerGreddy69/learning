package throwpack;

public class TestThrow {
	
	
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person not eligible to vote");
		}
		else
		{
			System.out.println("Person eligble to vote");
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		validate(13);
		
		
	}

}
