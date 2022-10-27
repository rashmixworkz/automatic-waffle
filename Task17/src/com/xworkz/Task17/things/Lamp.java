package com.xworkz.Task17.things;

public class Lamp 
{

	public String brand;
	public String lampName;
	public double price=80;
	public int warrenty;
	public static String color;
	
	public Lamp(String brand)
	{
		this.brand=brand;
	}
	public void SetlampName(String lampName)
	{
		this.lampName=lampName;
	}
	public void print()
	{
		System.out.println(this.brand);
		System.out.println(this.lampName);
		System.out.println(this.price);
		System.out.println(this.warrenty);
		System.out.println(this.color);
	}
	
	static {
		Lamp.color="orange";
	}
}
