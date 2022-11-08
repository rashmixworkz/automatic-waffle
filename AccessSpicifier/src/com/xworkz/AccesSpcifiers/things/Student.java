package com.xworkz.AccesSpcifiers.things;

public class Student {
	School school=new School();
	int teachers=school.noOfteachers;
	double rate=school.Ratings;
	double fee=school.fees;
	 boolean good=school.isGood;
	 String location=school.schoolLocation;
	 public void dispaly()
	 {
		 System.out.println(teachers);
		 System.out.println(rate);
		 System.out.println(fee);
		 System.out.println(good);
		 System.out.println(location);
		 
	 }

}
