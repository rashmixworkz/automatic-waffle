package com.xworkz.AccesSpcifiers.things;

public class Counter {

	MetroStation station=new MetroStation();
	String clr=station.color;
	int sum=station.noOfDoors;
	int minus=station.ticketPrice;
	double time=station.Ratings;
	double total=station.totalNoOfDoors;
	String pay =station.paymentType;
	String door =station.stationLocation;
	
	public void display()
	{
		System.out.println(station.color);
		System.out.println(station.noOfDoors);
		System.out.println(station.ticketPrice);
		System.out.println(station.Ratings);
		System.out.println(station.totalNoOfDoors);
		System.out.println(station.paymentType);
		System.out.println(station.stationLocation);
		
	}
	
}
