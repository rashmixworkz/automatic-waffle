package com.xworkz.spring_autowiredTask.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring_autowiredTask.configuration.Configurations;
import com.xworkz.spring_autowiredTask.things.Movie;
import com.xworkz.spring_autowiredTask.things.PetrolBunk;
import com.xworkz.spring_autowiredTask.things.Shell;

import implementsClasses.Chrome;
import implementsClasses.FireBox;
import interfaceClasses.Browser;

public class Runner {

	public static void main(String[] args) {
	
		ApplicationContext ref=new AnnotationConfigApplicationContext(Configurations.class);
		
		System.out.println(Arrays.toString(ref.getBeanDefinitionNames()));
		
		
	
		
		
		
		
	}

}
