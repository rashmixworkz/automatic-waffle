package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.School;

public class SchoolRunner {

	public static void main(String[] args) 
	{
		
		String[] branches= {"kuknoor","raichur","gulbarga"};
		double[] ratings= {4.5,7,8,3.4};
		
		School school=new School("Vidya bharthi","kuknoor","Kannada medium",15,branches,ratings);
		

school.display();
	}

}