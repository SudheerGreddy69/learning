package com.xyz.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	

//Get employees
	@GetMapping("/getEmployees")
	public List<Employee> getAllEmployees()
	{
		//service
		List<Employee> empList =empService.getAllEmployees();
		return empList;
	}
	
	
	
	@PostMapping("/employee")
	@CrossOrigin(origins = "http://localhost:3000")	
	public int saveEmployee(@RequestBody Employee employee)
	{
		//call the service // repo //DB
		int id=empService.saveEmployee(employee);
		
		return id;
	}
	
	
	@PutMapping("/updateEmployee")
	public int updateEmployee(@RequestBody Employee employee)
	{
		//call the service // repo //DB
				int id=empService.updateEmployee(employee);
				
				return id;
	}
	
	@DeleteMapping("/deleteEmployee/{employeeId}")
	public void deleteEmployee(@PathVariable int employeeId)
	{
		empService.deleteEmployee(employeeId);
	}
	
	
	
}
