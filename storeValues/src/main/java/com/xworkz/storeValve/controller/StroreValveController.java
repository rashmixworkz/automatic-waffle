package com.xworkz.storeValve.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.storeValve.DTO.StoreValueDto;
import com.xworkz.storeValve.service.StroreService;

@Controller
@RequestMapping("/store")
public class StroreValveController {
	
	@Autowired
	private StroreService stroreService;
	
	public StroreValveController() {
System.out.println("controller Class");	
}
	@GetMapping()
	public String store(StoreValueDto dto,Model model) {
		System.out.println("Running store method in  StroreValveController"+dto);
		
	boolean saved=	this.stroreService.saveAndValidate(dto);
	System.out.println("service method"+saved);
		return "index";
		
	}

}
