package com.xworkz.DemoMaven.spring.things;

import org.springframework.stereotype.Component;

@Component
public class City {
	
	public City() {
		System.out.println("City object created by spring");
	}
}
