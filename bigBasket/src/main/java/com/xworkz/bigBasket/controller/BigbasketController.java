package com.xworkz.bigBasket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bigBasket.DTO.BigBasketDto;
import com.xworkz.bigBasket.service.BigBasketService;

@Controller
@RequestMapping("/basket")
public class BigbasketController {
	
	@Autowired
	private BigBasketService basketService;
	
	public BigbasketController() {
System.out.println("created" + getClass().getName());
	}

	
	@GetMapping
	public String onBasket(BigBasketDto dto) {
		System.out.println("Running onBasket controller");
		System.out.println(dto);
		boolean saved=this.basketService.saveAndValidate(dto);
		System.out.println("saved"+saved);
		return "index";
		
	}
	
	

}
