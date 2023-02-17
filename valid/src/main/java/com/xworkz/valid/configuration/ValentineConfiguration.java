package com.xworkz.valid.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.valid")
public class ValentineConfiguration {
	
	public ValentineConfiguration() {
System.out.println("Default const of ValentineConfiguration ");
}
	
	@Bean
	public ViewResolver resolver() {
		System.out.println("Running ViewResolver");
		return new InternalResourceViewResolver("/",".jsp");

		
	}

}
