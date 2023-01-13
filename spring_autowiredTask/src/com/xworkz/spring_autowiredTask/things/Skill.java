package com.xworkz.spring_autowiredTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Skill {
	
	public Skill() {
	System.out.println("default const of Skill");
	}

}
