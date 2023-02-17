package com.xworkz.valid.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ValentineWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
System.out.println("Running getRootConfigClasses");		
return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
System.out.println("Running getServletConfigClasses");		
return new Class[] {ValentineConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
System.out.println("Running getServletMappings");		
return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
		configurer.enable();
	}

}
