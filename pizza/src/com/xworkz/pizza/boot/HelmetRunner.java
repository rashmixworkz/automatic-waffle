package com.xworkz.pizza.boot;

import com.xworkz.pizza.constant.HelmetColor;
import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;
import com.xworkz.pizza.repository.HelmetRepositoryImpl;
import com.xworkz.pizza.service.HelmetService;
import com.xworkz.pizza.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		
		
		
		HelmetDTO dto=new HelmetDTO("Studds",HelmetColor.BLACK,200D,HelmetType.FULL);
		
		HelmetRepository helmetRepository=new HelmetRepositoryImpl();
		HelmetService helmetService=new HelmetServiceImpl(helmetRepository);
		boolean sucess=helmetService.saveAndValidMethod(dto);
		System.out.println("saved successfully"+sucess);
		
	

	}

}
