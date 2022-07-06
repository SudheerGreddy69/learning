package singleinherit;




class Vehicle//parent class
{
	void run(){
	System.out.println("Running  vehicle");	
	}
}

/*class Engine
{
	
}*/

class Bike extends Vehicle //,Engine//child class
{

	void start(){
		System.out.println("Starting Bike");
	}
	
	
}



public class SingleInheritDemo {

	public static void main(String[] args) {

		
		Bike b= new Bike();
		
		b.start();
		b.run();
		
	}

}
