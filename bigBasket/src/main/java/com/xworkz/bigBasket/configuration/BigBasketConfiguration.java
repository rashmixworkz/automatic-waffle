package com.xworkz.bigBasket.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bigBasket")
public class BigBasketConfiguration {
	
	
	public BigBasketConfiguration() {
System.out.println("created" + getClass().getName());
}
	@Bean
	public ViewResolver resolver() {
		System.out.println("Running ViewResolver");
		return new InternalResourceViewResolver("/",".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean bean() {
		System.out.println("Running LocalContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}
	
}
