package methodassign;

class Employee
{
	
	//variables
	int employeeId;
	String employeeName;
	
	
	void assign(int id,String name)
	{
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
		// TODO Auto-generated method stub
		
		Employee emp= new Employee();
		emp.assign(123, "sam method");
		emp.display();

	}

}
