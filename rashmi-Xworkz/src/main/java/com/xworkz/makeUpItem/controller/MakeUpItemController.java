package com.xworkz.makeUpItem.controller;

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


import com.xworkz.makeUpItem.DTO.MakeUpItemDto;
import com.xworkz.makeUpItem.service.MakeUpItemService;

@Controller
@RequestMapping("/")
public class MakeUpItemController {
	@Autowired
	private MakeUpItemService makeUpItemService;
	
	private List<String> brand= Arrays.asList("Lakme","Maybeline","Colorbar","Faces Canada","Insight");

	private List<String> floavour= Arrays.asList("Peach","Rose","Cucumber","Alovera","Multane mitti");

	public MakeUpItemController() {
		System.out.println("Running MakeUpItemController in controller");
	}
	
	@GetMapping("/makeUp")
	public String onMakeUp(Model model) {
		System.out.println("Running onMakeUp method from getMapping");
		model.addAttribute("brand",brand);
		model.addAttribute("floavour",floavour);
		return "MakeUpItem";
		
	}
	
	@PostMapping("/makeUp")
	public String onMakeUp(MakeUpItemDto dto,Model model) {
		System.out.println("Running onMakeUp method from postMapping");
		Set<ConstraintViolation<MakeUpItemDto>> voilations=this.makeUpItemService.validateAndSave(dto);
		if(voilations.isEmpty()) {
			model.addAttribute("dto", dto);
			model.addAttribute("message", "Data saved SuccessFully");
			System.out.println("No voilations in controller");
			return "MakeUpItemSearch";
		}
		model.addAttribute("brand", brand);
		model.addAttribute("floavour", floavour);
		model.addAttribute("error", voilations);
		model.addAttribute("dto", dto);
		System.out.println(dto);
		System.out.println("violations in controller");
		return "MakeUpItem";
		
		
	}
	@PostMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running onSearch in getMethod for id" + id);
		MakeUpItemDto dto = this.makeUpItemService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "MakeUpItemSearch"; 

}
	@GetMapping("/searchbyname")
	public String onSearch(@RequestParam String name,Model model) {
		System.out.println("Running OnSearch in get method for name"+name);
	List<MakeUpItemDto>	makeUpDto=this.makeUpItemService.findByName(name);
	model.addAttribute("makeUpDto",makeUpDto);
		return "MakeUpItemSearchByName";
		
	}
	
	@PostMapping("/update")
	public String onUpdate(MakeUpItemDto dto,Model model) {
		return "MakeUpItem";
	}
	
	
	
	
	
	
	
	
	
}
