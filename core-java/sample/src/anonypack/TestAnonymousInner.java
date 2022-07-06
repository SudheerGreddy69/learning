package anonypack;

interface Person
{
	void eat();
}



public class TestAnonymousInner {

	public static void main(String[] args) {

		
	Person p = new Person()	
		{
			public void eat()
			{
				System.out.println("Eating");
			}
			
		};
		
		
		
		p.eat();
		
		
		
	}

}
