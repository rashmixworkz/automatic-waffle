package com.xworkz.Association.things;

public class Person 
{
public String name;
public Email[] emails;
public Job job=new Job(3500.0,"software developer",3);

public Person(String name)
{
	super();
	this.name = name;
}
 
public void setEmail(Email[] emails)
{
	this.emails=emails;
	
}
public void showOff()
{
	System.out.println(this.name);
	if(this.emails!=null)
	{
		for (int i = 0; i < this.emails.length; i++) 
		{
			Email email=this.emails[i];
			if(emails!=null)
			{
				email.showOff();
			}
		}
	}
}



}
