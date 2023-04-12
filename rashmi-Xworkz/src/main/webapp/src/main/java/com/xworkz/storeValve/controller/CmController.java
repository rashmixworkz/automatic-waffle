package com.xworkz.storeValve.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.storeValve.DTO.CmDto;

@Controller
@RequestMapping("/cm")
public class CmController {
	
	public CmController() {
System.out.println("created" + getClass().getName());
	}
	
	@PostMapping
	public String onCm(CmDto dto,Model model) {
		System.out.println("Running on Cm"+dto);
		return "CM";
		
	}

}
