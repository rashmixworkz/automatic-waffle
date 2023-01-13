package com.xworkz.spring_autowiredTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistant {
	@Autowired
	private Company company;
	
	
	public Assistant() {
		System.out.println("default const of Assistant");
	}

}
