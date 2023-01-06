package com.xworkz.DemoMaven.spring.things;

import org.springframework.stereotype.Component;

@Component
public class Application {
	
	public Application() {
		System.out.println("Application object created by spring");
	}
}
