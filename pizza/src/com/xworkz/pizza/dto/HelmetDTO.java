package com.xworkz.pizza.dto;

import com.xworkz.pizza.constant.HelmetColor;
import com.xworkz.pizza.constant.HelmetType;

public class HelmetDTO extends AbstactAuditDTO {
	
	private String name;
	private HelmetColor color;
	private Double price;
	private HelmetType type;
	
	
	public HelmetDTO() 
	{
	System.out.println("Running default constrctor");
	}


	public HelmetDTO(String name, HelmetColor color, Double price, HelmetType type) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.type = type;
	}


	@Override
	public String toString() {
		return "HelmetDTO [name=" + name + ", color=" + color + ", price=" + price + ", type=" + type + ", toString()="
				+ super.toString() + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public HelmetColor getColor() {
		return color;
	}


	public void setColor(HelmetColor color) {
		this.color = color;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public HelmetType getType() {
		return type;
	}


	public void setType(HelmetType type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
