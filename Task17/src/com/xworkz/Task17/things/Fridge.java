package com.xworkz.Task17.things;

public class Fridge
{
	public String name;
	public String manufacturedLocation;
	public String type;
	public int height;
	public String matirialUsed;
	public double width;
	public String[] colors;
	public String[] paymentType;
	public double[] ratings;
	public boolean[] isGood;
	public String[] reviews;


public Fridge(String name,String manufacturedLocation,String type,int height,String matirialUsed,double width,String[] colors,String[] paymentType,double[] ratings,
	 boolean[] isGood,String[] reviews)
{
	this.name = name;
	this.manufacturedLocation = manufacturedLocation;
	this.type = type;
	this.height = height;
    this.matirialUsed=matirialUsed;
    this.width =width;
	this.colors =colors;
	this.paymentType =paymentType;
	this.ratings = ratings;
	this.isGood = isGood;
	this.reviews=reviews;

	System.out.println("creating constructor with arrays");
}
public void display()
{
	System.out.println("name of the company:"+name);
	System.out.println("location of the company:"+manufacturedLocation);
	System.out.println("type of the company:"+type);
	System.out.println("Fridge height:"+height);
	System.out.println("  company employes:"+matirialUsed);
	System.out.println(" company:"+width);
	
	System.out.println("Fridge colors");
	for (int i = 0; i < this.colors.length; i++)
	{
		String string = this.colors[i];
		System.out.println(string);
		
	}
	
	System.out.println("Fridge paymentType ");
	for (int i = 0; i < this.paymentType.length; i++) 
	{
		String string = this.paymentType[i];
		System.out.println(string);
		
	}
	System.out.println("Fridge ratings ");
	
	for (int i = 0; i < this.ratings.length; i++)
	{
		double string = this.ratings[i];
		System.out.println(string);
	}
		System.out.println("Fridge quality ");
		
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
		
	


