package com.xworkz.DemoMaven.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.DemoMaven.spring.configuration.Springconfiguration;
import com.xworkz.DemoMaven.spring.things.Application;
import com.xworkz.DemoMaven.spring.things.Area;
import com.xworkz.DemoMaven.spring.things.Bus;
import com.xworkz.DemoMaven.spring.things.Chocolate;
import com.xworkz.DemoMaven.spring.things.City;
import com.xworkz.DemoMaven.spring.things.Cycle;
import com.xworkz.DemoMaven.spring.things.Fish;
import com.xworkz.DemoMaven.spring.things.Girl;
import com.xworkz.DemoMaven.spring.things.God;
import com.xworkz.DemoMaven.spring.things.Mall;
import com.xworkz.DemoMaven.spring.things.Mask;
import com.xworkz.DemoMaven.spring.things.Milk;
import com.xworkz.DemoMaven.spring.things.Park;
import com.xworkz.DemoMaven.spring.things.Patient;
import com.xworkz.DemoMaven.spring.things.Road;
import com.xworkz.DemoMaven.spring.things.Temple;

public class Ruuner {

	public static void main(String[] args) {
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(Springconfiguration.class);
		
	  Road ref=	spring.getBean(Road.class);
      System.out.println(ref);
      
      Cycle ref1=spring.getBean(Cycle.class);
      System.out.println(ref1);
      
      Bus bus=spring.getBean(Bus.class);
      System.out.println(bus);
      
      Girl girl=spring.getBean(Girl.class);
      System.out.println(girl);
      
      Mask mask=spring.getBean(Mask.class);
      System.out.println(mask);
      
      Area area=spring.getBean(Area.class);
      System.out.println(area);
      
      God god=spring.getBean(God.class);
      System.out.println(god);
      
      City city=spring.getBean(City.class);
      System.out.println(city);
      
      Fish fish=spring.getBean(Fish.class);
      System.out.println(fish);
      
      Chocolate cho=spring.getBean(Chocolate.class);
      System.out.println(cho);
      
      Mall mall=spring.getBean(Mall.class);
      System.out.println(mall);
      
      Milk milk=spring.getBean(Milk.class);
      System.out.println(milk);
      
      Park park=spring.getBean(Park.class);
      System.out.println(park);
      
      Temple temp=spring.getBean(Temple.class);
      System.out.println(temp);
      
      Patient patient=spring.getBean(Patient.class);
      System.out.println(patient);
      
      Application app=spring.getBean(Application.class);
      System.out.println(app);


      
      
	}

}
