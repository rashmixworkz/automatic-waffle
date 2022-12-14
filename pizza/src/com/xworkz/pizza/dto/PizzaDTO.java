package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;

public class PizzaDTO extends AbstactAuditDTO{
	
	
	private String name;
	private String company;
	private PizzaSize size;
	private double price;
	private boolean cheese;
	private String flavour;
	private String type;
	
	
	
	
	@Override
	public String toString() {
		return "PizzaDTO [name=" + name + ", company=" + company + ", size=" + size + ", price=" + price + ", cheese="
				+ cheese + ", flavour=" + flavour + ", type=" + type + ", toString()=" + super.toString() + "]";
	}


	public PizzaDTO() {
		super();
	}


	public PizzaDTO(String name, String company, PizzaSize size, double price, boolean cheese, String flavour,
			String type) {
		super();
		this.name = name;
		this.company = company;
		this.size = size;
		this.price = price;
		this.cheese = cheese;
		this.flavour = flavour;
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public PizzaSize getSize() {
		return size;
	}


	public void setSize(PizzaSize size) {
		this.size = size;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isCheese() {
		return cheese;
	}


	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}


	public String getFlavour() {
		return flavour;
	}


	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	

}
