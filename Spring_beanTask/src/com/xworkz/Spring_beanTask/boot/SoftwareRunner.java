package com.xworkz.Spring_beanTask.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Spring_beanTask.configration.SpringConfigration;
import com.xworkz.Spring_beanTask.things.HardwareShop;
import com.xworkz.Spring_beanTask.things.Pencil;
import com.xworkz.Spring_beanTask.things.Rubber;
import com.xworkz.Spring_beanTask.things.Software;
import com.xworkz.Spring_beanTask.things.SoftwareEngg;

public class SoftwareRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext refs=new AnnotationConfigApplicationContext(SpringConfigration.class);
		String[] beanNames=refs.getBeanDefinitionNames();
		System.out.println( Arrays.toString(beanNames));
		
		
		Software refOfSoftware=refs.getBean(Software.class);
		System.out.println(refOfSoftware);
		
		
		Pencil pen=refs.getBean(Pencil.class);
		System.out.println(pen);
		
		Rubber rubber=refs.getBean(Rubber.class);
		System.out.println(rubber);
		
		SoftwareEngg engg=refs.getBean(SoftwareEngg.class);
		System.out.println(engg);
		
		
		HardwareShop shop=	refs.getBean(HardwareShop.class);
		System.out.println(shop);

	}

}
