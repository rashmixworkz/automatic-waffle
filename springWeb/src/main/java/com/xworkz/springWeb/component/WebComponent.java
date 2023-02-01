package com.xworkz.springWeb.component;

import org.springframework.stereotype.Component;

@Component
public class WebComponent {
	
	public WebComponent() {
		
System.out.println("created"+this.getClass().getSimpleName());	
}
}
