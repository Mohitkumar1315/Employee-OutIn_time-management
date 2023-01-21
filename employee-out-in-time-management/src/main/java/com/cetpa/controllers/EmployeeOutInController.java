package com.cetpa.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cetpa.models.Employee;
import com.cetpa.models.EmployeeOutIn;
import com.cetpa.services.EmployeeOutInService;
import com.cetpa.services.EmployeeService;
@Controller
@RequestMapping("employee-out-in/outin")
public class EmployeeOutInController 
{
	@Autowired
	private EmployeeOutInService service;
	@Autowired
	private EmployeeService eservice;
	@RequestMapping("out")
	public String getEmployeeOutView(Model model)
	{
		//ModelAndView mv=new ModelAndView();
		List<Employee> list=eservice.getEmployeeList();
		model.addAttribute("elist",list);
		return "empoutin/employee-out";
		//mv.addObject(list);
		//mv.setViewName("empoutin/employee-out");
		//return mv;
	}
	@RequestMapping("save-outtime")
	public String saveEmployeeOutTime(EmployeeOutIn outtime,Model model)
	{
		String name=eservice.getEmployeeName(outtime.getEid());
		model.addAttribute("name",name);
		if(service.saveOutTime(outtime))
			return "empoutin/outtime-save";
		return "empoutin/outtime-fail";
	}
	@RequestMapping("save-outime")
	public String saveEmployeInTime(EmployeeOutIn outtime,Model model)
	{
		String name=eservice.getEmployeeName(outtime.getEid());
		model.addAttribute("name",name);
		if(service.saveOutTime(outtime))
			return "empoutin/outtime-save";
		return "empoutin/outtime-fail";
	}
	@RequestMapping("in")
	public String getEmployeeInView(Model model)
	{
		List<Employee> list=eservice.getEmployeeList();
		model.addAttribute("elist",list);
		return "empoutin/inTimeView";
	}
	@RequestMapping("save-intime")
	public String saveEmployeeInTime(int eid,Model model)
	{
		String name =eservice.getEmployeeName(eid);
		model.addAttribute("name",name);
		if(service.updateIntime(eid))
		{
			return "empoutin/intime-save";
		}
		return "empoutin/intime-fail";
	}
} 