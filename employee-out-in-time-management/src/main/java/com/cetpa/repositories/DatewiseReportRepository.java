package com.cetpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cetpa.models.EmployeeOutIn;

public interface DatewiseReportRepository extends JpaRepository<EmployeeOutIn,Integer> 
{
	List<EmployeeOutIn> findByDate(String currentDate);	
}
