package com.xworkz.Association.boot;

import com.xworkz.Association.things.Fuel;

public class FuelRunner {

	public static void main(String[] args) 
	{
		
Fuel fuel=new Fuel(true,"LPG",101,6);
 fuel.showOff();
 fuel.displayTotalPrice();
 fuel.seal.showOff();
 fuel.place.showOff();

	}

}