package com.xworkz.Association.things;

public class City 
{
public int noOfAreas;
public String cityName;
public boolean havingMetro=true;
public double population;


public City(int noOfAreas, String cityName)
{
	super();
	this.noOfAreas = noOfAreas;
	this.cityName = cityName;
}
public void setPopulation(double population)
{
	this.population=population;
}

public void showOff()
{
	System.out.println(this.noOfAreas);
	System.out.println(this.cityName);
	System.out.println(this.havingMetro);
	System.out.println(this.population);
}
}
