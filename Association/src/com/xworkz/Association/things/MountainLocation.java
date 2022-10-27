package com.xworkz.Association.things;

public class MountainLocation {
	public String street;
	public String city;
	public String state;
	public String country;
	public int  pincode;

	public MountainLocation(String street, String city, String state, String country, int pincode)
	{
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public void showOff()
	{
		System.out.println(	this.street);
		System.out.println(	this.city);
		System.out.println(	this.state);
		System.out.println(	this.country);
		System.out.println(	this.pincode);
	}

}
