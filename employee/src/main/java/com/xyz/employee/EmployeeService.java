package com.xyz.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepository empRepo;
	
	

	public List<Employee> getAllEmployees() {
        List<Employee> empList= new ArrayList<>();
        
       empList= (List<Employee>) empRepo.findAll();
       
		
       
		/*
		 * Employee emp= new Employee(); emp.setEmployeeId(123);
		 * emp.setEmployeeName("Sam"); empList.add(emp);
		 */
		return empList;
	}

	public int saveEmployee(Employee emp) {
		
		empRepo.save(emp);
		
		
		return emp.getEmployeeId();
	}
	
	
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empRepo.save(emp);
		
		return emp.getEmployeeId();
	}

	public void deleteEmployee(int id) {
		System.out.println("Deleting Employee");
		empRepo.deleteById(id);
	}

}
