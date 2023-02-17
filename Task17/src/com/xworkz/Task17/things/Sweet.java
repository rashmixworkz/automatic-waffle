package com.xworkz.Task17.things;

public class Sweet {
	
	public static String shopName;//static
	public String sweetName;//cons
	public double price;//ref
	public String color="Yellow";//lit
	public double quantity;//ref
	
	public Sweet(String sweetName)
	{
		this.sweetName=sweetName;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void display() 
	{
		System.out.println(this.shopName);
		System.out.println(this.sweetName);
		System.out.println(this.price);
		System.out.println(this.color);
		System.out.println(this.quantity);
	
	}
	public void displayTotalQuantity()
	{
		double total=quantity*this.price;
		System.out.println("total quantity of the sweet is:"+total);
	}
	
	static 
	{
	  Sweet.shopName="ashasweets";
	}

}
