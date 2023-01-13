package com.xworkz.spring_autowiredTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Location location;
	
	public Company() {
		System.out.println("default cons of Company");
	}

}
