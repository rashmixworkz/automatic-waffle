package com.xworkz.Spring_beanTask.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.Spring_beanTask.things.RocketUsingLitral;

@Configuration
@ComponentScan("com.xworkz.Spring_beanTask")

public class SpringConfigration {
	
	
	@Bean("rashmi")
	public String rashmi() {
		System.out.println("Registering rashmi with spring");
		String str=new String();
		return str;
	}
	
	@Bean("Vaishanai")
	public String Vaishanai() {
		System.out.println("Registering Vaishanai with spring");
		String string=new String();
		return string;
	}
	
	@Bean("nandini")
	public String nandini() {
		System.out.println("Registering nandini with spring");
		String string=new String();
		return string;
	}
	
	@Bean("shweta")
	public String shweta() {
		System.out.println("Registering shweta with spring");
		String string=new String();
		return "shweta";
	}
	
	@Bean("vijaylaxmi")
	public String vijaylaxmi() {
		System.out.println("Registering vijaylaxmi with spring");
		return "vijaylaxmi";
	}
	
	@Bean("circle")
	public float circle() {
		System.out.println("Registering circle with spring");
		Float f=new Float(5f);
		return f;
	}
	@Bean("square")
	public float square() {
		System.out.println("Registering square with spring");
		Float flot=new Float(3.4f);
		return flot;
	}
	@Bean("triangle")
	public float triangle() {
		System.out.println("Registering triangle with spring");
		Float area=new Float(17.3f);
		return area;
	}
	@Bean("pentgon")
	public float pentgon() {
		System.out.println("Registering pentgon with spring");
		Float fl=new Float(23f);
		return fl;
	}
	
	@Bean("rectangle")
	public float rectangle() {
	System.out.println("Registering rectangle with spring");
	Float f2=new Float(52f);
	return f2;
	}
	
	@Bean("fridge")
	public Boolean fridge() {
		System.out.println("Registering fridge with spring");
		return false;
	}
	
	@Bean("mixie")
	public Boolean mixie() {
		System.out.println("Registering mixie with spring");
		return true;
	}
	@Bean("washingMachine")
	public Boolean washingMachine() {
		System.out.println("Registering washingMachine with spring");
		return false;
	}
	@Bean("oven")
	public Boolean oven() {
		System.out.println("Registering oven with spring");
		return true;
	}
	@Bean("fan")
	public Boolean fan() {
		System.out.println("Registering fan with spring");
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
