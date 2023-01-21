package com.cetpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController 
{
	@RequestMapping("")
	public String getHomeView()
	{
		return "home/home";
	}
}
