package com.cetpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.models.EmployeeOutIn;
import com.cetpa.repositories.DatewiseReportRepository;
import com.cetpa.util.LocalDateTime;
@Service
public class DatewiseReportService
{

	@Autowired DatewiseReportRepository repo;
	public List<EmployeeOutIn> getCurrentDateList() 
	{
		return repo.findByDate(LocalDateTime.getCurrentDate());
	}

	
}
