package com.xworkz.spring_autowiredTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
private	Producer producer;
	
	public Director() {
System.out.println("default cons of Director");
	}
}
