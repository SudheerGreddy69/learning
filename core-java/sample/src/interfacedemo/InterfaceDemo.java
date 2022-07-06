package interfacedemo;


interface Printable
{
	//variable
	//method- will not definition
	void print();
	
}


interface Showable
{
	void show();
	
}

class A6 implements Printable,Showable
{

	public void print() {
		System.out.println("printing");
		
	}

	public void show() {
		System.out.println("showing");
		
	}
	
}




public class InterfaceDemo {

	public static void main(String[] args) {
		

		A6 a6= new A6();
		a6.print();
		
		a6.show();
		
	}

}
