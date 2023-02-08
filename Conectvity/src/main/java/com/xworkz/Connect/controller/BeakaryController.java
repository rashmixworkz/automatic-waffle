package com.xworkz.Connect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.Connect.DTO.BekaryDto;
import com.xworkz.Connect.service.BeakaryService;
@Controller
@RequestMapping("/details")
public class BeakaryController {
	@Autowired
	private BeakaryService beakaryService;
	
	public BeakaryController() {
		System.out.println("created"+getClass().getName());
		
	}
	@GetMapping
	public String onDetails(BekaryDto dto, Model model) {
		System.out.println("Running Beakary Details"+dto);
		
		model.addAttribute("name", dto.getName());
		model.addAttribute("ownerName", dto.getOwnerName());
		model.addAttribute("wifeName", dto.getWifeName());
		model.addAttribute("marriage", dto.getMarriage());
		model.addAttribute("famous", dto.getFamous());
		model.addAttribute("since", dto.getSince());
		
	boolean savedData=this.beakaryService.validAndSave(dto);
	System.out.println("Saved data in controller: "+savedData);
		return "BeakaryDetails.jsp";
		
	}

}
