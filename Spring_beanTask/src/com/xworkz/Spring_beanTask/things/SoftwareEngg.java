package com.xworkz.Spring_beanTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngg {
	
	
	
@Autowired
@Qualifier("Rashmi")
private	String name;
@Autowired
@Qualifier("enggSalary")
private double salary;
@Autowired
@Qualifier("capgemini")
private String compName;
@Autowired
@Qualifier("exp")
private int experience;

public SoftwareEngg() {
System.out.println("default cons SoftwareEngg");
}

@Override
public String toString() {
	return "SoftwareEngg [name=" + name + ", salary=" + salary + ", compName=" + compName + ", experience=" + experience
			+ "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getCompName() {
	return compName;
}

public void setCompName(String compName) {
	this.compName = compName;
}

public int getExperience() {
	return experience;
}

public void setExperience(int experience) {
	this.experience = experience;
}



}
