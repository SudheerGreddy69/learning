package finalkeyword;


class Bike
{
	final int speed=60;//we cannot change the value
	
	
	void run()
	{
	//	speed=90;
	System.out.println("Running bike "+ speed);
	}
}


public class FinalDemo {

	public static void main(String[] args) {
		
		Bike b= new Bike();
		
		b.run();
		
		
		
	}

}
