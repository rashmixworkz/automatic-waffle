package com.xworkz.storeValve.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.storeValve")
public class StoreValueConfiguration {
	
	public StoreValueConfiguration() {
System.out.println("StoreValueConfiguration class");	
}
	@Bean
	public ViewResolver resolver() {
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("localContainerEntityManagerFactoryBean registerd");
		LocalContainerEntityManagerFactoryBean container=new LocalContainerEntityManagerFactoryBean();
		return container;
		
	}

}
