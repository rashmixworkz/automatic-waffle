package com.xworkz.streams.DTO;

import java.io.Serializable;

public class Sanitizer implements Serializable {

	private int id;
	private String brand;
	private double price;
	private String color;

	public Sanitizer() {
		System.out.println("default");
	}

	public Sanitizer(int id, String brand, double price, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	@Override
	public int hashCode() {
		return 43;
	}
	
	

	@Override
	public String toString() {
		return "Sanitizer [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals methods");
		if (obj != null) {
			if (obj instanceof Sanitizer) {
				Sanitizer sani = (Sanitizer) obj;
				if (sani.brand.equals(this.brand)) {
					return true;
				}

			}
		}

		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
