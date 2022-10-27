package com.xworkz.Association.things;

public class God 
{
public String name;
public String gender;
public String mainPower;

public God(String name, String gender, String mainPower) {
	super();
	this.name = name;
	this.gender = gender;
	this.mainPower = mainPower;
}
public void showOff()
{
	System.out.println(this.name);
	System.out.println(this.gender);
	System.out.println(this.mainPower);
	
}

}
