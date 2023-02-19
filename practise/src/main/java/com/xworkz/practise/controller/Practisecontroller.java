package com.xworkz.practise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.practise.DTO.PractiseDto;
import com.xworkz.practise.service.PractiseService;

@Controller
@RequestMapping("/practise")
public class Practisecontroller {
	
	
	@Autowired
	private PractiseService practiseService;
	
public Practisecontroller() {
System.out.println("created" + getClass().getName());

}

@GetMapping
public String onPractise(PractiseDto dto) {
	System.out.println("Running onPractise in controller ");
boolean saved=	this.practiseService.saveAndValidate(dto);
System.out.println("details of practise"+dto);
System.out.println("saved"+saved);
	return "PractiseSuccess";
	
}


}
