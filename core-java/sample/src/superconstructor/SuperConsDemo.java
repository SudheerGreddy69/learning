package superconstructor;


class Animal
{
	Animal(String name)
	{
		System.out.println("Animal cons"+name);
	}
}


class Dog extends Animal
{
	Dog()
	{
		super("Dog");//We will the parent cons using the super
		System.out.println("Dog Cons");
	}
}


public class SuperConsDemo {

	public static void main(String[] args) {

		Dog d= new Dog();
		
		
	}

}
