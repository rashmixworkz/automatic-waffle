package com.xworkz.Task17.things;

public class Bread {

	public String type;
	public String companyName;
	public int price;
	public String shape;
	public double quantity;

	public Bread(String type) {
		this.type = type;
		System.out.println("enterd");
	}

	public Bread(int price) {
		this.price = price;
		System.out.println("enterd");
	}

	public Bread(double quantity) {
		this.quantity = quantity;
		System.out.println("enterd");
	}

	public Bread(String type, int price) {
		this.type = type;
		this.price = price;
		System.out.println("enterd");
	}

	public Bread(double quantity, String companyName) {
		this.quantity = quantity;
		this.type = type;
		System.out.println("enterd");
	}

	public Bread(int price, double quantity, String type) {
		this.price = price;
		this.quantity = quantity;
		this.type = type;
		System.out.println("enterd");
	}

	public Bread(String type, String shape) {
		this.shape = shape;
		this.type = type;
		System.out.println("enterd");
	}

	public Bread(String type, String companyName, String shape) {
		this.type = type;
		this.companyName = companyName;
		this.shape = shape;
		System.out.println("enterd");
	}

}
