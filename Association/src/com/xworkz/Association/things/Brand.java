package com.xworkz.Association.things;

public class Brand {
	
	public String name;
	public int gstNo;
	
	
	public Brand(String name, int gstNo) 
	{
		super();
		this.name = name;
		this.gstNo = gstNo;
	}
	
	public void showOff()
	{
		System.out.println(this.name);
		System.out.println(this.gstNo);
	}
	 

}
