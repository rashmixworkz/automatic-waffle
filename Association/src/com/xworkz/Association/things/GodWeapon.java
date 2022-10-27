package com.xworkz.Association.things;

public class GodWeapon {
	public String name;
	public String use;
	public double weight;
	
	public GodWeapon(String name, String use, double weight) 
	{
		super();
		this.name = name;
		this.use = use;
		this.weight = weight;
		
	}
	public void showOff()
	{
		System.out.println(this.name);
		System.out.println(this.use);
		System.out.println(this.weight);
	}
}
