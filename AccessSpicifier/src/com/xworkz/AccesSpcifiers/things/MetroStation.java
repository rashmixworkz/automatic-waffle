package com.xworkz.AccesSpcifiers.things;

public class MetroStation {
	public String stationName;
	private String viaRoot;
	private double noOfEmployes;
	String color = "Purple";
	int noOfDoors;
	int ticketPrice = 34;
	double Ratings = 4.9;
	double totalNoOfDoors = 23.5;
	String paymentType = "online";
	String stationLocation = "NationalCollege";
	
	public void setViaRoot(String viaRoot)
	{
	this. viaRoot= viaRoot;
	}
	public String getViaRoot()
	{
		return viaRoot;
	}
	public void setNoOfEmployes(double noOfEmployes)
	{
	this.noOfEmployes= noOfEmployes;
	}
	public double getNoOfEmployes()
	{
		return noOfEmployes;
	}

}
