package com.xworkz.spring_autowiredTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	@Autowired
	private Skill skill;
	
	public Experience() {
	System.out.println("default const of Experience");
	}
}
