package com.xworkz.equal.boot;

import com.xworkz.equal.things.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
	
		Institution institute=new Institution();
		institute.setName("XWORKZ");
		institute.setLocation("Rajajinagar");
		institute.setFees(22000);
		institute.setStudents(200);
		institute.setMainSubject("JAVA");
		institute.setState("Karnataka");
		institute.setDuration(5);
		institute.setType("software");
	    institute.setGood(true);
		institute.setLanguage("English");
		
		
		
	
		
		Institution	institute2=new Institution("Kodnest","BTM",25000,100,"JAVA","karnataka",3,"testing",false,"english");
		System.out.println(institute2);
		System.out.println(institute);
		
		boolean same=institute.equals(institute2);
		System.out.println(same);

	}

}
