package com.xworkz.task.child;

import com.xworkz.task.things.Catering;

public class FoodStall extends Catering {

	public FoodStall(String type, int costPerHead, String dishType)
	{
		super(type, costPerHead, dishType);

	}
	Catering catering=new FoodStall("contract",120,"north indian");
	
	
	

}
