package com.xworkz.Association.things;

public class Mountain 
{
public String name;
public MountainLocation point=new MountainLocation("mahamaya temple","kuknoor","karnataka","india",583232);
public Temple peace=new Temple("Mahamaya temple",1000,10000);
public God divine=new God("Mahalaxmi","female","Transform dreams into reality");
public GodWeapon billu=new GodWeapon("Trishula","Slaying Demons",2345.75);

public Mountain(String name) 
{
	super();
	this.name = name;
}
public void showOff()
{
	System.out.println(this.name);
}


}
