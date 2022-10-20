package com.xworkz.Task17.things;

public class Airport
{
	public String name;
	public String location;
	public int noOfAiroplanes;
	public double ticketPrice;
	public double passangerId;
	public String[] colors;
	public String[] paymentType;
	public String[] root;
	public boolean[] isGood;
	public String[] reviews;


public Airport(String name,String location,int noOfAiroplanes,double ticketPrice,double passengerId,String[] colors,String[] paymentType,String[] root,
	 boolean[] isGood,String[] reviews)
{
	this.name = name;
	this.location = location;
	this.noOfAiroplanes = noOfAiroplanes;
	this.ticketPrice = ticketPrice;
    this.passangerId=passangerId;
	this.colors =colors;
	this.paymentType =paymentType;
	this.root = root;
	this.isGood = isGood;
	this.reviews=reviews;

	System.out.println("creating constructor with arrays");
}
public void display()
{
	System.out.println("name of the airporrt:"+name);
	System.out.println("airport:"+location);
	System.out.println("type of the airport:"+noOfAiroplanes);
	System.out.println("Brand:"+ticketPrice);
	System.out.println("ID:"+passangerId);
	
	
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
	
	for (int i = 0; i < this.root.length; i++)
	{
		String string = this.root[i];
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
		
	











