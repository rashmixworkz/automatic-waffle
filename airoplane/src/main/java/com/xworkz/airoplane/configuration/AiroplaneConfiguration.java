package com.xworkz.airoplane.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.airoplane")
public class AiroplaneConfiguration {

	public AiroplaneConfiguration() {
		System.out.println("created" + getClass().getName());
	}

	@Bean
	public ViewResolver resolver() {
		System.out.println("Running view resolver in AiroplaneConfiguration");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Registering localContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();

	}

}
