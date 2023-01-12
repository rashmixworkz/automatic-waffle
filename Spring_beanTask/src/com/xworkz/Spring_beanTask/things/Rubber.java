package com.xworkz.Spring_beanTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {

	
	
		
		
@Autowired
@Qualifier("Apsara1")
	private	String name;
@Autowired
@Qualifier("hairBand")
	private	String type;
@Autowired
@Qualifier("rubberlPrice")
	private	double price ;
@Autowired
@Qualifier("white")
	private	String color;
@Autowired
@Qualifier("square1")
	private	String shape;
@Autowired
@Qualifier("small")
	private	String size;

	

	public Rubber() {
System.out.println("default cons of rubber");
	}



	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", size=" + size + ", sharp=" +   "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
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



	public String getShape() {
		return shape;
	}



	public void setShape(String shape) {
		this.shape = shape;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	

	
	
}
