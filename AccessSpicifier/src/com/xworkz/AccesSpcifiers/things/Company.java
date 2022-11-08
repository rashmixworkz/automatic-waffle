package com.xworkz.AccesSpcifiers.things;

public class Company 
{
	private String name;
	 private String location;
	 private String ownerName;
	 private int noOfEmployes;
	 int noOfClients=60;
	 String paymentType="cash";
	 double ratings=4.5;
	 public String reviews;
	 boolean isGood=true;
	 public String type;
	 public int noOfBuildgs;
	  
	  
	  public void setName(String name)
	  {
		  this.name=name;
		 
	  }
	  
	  public String getName()
	  {
		  return name;
	  }
	  public void setLocation(String location)
	  {
		  this.location=location;
	  }
	  public String getLocation()
	  {
		  return location;
	  }
	  public void setownerName(String ownerName)
	  {
		  this.ownerName=ownerName;
		 
	  }
	  
	  public String getownerName()
	  {
		  return ownerName;
	  }
	  public void setnoOfEmployes(int noOfEmployes)
	  {
		  this.noOfEmployes=noOfEmployes;
		 
	  }
	  
	  public int getnoOfEmployes()
	  {
		  return noOfEmployes;
	  }
	  
	  
}
