package com.xworkz.Spring_beanTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Software {
	
	@Autowired
	@Qualifier("microsoft")
	private String name;
	@Autowired
	@Qualifier("sVersion")
	private double version;
	@Autowired
	@Qualifier("microsoftCompany")
	private String developer;
	@Autowired
@Qualifier("devDate")
	private int date;
	@Autowired
	@Qualifier("softwareFree")
	private boolean free;
	
	public Software() {
		
		System.out.println("default cons of Software");
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}

	
	

}
