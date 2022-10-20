package com.xworkz.Task17.things;

public class HeadPhone
{
	public String name;
	public String manufacturedLocation;
	public String type;
	public String brand;
	public double price;
	public String Capacity;
	public String[] colors;
	public String[] paymentType;
	public double[] ratings;
	public boolean[] isGood;
	public String[] reviews;


public HeadPhone(String name,String manufacturedLocation,String type,String brand,double price,String Capacity,String[] colors,String[] paymentType,double[] ratings,
	 boolean[] isGood,String[] reviews)
{
	this.name = name;
	this.manufacturedLocation = manufacturedLocation;
	this.type = type;
	this.brand = brand;
    this.price=price;
    this.Capacity =Capacity;
	this.colors =colors;
	this.paymentType =paymentType;
	this.ratings = ratings;
	this.isGood = isGood;
	this.reviews=reviews;

	System.out.println("creating constructor with arrays");
}
public void display()
{
	System.out.println("name of the HeadPhone:"+name);
	System.out.println("location:"+manufacturedLocation);
	System.out.println("type of the HeadPhone:"+type);
	System.out.println("Brand:"+brand);
	System.out.println("price:"+price);
	System.out.println("capacity:"+Capacity);
	
	System.out.println("HeadPhone colors");
	for (int i = 0; i < this.colors.length; i++)
	{
		String string = this.colors[i];
		System.out.println(string);
		
	}
	
	System.out.println("HeadPhone paymentType ");
	for (int i = 0; i < this.paymentType.length; i++) 
	{
		String string = this.paymentType[i];
		System.out.println(string);
		
	}
	System.out.println("HeadPhone ratings ");
	
	for (int i = 0; i < this.ratings.length; i++)
	{
		double string = this.ratings[i];
		System.out.println(string);
	}
		System.out.println("HeadPhone quality ");
		
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
		
	

