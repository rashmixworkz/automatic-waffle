package com.xworkz.task.child;

import com.xworkz.task.things.Dj;

public class Dance extends Dj {

	public Dance(int duration, String type, double price) 
	{
		super(duration, type, price);
	
	}
	
	Dj dance=new Dance(3,"mobile DJ's",30000);
}
