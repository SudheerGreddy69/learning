package methodoverriding;


class Vehicle
{
	
	void run(){
		System.out.println("running");
	}
	
}
class Bike extends Vehicle
{
	void run()
	{

		System.out.println("running Bike");
	}
}


public class OverirdeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b=new Bike();
		b.run();
		
		Vehicle v= new Vehicle();
		v.run();

	}

}
