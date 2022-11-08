package com.xworkz.AccesSpcifiers.things;

public class School {
	private String schoolName;
	private String type;
	private double investment;
	 int noOfteachers=56;
	public double noOfStudents;
	public String policy;
	double Ratings=4.9;
	double fees=20000;
	 boolean isGood=true;
	 String schoolLocation="N.R.Colony";
	
	public void setSchoolName(String schoolName)
	{
		this.schoolName=schoolName;
	}
	public String getSchoolName()
	{
		return schoolName;
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
