package com.xworkz.practice.Configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PracticeWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	
	public PracticeWebInit() {
System.out.println("created" + getClass().getName());
	}
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
System.out.println("Running getRootConfigClasses");		
return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {PracticeConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
