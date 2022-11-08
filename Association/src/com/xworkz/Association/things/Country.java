package com.xworkz.Association.things;

public class Country 
{
public String name;
public int countryCode;
public String countryFruit;
public String currency;

public Country(String name, int countryCode, String countryFruit, String currency)
{
	super();
	this.name = name;
	this.countryCode = countryCode;
	this.countryFruit = countryFruit;
	this.currency = currency;
}

public void showOff()
{
	System.out.println("NAME IS :"+this.name);
	System.out.println(this.countryCode);
	System.out.println(this.countryFruit);
	System.out.println(this.currency);
	System.out.println(System.lineSeparator());
}


}
