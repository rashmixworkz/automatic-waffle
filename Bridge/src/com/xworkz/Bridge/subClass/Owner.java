package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.PetrolPump;

public class Owner implements PetrolPump {

	@Override
	public boolean indianCitizen() {
	
		return false;
	}

	@Override
	public boolean residentOfIndian() {
		
		return false;
	}

	@Override
	public int minimumEducation() {
		return 10;
	}

	@Override
	public boolean landRequirement() {
		
		return false;
	}

	@Override
	public int applicantAge() {
	
		return 21;
	}
	

	PetrolPump petrolPump=new Owner();
}

