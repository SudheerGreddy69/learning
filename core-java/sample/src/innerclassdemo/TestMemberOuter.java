package innerclassdemo;


//member inner class
class Outer
{
	
	private int data=30;
	
	class Inner
	{
		void msg()
		{
			System.out.println("data "+data);
		}
	}
	
}




public class TestMemberOuter {

	public static void main(String args[])
	{
		
		
		Outer outer= new Outer();
		
		Outer.Inner inner= outer.new Inner();
		
		inner.msg();
		
	}
	
}
