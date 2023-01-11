package com.xworkz.Spring_beanTask.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Spring_beanTask.configration.configuration;
import com.xworkz.Spring_beanTask.things.RocketUsingLitral;

public class RocketUsingLitralRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(configuration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		RocketUsingLitral ref = container.getBean("rocketUsingLitral",RocketUsingLitral.class);
		System.out.println(ref);
		System.out.println(ref.getCountry());
		System.out.println(ref.getName());
		System.out.println(ref.getBudget());
		
		RocketUsingLitral rocketUsingLitral	=container.getBean("rocket",RocketUsingLitral.class);
		System.out.println(rocketUsingLitral);
		
		System.out.println(rocketUsingLitral.getCountry());
		System.out.println(rocketUsingLitral.getName());
		System.out.println(rocketUsingLitral.getBudget());
		
	}

}
