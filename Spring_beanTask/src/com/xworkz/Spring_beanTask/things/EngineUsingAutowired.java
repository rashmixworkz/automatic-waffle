package com.xworkz.Spring_beanTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class EngineUsingAutowired {
@Autowired
@Qualifier("engineName")
	private String name;
@Autowired
@Qualifier("typeOfEngine")
	private String type;
	private int number;
	private double version;
	private String company;
	private int strokes;

	public EngineUsingAutowired() {
System.out.println("default cons of EngineUsingAutowired");
	}

	public EngineUsingAutowired(@Qualifier("engineNmae")String  name,@Qualifier("typeOfEngine") String type, int number, double version,@Qualifier("engineCompany") String company, int strokes) {
		super();
		this.name = name;
		this.type = type;
		this.number = number;
		this.version = version;
		this.company = company;
		this.strokes = strokes;
	}

	@Override
	public String toString() {
		return "EngineUsingAutowired [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version
				+ ", company=" + company + ", strokes=" + strokes + "]";
	}

	public int getStrokes() {
		return strokes;
	}
	@Autowired
	@Qualifier("engineStrokes")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

}
