package javastringpack;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="java"; // creating string via literal //String Constant pool -1
		                                                  
		
		char ch[]={'s','t','r','i','n','g','s'};
		
		
		
		String s2=new String(ch);
		
		String s3= new String("Sam"); //2 String constant pool// heap mem
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		String t1="Welcome";//String constant pool
		
		String t2="Welcome";//now no new mem will be created
		
		
		
		
		//Immutable
		
		String s="Sachin";
		
		s=s.concat("Tendulkar");
		
		System.out.println(s);
		
		
		

	}

}
