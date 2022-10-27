package com.xworkz.Task17.things;

public class Flower 
{
public String name="Jasmin";
public double price;
public String color;
public boolean aroma;
public static String family;

public Flower(String color)
{
	this.color=color;
}

public void Setprice(double price)
{
	this.price=price;
}

public void disply()
{
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.color);
	System.out.println(this.aroma);
	System.out.println(family);
	
	
}
static
{
	Flower.family="oleaceae";
}




}
