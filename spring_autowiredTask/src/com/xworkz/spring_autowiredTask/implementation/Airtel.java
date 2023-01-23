package com.xworkz.spring_autowiredTask.implementation;

import com.xworkz.spring_autowiredTask.rules.Provider;

public class Airtel implements Provider {

	@Override
	public void connect() {
System.out.println("created airtel in provider");		
	}

}
