package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.CovidRules;

public class Patient implements CovidRules {

	public static void main(String[] args) {
		
		CovidRules rule=new Patient();
		
		System.out.println(rule.keepDistance());
		System.out.println(rule.isolation());
		System.out.println(rule.numberOfCovidPatients());
		System.out.println(rule.vaccination());
		System.out.println(rule.wearmask());
		
		
		Patient patient=new Patient();
		System.out.println(patient.isolation());
		System.out.println(patient.keepDistance());
		System.out.println(patient.numberOfCovidPatients());
		System.out.println(patient.vaccination());
		System.out.println(patient.wearmask());
		
	}
	@Override
	public boolean wearmask() {
        return false;
	}

	@Override
	public int numberOfCovidPatients() {
	   return 1000;
	}

	@Override
	public boolean keepDistance() {
		return false;
	}
	
	@Override
	public String vaccination() {
		return null;
	}

	@Override
	public boolean isolation() {
      return false;
	}
	
	
	
	
	

}
