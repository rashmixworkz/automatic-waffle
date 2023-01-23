package com.xworkz.spring_autowiredTask.implementation;

import com.xworkz.spring_autowiredTask.rules.Provider;

public class Jio implements Provider {

	@Override
	public void connect() {
System.out.println("created jio in provider");		
	}

}
