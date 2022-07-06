package superpack;

class Animal
{
	
	String color="Black";
	
	void eat()
	{
		System.out.println("Eating");
	}
}

class Dog extends Animal
{
	
	String color="White";
	
	
	void printColor()
	{
		System.out.println(color);
		System.out.println(super.color);//it will access immediate parent instance variable
		
		
		super.eat();//it will call immediate parent method
	
	}
}


public class SuperDemo {

	public static void main(String[] args) {
		

		Dog d = new Dog();
		d.printColor();
		
	}

}
