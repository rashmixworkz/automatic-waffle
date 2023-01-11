package com.xworkz.Spring_beanTask.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.Spring_beanTask.things.Seassion;

@Configuration
@ComponentScan
public class sessionSpringCon {
	@Bean
	public Seassion season() {
		System.out.println("registering season with spring");
		Seassion s=new Seassion();
		return s;
	}
	
	
	

}
