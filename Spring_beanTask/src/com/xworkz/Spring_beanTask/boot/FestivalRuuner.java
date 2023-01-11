package com.xworkz.Spring_beanTask.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Spring_beanTask.configration.SpringConfigration;
import com.xworkz.Spring_beanTask.things.Festival;

public class FestivalRuuner {

	public static void main(String[] args) {

		ApplicationContext ref = new AnnotationConfigApplicationContext(SpringConfigration.class);

		Festival fes = ref.getBean(Festival.class);
		System.out.println(fes);

		String[] beanNames = ref.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));

		String refOfString = ref.getBean("rashmi", String.class);
		System.out.println(refOfString.hashCode());

		String refOfString1 = ref.getBean("Vaishanai", String.class);
		System.out.println(refOfString1.hashCode());

		String refOfString2 = ref.getBean("nandini", String.class);
		System.out.println(refOfString2.hashCode());

		String refOfString3 = ref.getBean("shweta", String.class);
		System.out.println(refOfString3.hashCode());

		String refOfString4 = ref.getBean("vijaylaxmi", String.class);
		System.out.println(refOfString4.hashCode());

		Float flt = ref.getBean("circle", Float.class);
		System.out.println(flt);

		Float flt1 = ref.getBean("square", Float.class);
		System.out.println(flt);

		Float flt2 = ref.getBean("rectangle", Float.class);
		System.out.println(flt);

		Float flt3 = ref.getBean("pentgon", Float.class);
		System.out.println(flt);

		Float flt4 = ref.getBean("triangle", Float.class);
		System.out.println(flt);

		Boolean bool = ref.getBean("fridge",Boolean.class);
		System.out.println(bool);

		Boolean bean = ref.getBean("mixie",Boolean.class);
		System.out.println(bean);

		Boolean bean2 = ref.getBean("washingMachine",Boolean.class);
		System.out.println(bean2);

		Boolean bean3 = ref.getBean("oven",Boolean.class);
		System.out.println(bean3);

		Boolean bean6 = ref.getBean("fan",Boolean.class);
		System.out.println(bean6);
		
		
		
		
	
	}

}
