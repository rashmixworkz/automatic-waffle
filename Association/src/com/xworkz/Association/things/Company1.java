package com.xworkz.Association.things;

public class Company1
{
public String companyName;
public String ownerName;
public Address address=new Address();

public Company1(String companyName,String ownerName) 
{
	super();
	this.companyName =companyName;
	this.ownerName=ownerName;
}

public void showOff()
{
System.out.println(this.companyName);
System.out.println(this.ownerName);
this.address.showOff();
}
}
