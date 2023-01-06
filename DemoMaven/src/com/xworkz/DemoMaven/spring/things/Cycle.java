package com.xworkz.DemoMaven.spring.things;

import org.springframework.stereotype.Component;


@Component
public class Cycle {

	public Cycle() {
		System.out.println(" Cycle object created by spring");
	}
}
