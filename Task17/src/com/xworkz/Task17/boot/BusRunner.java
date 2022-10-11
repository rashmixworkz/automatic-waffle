package com.xworkz.Task17.boot;

import com.xworkz.Task17.Bus;

public class BusRunner
{

	public static void main(String[] args) 
	{
		
	
	Bus ref=new Bus();
	System.out.println("Bus number:"+ref.busNumber);
	System.out.println("Starting place is:"+ref.startingPoint);
	System.out.println("Destination place is:"+ref.destination);
	ref.busNumber=2437;
	ref.startingPoint="Banglore";
	ref.destination="koppal";
	System.out.println("Bus number:"+ref.busNumber);
	System.out.println("Starting place is:"+ref.startingPoint);
	System.out.println("Destination place is:"+ref.destination);
	
	}

}
