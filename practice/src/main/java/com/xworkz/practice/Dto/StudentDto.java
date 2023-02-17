package com.xworkz.practice.Dto;

import com.sun.istack.NotNull;

public class StudentDto {
	@NotBlank
	private int id;
	private String name;
	private int rollNo;
	private String favSubject;
	private String percentage;
	private int age;
	
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", favSubject=" + favSubject
				+ ", percentage=" + percentage + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFavSubject() {
		return favSubject;
	}

	public void setFavSubject(String favSubject) {
		this.favSubject = favSubject;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
