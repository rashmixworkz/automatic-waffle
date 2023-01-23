package com.xworkz.spring_autowiredTask.things;

import org.springframework.stereotype.Component;

@Component
public class Disel implements Fuel {

	@Override
	public void consume() {
System.out.println("overriding consume method in disel class");		
	}
	
	

}
