package com.xworkz.Spring_beanTask.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ActorUsingCons {
	
	private String name;
	private String language;
	private int age;
	
	public ActorUsingCons(@Value("PunitRajkumar") String name,@Value("Kannada") String language,@Value("43") int age) {
		System.out.println("parameter cons");
		this.name=name;
		this.language=language;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
