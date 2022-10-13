package com.xworkz.Task17.things;

public class Fish {

	public String name;
	public String type;
	public int price;
	public double weight;
	public double length;

	public Fish(String name) {
		this.name = name;
		System.out.println("Entered Fish name by passing parameter name");
	}

	public Fish(String type, int price) {
		this.type = type;
		this.price = price;
		System.out.println("Entered Fish type by passing parameter type");
		System.out.println("Entered Fish price by passing parameter price");
	}

	public Fish(int price, double length) {
		this.price = price;
		this.length = length;
		System.out.println("Entered Fish price by passing parameter price");
		System.out.println("Entered Fish length by passing parameter length");
	}

	public Fish(String name, double length) {
		this.name = name;
		this.length = length;
		System.out.println("Entered Fish price by passing parameter price");
		System.out.println("Entered Fish length by passing parameter length");
	}

	public Fish(double length, String name, double weight) {
		this.length = length;
		this.name = name;
		this.weight = weight;
		System.out.println("Entered Fish price by passing parameter price");
		System.out.println("Entered Fish length by passing parameter length");
	}

	public Fish(double weight, String type) {
		this.weight = weight;
		this.type = type;
		System.out.println("Entered Fish price by passing parameter price");
		System.out.println("Entered Fish length by passing parameter length");
	}

	public Fish(String type, String name) {
		this.type = type;
		this.name = name;
		System.out.println("Entered Fish price by passing parameter price");
		System.out.println("Entered Fish length by passing parameter length");
	}

	public Fish(double weight, double length, int price) {
		this.weight = weight;
		this.length = length;
		this.price = price;
		System.out.println("Entered Fish price by passing parameter price");
		System.out.println("Entered Fish length by passing parameter length");
	}

}
