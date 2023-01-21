package com.cetpa.services;

import java.util.List;

import com.cetpa.models.Employee;
public interface EmployeeService {

	boolean isEmployeeExist(int eid);

	void saveRecord(Employee emp);

	List<Employee> getEmployeeList();

	String getEmployeeName(int eid);

}
