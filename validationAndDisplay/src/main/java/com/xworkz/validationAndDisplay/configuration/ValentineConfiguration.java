package com.xworkz.validationAndDisplay.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.validationAndDisplay")
public class ValentineConfiguration {

	public ValentineConfiguration() {
		System.out.println("created" + getClass().getName());
	}
	@Bean
	public ViewResolver resolver() {
		return new InternalResourceViewResolver("/",".jsp");
	}

	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Registering localContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
		
	}
	
}
