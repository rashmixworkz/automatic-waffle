package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.AirportGuidelines;

public class Passanger implements AirportGuidelines{
	public static void main(String[] args) {
		AirportGuidelines airportGuidelines=new Passanger();
		System.out.println(airportGuidelines.maintainQueue());
		System.out.println(airportGuidelines.showIdentityProof());
		
		Passanger passanger=new Passanger();
		System.out.println(passanger.maintainSocialDistance());
	}

	@Override
	public boolean showIdentityProof() {
		
		return false;
	}

	@Override
	public int showPnrNoToStaff() {
		return 0;
	}

	@Override
	public boolean maintainSocialDistance() {
		
		return false;
	}

	@Override
	public boolean compeletTheCheakIn() {
	
		return false;
	}

	@Override
	public boolean maintainQueue() {
		
		return false;
	}
	
	

}
