package com.cetpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cetpa.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> 
{
	@Query("select e.name from Employee e where eid=:arg")
	String getEmployeeName(@Param("arg") int eid);
}
