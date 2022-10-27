package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Flower;

public class FlowerRunner {

	public static void main(String[] args)
	{
		
		Flower flower=new Flower("White");
		flower.price=123;
		flower.aroma=true;
	    flower.disply();

	}

}
