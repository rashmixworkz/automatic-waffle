package com.xworkz.Spring_beanTask.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RocketUsingLitral {

	@Value("india")

	private String country;
	
	@Value("120567.99963")
	private double budget;
	
	@Value("Aryabhata")
	private String name;

	public RocketUsingLitral() {
		System.out.println("default const");
	}

	public String getCountry() {

		return country;
	}

	public double getBudget() {

		return budget;
	}

	public String getName() {
		return name;
	}
}
