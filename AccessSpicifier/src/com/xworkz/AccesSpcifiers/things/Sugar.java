package com.xworkz.AccesSpcifiers.things;

public class Sugar {
	Sweet sweet= new Sweet();
	
	double rateing=sweet.shopRatings;
	int warrenty=sweet.warrentyperdays;
	
	public void display()
	{
		
	
		System.out.println(sweet.shopRatings);
		System.out.println(sweet.warrentyperdays);
	
		
	}

}
