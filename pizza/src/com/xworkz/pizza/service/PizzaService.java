package com.xworkz.pizza.service;

import com.xworkz.pizza.dto.PizzaDTO;

public interface PizzaService {
	
	boolean validateAndSavePizza(PizzaDTO dto);

}
