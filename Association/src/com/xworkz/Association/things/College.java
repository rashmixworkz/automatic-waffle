package com.xworkz.Association.things;

public class College {
	
	public String name;
	public String location;
	public int noOfStudents;
	
	
	public College(int noOfStudents, String name, String location) {
		this.noOfStudents=noOfStudents;
		this.name=name;
		this.location=location;
	}

	
	
	public void showoff() {
		System.out.println(this.location);
		System.out.println(this.name);
		System.out.println(this.noOfStudents);
	}

}
