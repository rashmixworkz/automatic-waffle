package com.xworkz.Task17.things;

public class Pizza
{
	public String name;
	public char size;
	public String type;
	public String brand;
	public double price;
	public String[] flavours;
	public String[] paymentType;
	public double[] ratings;
	public boolean[] isGood;
	public String[] reviews;


public Pizza(String name,char size,String type,String brand,double price,String[] flavours,String[] paymentType,double[] ratings,
	 boolean[] isGood,String[] reviews)
{
	this.name = name;
	this.size = size;
	this.type = type;
	this.brand = brand;
    this.price=price;
	this.flavours =flavours;
	this.paymentType =paymentType;
	this.ratings = ratings;
	this.isGood = isGood;
	this.reviews=reviews;

	System.out.println("creating constructor with arrays");
}
public void display()
{
	System.out.println("name of the Pizza:"+name);
	System.out.println("size:"+size);
	System.out.println("type of the Pizza:"+type);
	System.out.println("Brand:"+brand);
	System.out.println("price:"+price);
	
	
	System.out.println("pizza flavours");
	for (int i = 0; i < this.flavours.length; i++)
	{
		String string = this.flavours[i];
		System.out.println(string);
		
	}
	
	System.out.println("pizza paymentType ");
	for (int i = 0; i < this.paymentType.length; i++) 
	{
		String string = this.paymentType[i];
		System.out.println(string);
		
	}
	System.out.println("pizza ratings ");
	
	for (int i = 0; i < this.ratings.length; i++)
	{
		double string = this.ratings[i];
		System.out.println(string);
	}
		System.out.println("pizza quality ");
		
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
		
	






