package com.xworkz.Association.things;

public class Piller
{
public int id;
public String place;
public String shape;
public double height;
public boolean supporting;
public Company name=new Company("TPM Company","Doric");

public Piller(int id, String place, String shape, double height, boolean supporting)
{
	super();
	this.id = id;
	this.place = place;
	this.shape = shape;
	this.height = height;
	this.supporting = supporting;
}

public void showOff()
{
	System.out.println(this.id);
	System.out.println(this.place);
	System.out.println(this.height);
	System.out.println(this.supporting);

	
}

}
