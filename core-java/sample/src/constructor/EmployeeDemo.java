package constructor;



class Employee
{
	
	//variables
	int employeeId;
	String employeeName;
	
	
	
	Employee(int id,String name)
	{
	System.out.println("I am a constructor");	
	employeeId=id;
	employeeName=name;
	}
	
	
	//methods 
	void display()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
	}
	
	
}



public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee emp= new Employee(123,"Ram Constructor");
		emp.display();

	}

}
