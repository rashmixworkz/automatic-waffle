package com.xworkz.validationAndDisplay.controller;

import java.util.Arrays;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.validationAndDisplay.DTO.ValentineDto;
import com.xworkz.validationAndDisplay.entity.ValentineEntity;
import com.xworkz.validationAndDisplay.repository.ValentineEntityRepo;
import com.xworkz.validationAndDisplay.service.ValentineService;

@Controller
@RequestMapping("/valentine")
public class ValentineController {

	@Autowired
	private ValentineEntityRepo valentineEntityRepo;

	@Autowired
	private ValentineService valentineService;

	private List<String> places = Arrays.asList("Mall", "Cubben Park", "NandiHills", "LalBhag");

	private List<String> gifts = Arrays.asList("Chocolate", "Ring", "Teddy", "Dress");

	public ValentineController() {
		System.out.println("created" + getClass().getName());
	}

	@GetMapping
	public String onValentine(Model model) {
		System.out.println("Running onValentine from get method");
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		return "ValntineDetails";

	}

	@PostMapping
	public String onValentine(Model model, ValentineDto dto) {
		System.out.println("Running onValentine from post method" + dto);

		Set<ConstraintViolation<ValentineDto>> violations = valentineService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violation in controller go to succes page");

			return "ValentineSuccess";
		}

		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("error", violations);
		

		System.out.println(dto.getGifts());

		System.out.println("Violation in controller");
		return "ValntineDetails";

	}

}
