package com.cetpa.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.models.EmployeeOutIn;
import com.cetpa.services.DatewiseReportService;
import java.util.*;

@Controller()
@RequestMapping("employee-out-in/datewise-report")
public class DatewiseReportController 
{
	@Autowired private DatewiseReportService service;
	@RequestMapping("date")
	public String getChooseDateView(Model model)
	{
		System.out.println("hello date");
		model.addAttribute("cdate",LocalDate.now());
		return "datewise-report/choose-date";
	}
	@RequestMapping("current-date-report")
	public String getCurrentDateReport(Model model)
	{
		List<EmployeeOutIn> list=service.getCurrentDateList();
		model.addAttribute("list",list);
		return "datewise-report/current-date-report";
	}
}
