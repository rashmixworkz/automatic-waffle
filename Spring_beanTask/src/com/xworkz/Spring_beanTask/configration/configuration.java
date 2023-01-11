package com.xworkz.Spring_beanTask.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.Spring_beanTask.things.RocketUsingLitral;

@Configuration
@ComponentScan("com.xworkz.Spring_beanTask")

public class configuration {
	
	@Bean
	public RocketUsingLitral rocket() {
		System.out.println("Registering RocketUsingLitral with span");
		RocketUsingLitral litral=new RocketUsingLitral();	
		return litral;
		
	}
	
	
	
	

}
