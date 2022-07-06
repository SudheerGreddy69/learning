package privateaccess;


class A
{

	private int data=40;//we cannot access outside the class
	
	private void msg()
	{
		System.out.println("Hello Java");
	}
	
}

public class Simple {

	public static void main(String[] args) {
	
		A a =new A();
		//a.data
//a.msg();
	}

}
