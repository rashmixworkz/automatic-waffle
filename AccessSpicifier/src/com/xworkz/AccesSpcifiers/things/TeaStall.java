package com.xworkz.AccesSpcifiers.things;

public class TeaStall 
{
 private String name;
 private String location;
 private String ownerName;
 private int noOfContainers;
 int noOfCustomers=100;
 String paymentType="cash";
 double ratings=4.5;
 public String reviews;
 String typesoftea="shunti tea";
 public String brandOfTea;
 public int amountOfOneTea;
  
  
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
  public void setnoOfContainers(int noOfContainers)
  {
	  this.noOfContainers=noOfContainers;
	 
  }
  
  public int getnoOfContainers()
  {
	  return noOfContainers;
  }
  
  
}
