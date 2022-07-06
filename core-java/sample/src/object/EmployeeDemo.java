package object;


class Employee
{
	
	//variables
	int employeeId;
	String employeeName;
	static String company="Walmart";
	
	
	//methods 
	void display()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.print(company);
	}
	
	
}








public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee.company="amazon";
		
		Employee emp= new Employee();//we are creating an object
		
		emp.employeeId=123;
		emp.employeeName="Sam kumar"; //Reference assinged
		
		emp.display();//we are calling a method
		
		
	Employee emp1= new Employee();//we are creating an object
		
		emp1.employeeId=124;
		emp1.employeeName="Ram kumar";
		
		emp1.display();//we are calling a method

	}

}
