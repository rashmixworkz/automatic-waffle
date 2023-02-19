package com.xworkz.practise.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.practise")
public class PractiseConfiguration {

	public PractiseConfiguration() {
System.out.println("created" + getClass().getName());
	}
	@Bean
	public ViewResolver resolver() {
		System.out.println("Running ViewResolverin configuration ");
		return new InternalResourceViewResolver("/",".jsp");
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("Running containerEntityManagerFactoryBean in configuration ");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
