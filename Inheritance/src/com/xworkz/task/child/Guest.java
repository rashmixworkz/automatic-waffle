package com.xworkz.task.child;

import com.xworkz.task.things.InvitationCard;

public class Guest extends InvitationCard{

	public Guest(String type, int costPerCard, String color)
	{
		super(type, costPerCard, color);

	}
	
	InvitationCard invitation=new Guest("Digital",0,"pink");
	

}
