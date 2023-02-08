package com.xworkz.Place.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.Place.Dto.CasinoDto;

@Controller
@RequestMapping("/sent")
public class CasinoController {

	public CasinoController() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onMethod(CasinoDto dto, Model model) {
		System.out.println("running on casino" + dto);
		model.addAttribute("name", dto.getName());
		model.addAttribute("entry fee", dto.getEntryFee());

		return "Casino.jsp";

	}

}
