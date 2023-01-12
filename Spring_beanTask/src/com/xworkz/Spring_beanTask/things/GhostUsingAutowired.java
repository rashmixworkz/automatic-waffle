package com.xworkz.Spring_beanTask.things;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GhostUsingAutowired {
	
	
	
	private String name;
	private String gender;
	private String color;
	private int hairLength;
	private int nailLength;
	private int age;
	private double weight;
	private double height ;
	private int siblings;
	private int cousines;
	private String fatherName;
	private String motherName;
	private String brotherName;
	private String sisterName;
	private LocalDate DateOfBirth;
	private LocalDate DateOfDeath;
	private String education;
	private String branch;
	private String reasonForDeath;
	private String language;
	
	public GhostUsingAutowired() {
		System.out.println("default const of GhostUsingAutowired");
	}

	public GhostUsingAutowired(@Qualifier("GhostName") String name,@Qualifier("gender")  String gender,@Qualifier("colorOfGhost")  String color,@Qualifier("hair")       int hairLength,@Qualifier("nail")     int nailLength,@Qualifier("ageOfGhost")    int age,
			@Qualifier("ghostWeight") 	double weight,@Qualifier("ghostHeight")  double height,@Qualifier("sibling")  int siblings, @Qualifier("cousine")  int cousines, @Qualifier("father") String fatherName, @Qualifier("mother")  String motherName,
			@Qualifier("brother")  String brotherName, @Qualifier("sister")  String sisterName,@Qualifier("birth")  LocalDate dateOfBirth,@Qualifier("death")  LocalDate dateOfDeath, @Qualifier("study") String education,
			@Qualifier("branchOfGhost") String branch,@Qualifier("reason")  String reasonForDeath,@Qualifier("lang")  String language) {
		super();
		this.name = name;
		this.gender = gender;
		this.color = color;
		this.hairLength = hairLength;
		this.nailLength = nailLength;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.siblings = siblings;
		this.cousines = cousines;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.brotherName = brotherName;
		this.sisterName = sisterName;
		DateOfBirth = dateOfBirth;
		DateOfDeath = dateOfDeath;
		this.education = education;
		this.branch = branch;
		this.reasonForDeath = reasonForDeath;
		this.language = language;
	}

	@Override
	public String toString() {
		return "GhostUsingAutowired [name=" + name + ", gender=" + gender + ", color=" + color + ", hairLength="
				+ hairLength + ", nailLength=" + nailLength + ", age=" + age + ", weight=" + weight + ", height="
				+ height + ", siblings=" + siblings + ", cousines=" + cousines + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", brotherName=" + brotherName + ", sisterName=" + sisterName
				+ ", DateOfBirth=" + DateOfBirth + ", DateOfDeath=" + DateOfDeath + ", education=" + education
				+ ", branch=" + branch + ", reasonForDeath=" + reasonForDeath + ", language=" + language
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
