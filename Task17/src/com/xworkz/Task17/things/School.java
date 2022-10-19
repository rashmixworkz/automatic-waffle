package com.xworkz.Task17.things;

public class School 
{
	
	public String school;
	public String location;
	public String schoolType;
	public int noOfClasses;
	public String[] branches;
	public double[] ratings;
	
	public School(String school,String location,String schoolType,int noOfClasses,String[] branches,double[] ratings)
	{
		this.school=school;
		this.location=location;
		this.schoolType=schoolType;
		this.noOfClasses=noOfClasses;
		this.branches=branches;
		this.ratings=ratings;
	}
	public void display()
	{
		System.out.println("Name of the school:"+school);	

		System.out.println("Name of the school:"+location);

		System.out.println("Name of the school:"+schoolType);

		System.out.println("Name of the school:"+noOfClasses);

	for (int i = 0; i < this.branches.length; i++)
	{
		String string = this.branches[i];
		System.out.println(string);
	
	}
		
	for (int j = 0; j < this.ratings.length; j++)
	{
		double string = this.ratings[j];
		System.out.println(string);
	}
	}
	
	
	

}
