package com.xworkz.Spring_beanTask.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Spring_beanTask.configration.sessionSpringCon;
import com.xworkz.Spring_beanTask.things.Seassion;

public class SeassionRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext ref=new AnnotationConfigApplicationContext(sessionSpringCon.class);
		System.out.println(Arrays.toString(ref.getBeanDefinitionNames()));
		
		Seassion sea=	ref.getBean("seassion",Seassion.class);
		System.out.println(sea.getName());
		System.out.println(sea.getDuration());
System.out.println(sea.getStartingMonth());


Seassion sea1=ref.getBean("season",Seassion.class);

System.out.println(sea1.getName());
System.out.println(sea1.getDuration());
System.out.println(sea1.getStartingMonth());

	}

}
