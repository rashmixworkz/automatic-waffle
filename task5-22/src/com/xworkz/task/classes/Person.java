package com.xworkz.task.classes;

public abstract class Person {
	
	private String name;
	private  int age;
	private String color;
	private String nativePlace;
	private String workingCompany;
	private double salary;
	
	abstract boolean eat();
	abstract boolean sleep();
	
	public Person(String name, int age, String color, String nativePlace, String workingCompany, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.nativePlace = nativePlace;
		this.workingCompany = workingCompany;
		this.salary = salary;
		System.out.println("Running parameterised constructors");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getWorkingCompany() {
		return workingCompany;
	}
	public void setWorkingCompany(String workingCompany) {
		this.workingCompany = workingCompany;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
