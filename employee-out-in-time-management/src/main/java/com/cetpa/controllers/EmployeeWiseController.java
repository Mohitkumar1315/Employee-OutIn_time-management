package com.cetpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.models.Employee;
//import com.cetpa.repositories.EmpwiseReportRepository;
import com.cetpa.services.EmployeeService;

@Controller
@RequestMapping("employee-out-in/empwise-report")
public class EmployeeWiseController 
{

	@Autowired private EmployeeService eservice;
	//@Autowired private EmpwiseReportRepository service;
	@RequestMapping("list")
	public String getEmployeeList(Model model)
	{
		List<Employee> list=eservice.getEmployeeList();
		model.addAttribute("elist",list);
		return "empwise-report/employee-list";
	}
	
}
