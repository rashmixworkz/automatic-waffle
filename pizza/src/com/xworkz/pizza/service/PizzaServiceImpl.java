package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService {
	
	
	@Override
	
	
	public boolean validateAndSavePizza(PizzaDTO dto) {
		
		System.out.println("Running validateAndSave method in pizza service");
		String name=dto.getName();
		String company=dto.getCompany();
		PizzaSize size=dto.getSize();
		double price=dto.getPrice();
	
		String flavour=dto.getFlavour();
		String type=dto.getType();
		
		boolean nameIsValid=false;
		boolean companyIsValid=false;
		boolean sizeIsValid=false;
		boolean priceIsValid=false;

		boolean flavourIsValid=false;
		boolean typeIsValid=false;
		
		if(name!=null && name.length()>=4 && name.length()<=20) {
			System.out.println("Pizza name is valid....");
			nameIsValid = true;
		}else {
			System.err.println("Pizza name is not valid..");
		}
		if(company!=null && company.length()>4 && company.length()<20 ) {
			System.out.println("Company name is valid...");
			companyIsValid=true;
		}else {
			System.err.println("Company name is not valid..");
		}
		if(size!=null) {
			System.out.println("Pizza size is valid..");
			sizeIsValid=true;
		}else {
			System.err.println("Pizza size not valid");
		}
		if(price>=50 && price<=2000) {
			System.out.println("Pizza price is valid..");
			priceIsValid=true;
			
		}else {
			System.err.println("Pizza price is not valid..");
		}
		if(flavour!=null && flavour.length()>=3 && flavour.length()<=20) {
			System.out.println("flavour is valid...");
			flavourIsValid=true;
		}else {
			System.err.println("flavour is not valid...");
		}
		if(type!=null && type=="VEG" || type=="NONVEG") {
			System.out.println("Pizza type is valid");
			typeIsValid=true;
		}else {
			System.err.println("Pizza type is not valid");
		}
		
		if(nameIsValid &&companyIsValid &&sizeIsValid&&priceIsValid&&flavourIsValid&&typeIsValid) {
			System.out.println("All fields of DTO are valid");
			return true;
		}
		
		System.out.println("All fields of DTO are not valid");
	
		return false;
		
	}
	
	
	
	
	

}
