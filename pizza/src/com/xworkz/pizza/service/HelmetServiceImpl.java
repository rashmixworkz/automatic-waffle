package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.HelmetColor;
import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService{
	
	
	
	
	
	private HelmetRepository helmetRepository;
	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository=helmetRepository;
	}

	@Override
	public boolean saveAndValidMethod(HelmetDTO dto) {
		
		System.out.println("Running saveAndValidMethod in HelmetServiceImpl");
		
		String name=dto.getName();
		HelmetColor color=dto.getColor();
		HelmetType type=dto.getType();
		Double price=dto.getPrice();
		
		boolean validName=false;
		boolean validColor=false;
		boolean validType=false;
		boolean validPrice=false;
		
		if(name!=null && name.length()>=4 && name.length()<=10) {
			System.out.println("Enterd Helmet name is valid"+name);
			validName=true;
		}else {
			System.err.println("Helmet name is not valid");
		}
		if(color!=null) {
			System.out.println("Enterd Helmet color is valid");
		}else {
			System.out.println("Helmet color is not valid");
		}
		if(type!=null) {
			System.out.println("Enterd Helmet type is valid");
		}else {
			System.out.println("Helmet type is not valid");
		}
		if(price>100 && price<=1000) {
			System.out.println("Enterd Helmet price is valid");
		}else {
			System.out.println("Helmet price is not valid");
		}
		if(validName &&validColor&&validType&&validPrice) {
			System.out.println("HELMET DTO IS VALID AND CAN SAVE USING REPOSITORY");
			boolean saved=helmetRepository.save(dto);
			System.out.println("HELMET DTO IS SAVED"+saved);
			return saved;
		}
		else {
			System.out.println("DTO IS NOT VALID");
			
		}
		
		return false;
	}

}

