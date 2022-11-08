package com.xworkz.AccesSpcifiers.things;

public class Tv 
{
private String name;
private String brand;
private double price;
public int height;
public double weight;
public String color;
double ratings=2.4;
int warrenty=3;
public int resolition;
public int noOfChannels;

public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setBrand(String brand)
{
	this.brand=brand;
}
public String getBrand()
{
	return brand;
}
public void setPrice(double price)
{
	this.price=price;
}
public double getPrice()
{
	return price;
}
}
