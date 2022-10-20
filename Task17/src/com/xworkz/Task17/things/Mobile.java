package com.xworkz.Task17.things;

public class Mobile
{
	public String name;
	public String manufacturedLocation;
	public String type;
	public String brand;
	public double price;
	public int ramCapacity;
	public String[] colors;
	public String[] paymentType;
	public double[] ratings;
	public boolean[] isGood;
	public String[] reviews;


public Mobile(String name,String manufacturedLocation,String type,String brand,double price,int ramCapacity,String[] colors,String[] paymentType,double[] ratings,
	 boolean[] isGood,String[] reviews)
{
	this.name = name;
	this.manufacturedLocation = manufacturedLocation;
	this.type = type;
	this.brand = brand;
    this.price=price;
    this.ramCapacity =ramCapacity;
	this.colors =colors;
	this.paymentType =paymentType;
	this.ratings = ratings;
	this.isGood = isGood;
	this.reviews=reviews;

	System.out.println("creating constructor with arrays");
}
public void display()
{
	System.out.println("name of the Mobile:"+name);
	System.out.println("location:"+manufacturedLocation);
	System.out.println("type of the Mobile:"+type);
	System.out.println("Brand:"+brand);
	System.out.println("price:"+price);
	System.out.println("capacity:"+ramCapacity);
	
	System.out.println("mobile colors");
	for (int i = 0; i < this.colors.length; i++)
	{
		String string = this.colors[i];
		System.out.println(string);
		
	}
	
	System.out.println("mobile paymentType ");
	for (int i = 0; i < this.paymentType.length; i++) 
	{
		String string = this.paymentType[i];
		System.out.println(string);
		
	}
	System.out.println("mobile ratings ");
	
	for (int i = 0; i < this.ratings.length; i++)
	{
		double string = this.ratings[i];
		System.out.println(string);
	}
		System.out.println("mobile quality ");
		
		for (int i = 0; i < this.isGood.length; i++) 
		{
			boolean string = this.isGood[i];
			System.out.println(string);
		}
		
		for (int i = 0; i < this.reviews.length; i++) 
		{
			String string = this.reviews[i];
			System.out.println(string);
		}
}
}
		
	






