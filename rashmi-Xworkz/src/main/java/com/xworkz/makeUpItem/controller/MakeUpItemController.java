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
			return "MakeUpItem";
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
	
	@GetMapping("/update")
	public String onUpdate(@RequestParam int id,Model model) {
		System.out.println("Running on update"+id);
		MakeUpItemDto dto=	this.makeUpItemService.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("brand", brand);
		model.addAttribute("floavour", floavour);
		return "MakeUpItemUpdate";
	}
	
	@PostMapping("/update")
	public String onUpdate(MakeUpItemDto dto,Model model) {
		System.out.println("Running on update"+dto);
		Set<ConstraintViolation<MakeUpItemDto>> voilations=this.makeUpItemService.validateAndUpdate(dto);
		if(voilations.size()>0) {
			model.addAttribute("error", voilations);
		}else {
			model.addAttribute("message", "MakeUp update Success");

		}
		return "MakeUpItemUpdate";

	}
	@GetMapping("/delete")
	public String onDelete(@RequestParam int id,Model model) {
		System.out.println("Running on delete");
		MakeUpItemDto dto=this.makeUpItemService.deleteById(id);
		model.addAttribute("delete", dto);
		model.addAttribute("message", "Delete success...");
		
		return "Delete";
	}
	@GetMapping("findAll")
	public String onFind(Model model) {
		List<MakeUpItemDto> findall=this.makeUpItemService.findAll();
		if(findall!=null) {
			model.addAttribute("findall", findall);
		}else {
			model.addAttribute("message", "Data not found");
		}
		return "FindAll";
	}
	
	
	@GetMapping("/searchByNameAndPrice")
	public String onSearch(@RequestParam String name,Double price, Model model) {
		System.out.println("Running onSearch in getMethod for name and price" + name+price);
		List<MakeUpItemDto>  dto1=this.makeUpItemService.findByNameAndPrice(name, price);
		if (dto1 != null) {
			model.addAttribute("dto1", dto1);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "SearchByNameAndPrice"; 

}
	
	
	
	
	
	
	
	
	
}
