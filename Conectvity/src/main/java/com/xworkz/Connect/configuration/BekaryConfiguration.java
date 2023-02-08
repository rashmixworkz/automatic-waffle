package com.xworkz.Connect.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Connect")
public class BekaryConfiguration {

	public BekaryConfiguration() {
		System.out.println("Running Default const of BekaryConfiguration" + getClass().getSimpleName());
	}

}
