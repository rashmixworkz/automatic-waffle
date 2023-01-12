package com.xworkz.Spring_beanTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SneakeUsingAutoWired {

	private String name;
	@Autowired
	@Qualifier("lengths")
	private double length;
	@Autowired
	@Qualifier("colors")
	private String color;
	private String type;
	private boolean poisionous;

	public SneakeUsingAutoWired() {
		System.out.println("default cons of SneakeUsingAutoWired");
	}

	public SneakeUsingAutoWired(@Qualifier("nameOfSnake") String name, double length, String color,
			@Qualifier("types") String type, @Qualifier("dangous") boolean poisionous) {
		super();
		this.name = name;
		this.length = length;
		this.color = color;
		this.type = type;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "SneakeUsingAutoWired [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type
				+ ", poisionous=" + poisionous + "]";
	}

}
