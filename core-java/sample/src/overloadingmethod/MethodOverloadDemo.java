package overloadingmethod;


class Addition
{

	
	void add(int a, int b)
	{
		System.out.println("Sum a,b"+ (a+b));
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("Sum a,b,c"+ (a+b+c));
	}
}





public class MethodOverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition  a= new Addition();
a.add(12, 12);
a.add(12, 12,12);
	}

}
