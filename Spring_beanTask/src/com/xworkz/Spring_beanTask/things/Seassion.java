package com.xworkz.Spring_beanTask.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Seassion {
	
	
	private String name;
	private int duration;
	private String startingMonth;
	
	
	public Seassion() {
		
		System.out.println("default cons");
	
	}


	public String getName() {
		return name;
	}

@Value("summer")
	public void setName(String name) {
		this.name = name;
	}


	public int getDuration() {
		return duration;
	}

@Value("4")
	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getStartingMonth() {
		return startingMonth;
	}

@Value("march")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	

}
