package com.xworkz.spring_autowiredTask.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring_autowiredTask")
public class Configurations {
	
	
	public Configurations() {
		System.out.println("created Configurations using no args const");
	}
	
	

}
