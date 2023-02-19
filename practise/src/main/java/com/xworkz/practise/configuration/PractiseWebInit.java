package com.xworkz.practise.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PractiseWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
System.out.println("Running getRootConfigClasses");		
return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
System.out.println("Running getServletConfigClasses");		
return new Class[] {PractiseConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
System.out.println("Running getServletMappings");		
return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling in webinit");
		configurer.enable();
	}

}
