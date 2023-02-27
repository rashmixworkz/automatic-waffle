package com.xworkz.makeUpItem.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.makeUpItem")
public class MakeUpItemConfiguration {

	public MakeUpItemConfiguration() {
		System.out.println("created" + getClass().getName());
	}

	@Bean
	public ViewResolver resolver() {
		System.out.println("Running ViewResolver in MakeUpItemConfiguration");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("Running LocalContainerEntityManagerFactoryBean in MakeUpItemConfiguration");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
