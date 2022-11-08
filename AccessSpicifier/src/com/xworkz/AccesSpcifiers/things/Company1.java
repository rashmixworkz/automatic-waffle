package com.xworkz.AccesSpcifiers.things;

public class Company1 {
	private String companyName;
	private String type;
	private double investment;
	public int noOfDesignations;
	public double noOfDevelopers;
	public String policy;
	double Ratings=4.9;
	boolean isTheirBond=true;
	public boolean isGood;
	public String companyLocation;
	
	public void setCompanyName(String companyName)
	{
		this.companyName=companyName;
	}
	public String getCompanyName()
	{
		return companyName;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}

	public void setInvestment( double investment)
	{
		this.investment=investment;
	}
	public double getInvestment()
	{
		return investment;
	}


}
