package com.xworkz.Fi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Fi")
public class FiConfiguration {
	
	public FiConfiguration() {
		System.out.println("Running default const of FiComponent"+getClass().getSimpleName());		
		}

}
