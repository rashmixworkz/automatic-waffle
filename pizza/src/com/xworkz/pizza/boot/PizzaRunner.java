package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) {
		
		PizzaDTO dto=new PizzaDTO("TandooriPaneerPizza","Burger King",PizzaSize.MEDIUM,559,false,"red peprika","VEG");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		
		PizzaService pizzaService=new PizzaServiceImpl();
		pizzaService.validateAndSavePizza(dto);
		System.out.println(dto);
		System.out.println(dto.getCreatedBy());
		System.out.println(dto.getCreatedDate());
	}

}
