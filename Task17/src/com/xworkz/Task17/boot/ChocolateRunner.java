package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Chocolate milkybar=new Chocolate();
		System.out.println("name of the Chocolate is:"+milkybar.name);
		System.out.println("chocolate brand name is:"+milkybar.brand);
		System.out.println("price of the chocolate:"+milkybar.price);
		System.out.println("flavour of chocolate is:"+milkybar.flavour);
		milkybar.name="DiryMilk";
		milkybar.brand="Cadbary";
		milkybar.price=80;
		milkybar.flavour="Rosted Almond";
		System.out.println("name of the Chocolate is:"+milkybar.name);
		System.out.println("chocolate brand name is:"+milkybar.brand);
		System.out.println("price of the chocolate:"+milkybar.price);
		System.out.println("flavour of chocolate is:"+milkybar.flavour);

	}

}
