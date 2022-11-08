package com.xworkz.AccesSpcifiers.things;

public class Hotel {
	public String name;
	private String hotalType;
	private double noOfServers;
	 String foodType="north indian";
	public double noOfCustomer;
	 int foodPrice=34;
	double Ratings=4.9;
	double totalNoOfFoods=23.5;
	 boolean isParcelFacility=false;
	 String Location="N.R.Colony";
	 
 public void setHotalType(String hotalType)
	 {
		 this.hotalType=hotalType;
		 
	 }
public String getHotalType()
{
	return hotalType;
}
public void setNoOfServers(double noOfServers)
{
	 this.noOfServers=noOfServers;
	 
}
public double getNoOfServers()
{
return noOfServers;
}
}
