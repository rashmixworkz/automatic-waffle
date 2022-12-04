package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.MetroRuless;

public class Passenger1 implements MetroRuless{

	@Override
	public boolean checking() {
		
		return false;
	}

	@Override
	public double ticket() {
	
		return 30;
	}

	@Override
	public String ticketType() {
		
		return "online";
	}

	@Override
	public boolean wearMask() {
		return false;
	}

	
}
