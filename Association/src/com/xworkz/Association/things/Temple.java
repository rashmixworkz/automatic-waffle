package com.xworkz.Association.things;

public class Temple 
{
public String name;
public int noofvistors;
public double collectionPerDay;

public Temple(String name, int noofvistors, double collectionPerDay) {
	super();
	this.name = name;
	this.noofvistors = noofvistors;
	this.collectionPerDay = collectionPerDay;
}
public void showOff()
{
	System.out.println(this.name);
	System.out.println(this.noofvistors);
	System.out.println(this.collectionPerDay);
	
}



}
