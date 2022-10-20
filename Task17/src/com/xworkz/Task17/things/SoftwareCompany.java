package com.xworkz.Task17.things;

public class SoftwareCompany 
{
	public String Companyname;
	public String location;
	public String type;
	public int noOfEmployes;
	public int noOfBuildings;
	public double areaSize;
	public String[] designations;
	public String[] branches;
	public double[] ratings;
	public boolean[] goodForWork;
	public String[] review;
	
	public SoftwareCompany(String Companyname, String location, String type, int noOfEmployes,int noOfBuildings,double areaSize,String[] designations,
			String[] branches, double[] ratings,  boolean[] goodForWork, String[] review)
	{
		this.Companyname = Companyname;
		this.location = location;
		this.type = type;
		this.noOfEmployes = noOfEmployes;
		this.noOfBuildings = noOfBuildings;
	    this.areaSize=areaSize;
	    this.designations =designations;
		this.branches =branches;
		this.ratings =ratings;
		this.goodForWork = goodForWork;
		this.review = review;

		System.out.println("creating constructor with arrays");
	}

	public void print()
	{
		System.out.println("name of the company:"+Companyname);
		System.out.println("location of the company:"+location);
		System.out.println("type of the company:"+type);
		System.out.println("  company employes:"+noOfEmployes);
		System.out.println(" company:"+noOfBuildings);
		System.out.println("company totalSize:"+areaSize);
		
		System.out.println("company designations");
		
		for (int i = 0; i < this.designations.length; i++) 
		{
			String string = this.designations[i];
			System.out.println(string);
			
		}
		System.out.println("company branches");
		
		for (int i = 0; i < this.branches.length; i++) 
		{
			String string = this.branches[i];
			System.out.println(string);
			
		}
		System.out.println("company ratings");
		
		for (int i = 0; i < this.ratings.length; i++) 
		{
			double string = this.ratings[i];
			System.out.println(string);
			
		}
		System.out.println("company nature for work ");
		
		for (int i = 0; i < this.goodForWork.length; i++) 
		{
			boolean string = this.goodForWork[i];
			System.out.println(string);
			
		}
		System.out.println("company reviews");
		
		for (int i = 0; i < this.review.length; i++) 
		{
			String string = this.review[i];
			System.out.println(string);
			
		}
	}
}
