package com.xworkz.Fi.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FiInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public FiInit() {
		System.out.println("running FiInit");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses method  in FiInit");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses in FiInit");
		Class[] cs = { FiConfiguration.class };
		return cs;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings in FiInit");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

		System.out.println("Running configureDefaultServletHandling method in FiInit");
		configurer.enable();
	}

}
