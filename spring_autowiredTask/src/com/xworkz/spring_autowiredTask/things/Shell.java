package com.xworkz.spring_autowiredTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk{
@Autowired
@Qualifier("disel")
private Fuel fuel;
	
	
	@Override
	public void purchase() {
		System.out.println("overriding purchase method in shell class");
		fuel.consume();
	}

}
