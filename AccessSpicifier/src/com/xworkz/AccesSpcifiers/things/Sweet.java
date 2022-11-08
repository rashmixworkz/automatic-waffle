package com.xworkz.AccesSpcifiers.things;

public class Sweet 
{
	private String sweetName;
	private String type;
	private double cost;
	public int manufatured_date;
	public double weight;
	public String color;
	double shopRatings=7.9;
	int warrentyperdays=3;
	public boolean isSugar;
	public String shopLocation;
	
	public void setSweetName(String sweetName)
	{
		this.sweetName=sweetName;
	}
	public String getSweetName()
	{
		return sweetName;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}

	public void setCost( double cost)
	{
		this.cost=cost;
	}
	public double getCost()
	{
		return cost;
	}


}
