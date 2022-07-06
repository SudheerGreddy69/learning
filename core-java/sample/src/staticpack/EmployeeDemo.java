package staticpack;




class Employee
{
	
	
	
	
	
	
	//variables
	int employeeId;
	String employeeName;
	
	
	Employee(int employeeId,String employeeName)
	{
	System.out.println("I am a constructor");	
	this.employeeId=employeeId;
	this.employeeName=employeeName; //this refere to current invoking object
	}
	
	
	//methods 
	void display()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
	}
	
	static
	{
		System.out.println("I am static block");
	}
	
	static void sayHello()
	{
		System.out.println(" I am a static method");
	}
	
}


public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Employee emp= new Employee(123,"Ram Constructor");
				emp.display();
				Employee.sayHello();

	}

}
