package com.xworkz.airoplane.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.airoplane.DTO.AiroplaneDto;
import com.xworkz.airoplane.service.AiroplaneService;

@Controller
@RequestMapping("/")
public class AiroplaneController {

	@Autowired
	private AiroplaneService airoplaneService;

	private List<String> type = Arrays.asList("Glider", "Biplane", "AirLiner", "FloatPlane", "Boeing");
	private List<String> country = Arrays.asList("India", "Japan", "USA", "China", "Africa");

	public AiroplaneController() {
		System.out.println("created" + getClass().getName());
	}

	@GetMapping("/airoplane")
	public String onAiroplane(Model model) {
		System.out.println("Running onAiroplane in getMethod");
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		return "Airoplane";

	}

	@PostMapping("/airoplane")
	public String onAiroplane(Model model, AiroplaneDto dto) {
		System.out.println("Running onPlane in post method");
		Set<ConstraintViolation<AiroplaneDto>> voilation = this.airoplaneService.validateAndSave(dto);
		if (voilation.isEmpty()) {

			model.addAttribute("dto", dto);
			model.addAttribute("message", "Data saved sucessfully ");

			System.out.println("no voilation in controller");
			return "Airoplane";
		}
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		model.addAttribute("error", voilation);
		model.addAttribute("dto", dto);
		System.out.println(dto);
		System.out.println("violations in controller");
		return "Airoplane";

	}

	@PostMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running onSearch in getMethod for id" + id);
		AiroplaneDto dto = this.airoplaneService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "AiroplaneSearch";

	}
}
