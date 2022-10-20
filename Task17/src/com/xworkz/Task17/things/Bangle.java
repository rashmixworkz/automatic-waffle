package com.xworkz.Task17.things;

public class Bangle {
	public String shape ;
	public char size;
	public String type;
	public String brand;
	public double price;
	public String[] colors;
	public String[] paymentType;
	public String[] matirials;
	public boolean[] isGood;
	public String[] reviews;


public Bangle(String shape,char size,String type,String brand,double price,String[] colors,String[] paymentType,String[] matirials,
	 boolean[] isGood,String[] reviews)
{
	this.shape = shape;
	this.size = size;
	this.type = type;
	this.brand = brand;
    this.price=price;
	this.colors =colors;
	this.paymentType =paymentType;
	this.matirials = matirials;
	this.isGood = isGood;
	this.reviews=reviews;

	System.out.println("creating constructor with arrays");
}
public void display()
{
	System.out.println("name of the Pizza:"+shape);
	System.out.println("size:"+size);
	System.out.println("type of the Pizza:"+type);
	System.out.println("Brand:"+brand);
	System.out.println("price:"+price);
	
	
	System.out.println("bangle colors");
	for (int i = 0; i < this.colors.length; i++)
	{
		String string = this.colors[i];
		System.out.println(string);
		
	}
	
	System.out.println("bangle paymentType ");
	for (int i = 0; i < this.paymentType.length; i++) 
	{
		String string = this.paymentType[i];
		System.out.println(string);
		
	}
	System.out.println("Bangle matirials ");
	
	for (int i = 0; i < this.matirials.length; i++)
	{
		String string = this.matirials[i];
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
		
	









