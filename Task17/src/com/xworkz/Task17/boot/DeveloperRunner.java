package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Developer;

public class DeveloperRunner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		    Developer code=new Developer();
			System.out.println("Company name is:"+code.name);
			System.out.println("developer education is:"+code.education);
			System.out.println("experience in job:"+code.experience);
			System.out.println("salary per annam:"+code.salary);
			System.out.println("company name:"+code.company);
			code.name="RASHMI";
			code.education="B.E(ECE)";
			code.experience=1;
			code.salary=3.6d;
			code.company="Capgemini";
			System.out.println("Company name is:"+code.name);
			System.out.println("developer education is:"+code.education);
			System.out.println("experience in job:"+code.experience);
			System.out.println("salary per annam:"+code.salary);
			System.out.println("company name:"+code.company);

	}

}
