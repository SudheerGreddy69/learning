package stringpack;

public class StringFuncDemo {

	public static void main(String[] args) {

		
		String s1= "Samkumar";
		
		String s2="Ramkumar";
		
		
		System.out.println(s1.length());
		
		
		if(s1.equals(s2))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		
		System.out.println(s1.replace('S', 'R'));
		
		
		System.out.println(s1.substring(0,3));
		
		
	}

}
