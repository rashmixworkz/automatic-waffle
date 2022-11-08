package com.xworkz.AccesSpcifiers.boot;


import com.xworkz.AccesSpcifiers.things.School;
import com.xworkz.AccesSpcifiers.things.Student;

public class SchoolRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student();
		stud.dispaly();

		School clg = new School();
		clg. setSchoolName("Infosys");
		System.out.println(clg.getSchoolName());
		
		clg.setType("Rajajinagar");
		System.out.println(clg.getType());

		clg.setInvestment(70.3);
		System.out.println(clg.getInvestment());

		clg.noOfStudents=12;
		System.out.println(clg.noOfStudents);

		clg.policy ="Displine";

		System.out.println(clg.policy);
		clg.policy = "should not disclose company name";

		System.out.println(clg.policy);

		
		



	}

}
