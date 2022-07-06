package sample;

class Employee
{
	//instance variable
	//static variable 
	//method local variable
	
	int employeeId;
	String employeeName;
	
	
	static String college= "IIT";
	
	
	
	void display()
	{
		int a=100;
		
		System.out.println("Testing"+a);
	}
	
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(); //e1 is an object
		
		e1.employeeId=100;
		e1.employeeName="sam";
		
		
		System.out.println(e1.employeeId);
		System.out.println(e1.employeeName);
		
		System.out.println(Employee.college);
		
		
		e1.display();

	}

}
