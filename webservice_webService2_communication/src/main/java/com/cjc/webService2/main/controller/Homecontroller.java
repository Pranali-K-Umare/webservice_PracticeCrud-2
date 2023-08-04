package com.cjc.webService2.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.webService2.main.model.Student;

@RestController
public class Homecontroller 
{
	
	@RequestMapping ("/getdata")
	public Student prelogin()
	{
		
		Student s=new Student();
		s.setRollno(1);
		s.setName("Pranali");
		s.setAddr("Sumitra Nagar");
		return s;
	}
	
	
	@PostMapping ("/regData")
	public String regData(@RequestBody Student s)
	{
		System.out.println("Rollno "+s.getRollno());
		System.out.println("Name "+s.getName());
		System.out.println("Addr "+s.getAddr());
		return "Save Data";
	}

	
}
