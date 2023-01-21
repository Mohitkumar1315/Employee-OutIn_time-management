package com.cetpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.models.Employee;
import com.cetpa.repositories.EmployeeRepository;
@Service
public class EmployeeServiceImpl  implements EmployeeService
{
	@Autowired
	private EmployeeRepository repo;
	public boolean isEmployeeExist(int eid) 
	{
		return repo.existsById(eid);
	}
	
	public void saveRecord(Employee emp) 
	{
		 repo.save(emp);
	}
	@Override
	public List<Employee> getEmployeeList() 
	{
		return repo.findAll();
	}

	@Override
	public String getEmployeeName(int eid) 
	{
		
		return repo.getEmployeeName(eid);
	}

	
	

}
