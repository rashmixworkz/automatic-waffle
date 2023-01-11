package com.xworkz.Spring_beanTask.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.Spring_beanTask.things.ActorUsingCons;

@Configuration
@ComponentScan("com.xworkz.Spring_beanTask")

public class ActorUsingConsConfiguration {
	
	@Bean
	public ActorUsingCons actor() {
		System.out.println("registering actor with spring");
		ActorUsingCons co=new ActorUsingCons("Darshan", "Kannada", 43);
		return co;
		
	}
	

}
