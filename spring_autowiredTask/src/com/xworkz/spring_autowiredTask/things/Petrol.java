package com.xworkz.spring_autowiredTask.things;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {

	@Override
	public void consume() {
System.out.println("overriding consume method in petrol class");		
	}

}
