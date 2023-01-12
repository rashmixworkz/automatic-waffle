package com.xworkz.Spring_beanTask.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Spring_beanTask.configration.SpringConfigurationUsingAutowired;
import com.xworkz.Spring_beanTask.things.EngineUsingAutowired;
import com.xworkz.Spring_beanTask.things.GhostUsingAutowired;
import com.xworkz.Spring_beanTask.things.NewsPaperUsingAutowired;
import com.xworkz.Spring_beanTask.things.SneakeUsingAutoWired;

public class AutowiredRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfigurationUsingAutowired.class);

		String[] beanNames = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));

		System.out.println("no of beans:" + container.getBeanDefinitionCount());

		NewsPaperUsingAutowired autowired = container.getBean(NewsPaperUsingAutowired.class);
		System.out.println(autowired);

		EngineUsingAutowired engine = container.getBean(EngineUsingAutowired.class);
		System.out.println(engine);

		GhostUsingAutowired auto = container.getBean(GhostUsingAutowired.class);
		System.out.println(auto);

		SneakeUsingAutoWired wired = container.getBean(SneakeUsingAutoWired.class);
		System.out.println(wired);
	}

}
