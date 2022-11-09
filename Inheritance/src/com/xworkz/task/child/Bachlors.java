package com.xworkz.task.child;

import com.xworkz.task.things.BachlorParty;

public class Bachlors extends BachlorParty{

	public Bachlors(String place, int noOfMembers, boolean isEnjoyed) 
	{
		super(place, noOfMembers, isEnjoyed);
	
	}
	
	BachlorParty bachlor=new Bachlors("Flavours of Heven", 30, true);

}
