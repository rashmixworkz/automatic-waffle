package com.xworkz.Spring_beanTask.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Spring_beanTask.configration.ActorUsingConsConfiguration;
import com.xworkz.Spring_beanTask.things.ActorUsingCons;

public class ActorUsingConsRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ActorUsingConsConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		ActorUsingCons cons = context.getBean("actorUsingCons",ActorUsingCons.class);
		System.out.println(cons);

		System.out.println(cons.getName());
		System.out.println(cons.getLanguage());
		System.out.println(cons.getAge());

		ActorUsingCons co1=context.getBean("actor",ActorUsingCons.class);
		System.out.println(co1);
		
	System.out.println(co1.getAge());
		System.out.println(co1.getLanguage());
		System.out.println(co1.getName());
	}

}
