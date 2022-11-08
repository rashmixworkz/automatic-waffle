package com.xworkz.Association.things;

public class State 
{
public String stateName;
public String StateCm;
public String stateCapital="Bnaglore";
public int noOfDistricts;

public State(String stateName, int noOfDistricts) 
{
	super();
	this.stateName = stateName;
	this.noOfDistricts = noOfDistricts;
}

public void setStateChifeMinister(String StateCm)
{
	this.StateCm=StateCm;
}
public void showOff()
{
	System.out.println(this.stateName);
	System.out.println(this.StateCm);
	System.out.println(this.stateCapital);
	System.out.println(this.noOfDistricts);
	
}
}
