package com.xworkz.springWeb.configuration;

import java.util.Arrays;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
	
	public SpringWebInit() {
System.out.println("default const of webinit");
}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses in webinit ");
		return null;
	}

	

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings in webinit");
	String[] ref=	{"/"};
	System.out.println("getServletMappings"+Arrays.toString(ref));
	return ref;
	}



	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses in web init ");
		Class[] config= {SpringBeanConfiguration.class};
		System.out.println("config class"+Arrays.toString(config));
		return config;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling in webinit");
		configurer.enable();
	}
	
	

	}
	


