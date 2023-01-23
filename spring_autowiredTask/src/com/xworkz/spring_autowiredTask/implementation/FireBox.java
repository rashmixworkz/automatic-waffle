package com.xworkz.spring_autowiredTask.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.spring_autowiredTask.rules.Browser;
import com.xworkz.spring_autowiredTask.rules.Provider;

public class FireBox implements Browser {

	
	@Autowired
	@Qualifier("jio")
	private Provider provider;
	@Override
	public void browse() {
System.out.println("created Browser in FireBox");	
provider.connect();
	}

}
