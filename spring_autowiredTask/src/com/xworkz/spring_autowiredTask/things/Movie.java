package com.xworkz.spring_autowiredTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
@Autowired	
private	Director director;
@Autowired
private Experience experience;
@Autowired
private  CameraMen cameraMen;
	public Movie() {
		System.out.println("default const of Movie");
	}
	
	
	public void checkPropertyRef() {
		System.out.println(this.director.hashCode()+"hash code of ref");
		System.out.println(this.experience.hashCode()+"hash code of ref");
		System.out.println(this.cameraMen.hashCode()+"hash code of ref");
	}

}
