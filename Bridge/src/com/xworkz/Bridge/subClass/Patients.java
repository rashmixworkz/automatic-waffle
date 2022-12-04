package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.HospitalRules;

public class Patients implements HospitalRules{

	@Override
	public boolean noiseReduction() {
	
		return false;
	}

	@Override
	public String smoking() {
		
		return null;
	}

	@Override
	public boolean keepClean() {
		
		return false;
	}

}
