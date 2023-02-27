package com.xworkz.makeUpItem.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MakeUpItemWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	public MakeUpItemWebInit() {
		System.out.println("created" + getClass().getName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses in MakeUpItemWebInit");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses in MakeUpItemWebInit");
		return new Class[] { MakeUpItemConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings in MakeUpItemWebInit");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling in configureDefaultServletHandling");
		configurer.enable();
	}

}
