package com.xworkz.DemoMaven.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Temple {
	public Temple() {
		System.out.println("Temple instance is created using spring");
	}

}
