package com.xworkz.Association.things;

public class Job {
	public double salary;
	public String role;
	public int bond;
	public Company1 company = new Company1("Capgemini", "RASHMI");
	
	public Job(double salary, String role, int bond) 
	{
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
	public void showOff()
	{
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		this.company.showOff();
	}
	
	
}
