package com.xworkz.spring_autowiredTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMen {
	@Autowired
	private Camera camera;
	
	public CameraMen() {
		System.out.println("default const of CameraMen");
	}

}
