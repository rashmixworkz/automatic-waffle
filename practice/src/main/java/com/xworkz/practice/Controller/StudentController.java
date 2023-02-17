package com.xworkz.practice.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.practice.Dto.StudentDto;
import com.xworkz.practice.Sevice.Service;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private Service service;
	
	public StudentController() {
System.out.println("created" + getClass().getName());
	}
	@GetMapping
	public String onStudent(StudentDto dto,Model model) {
		System.out.println("Running onStudent method in controller"+dto);
	boolean saved=	this.service.saveAndValidate(dto);
	System.out.println("saved"+saved);
		return "index";
		
	}

}
