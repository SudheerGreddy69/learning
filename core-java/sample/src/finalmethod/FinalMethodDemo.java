package finalmethod;


class Bike
{
	final void run()//final method cannot be  overriden
	{
		System.out.println("running bike");
	}
}


class Honda extends Bike
{
/* void run()
 {
	 System.out.println("running honda");
 }*/
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		
		
      Honda h =new Honda();
    //  h.run();
	}

}
