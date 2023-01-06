package com.xworkz.pizza.dto;

import java.io.Serializable;

public class SanitizerDTO implements Serializable {
	
	private Integer id;
	private String brand;
	private String color;
	private Double price;
	
	public SanitizerDTO() {
		System.out.println("Running in Default constrctor");
	}

	public SanitizerDTO(Integer id, String brand, String color, Double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", toString()="
				+ super.toString() + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
