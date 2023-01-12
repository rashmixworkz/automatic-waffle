package com.xworkz.Spring_beanTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	
	@Autowired
	@Qualifier("Apsara")	
private	String name;
	@Autowired
	@Qualifier("writingpencil")
private	String type;
	@Autowired
	@Qualifier("pencilPrice")
private	double price ;
	@Autowired
	@Qualifier("ashcolor")
private	String color;
	@Autowired
	@Qualifier("rectangle1")
private	String shape;
	@Autowired
	@Qualifier("isPencilSharp")
private  boolean sharp;

public Pencil() {
	System.out.println("default const of penil");
}

@Override
public String toString() {
	return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
			+ ", sharp=" + sharp + "]";
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

public boolean isSharp() {
	return sharp;
}

public void setSharp(boolean sharp) {
	this.sharp = sharp;
}

	
	
	

}
