package com.xworkz.spring_autowiredTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	@Autowired
	private Battery battery;
	@Autowired
	private Lens lens;
	
	public Camera() {
	System.out.println("default const of Camera");
	}

}
