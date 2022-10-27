package com.xworkz.Association.things;

public class Fuel 
{
	public boolean special;
	public String type;
	public double price;
	public double quantity;
	public Brand seal=new Brand("Indian oil corporation limted",2345);
	public Location place=new Location(3.45);
	
	public Fuel(boolean special, String type, double price, double quantity)
	{
		super();
		this.special = special;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void displayTotalPrice()
	{
		double total=quantity*this.price;
		System.out.println("Total price of the fuel is:"+total);
	}
	
	public void showOff()
	{
		System.out.println(this.special);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);

	}
	

}

	
