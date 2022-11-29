package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.OnlineTestRules;

public class Attendee implements OnlineTestRules{
	public static void main(String[] args) {
		
	OnlineTestRules onlineTestRules=new Attendee();
	System.out.println(onlineTestRules.completeTheTestGivenTime());
	System.out.println(onlineTestRules.systemCompatiable());
	System.out.println(onlineTestRules.microPhoneOn());
	System.out.println(onlineTestRules.webcamOn());
	System.out.println(onlineTestRules.showIdProof());
	
	Attendee attendee=new Attendee();
	System.out.println(attendee.microPhoneOn());
	System.out.println(attendee.webcamOn());
	
	}
	@Override
	public boolean webcamOn() {
		
		return false;
	}

	@Override
	public boolean microPhoneOn() {
		return false;
	}

	@Override
	public int completeTheTestGivenTime() {
	
		return 30;
	}

	@Override
	public boolean systemCompatiable() {
	
		return false;
	}

	@Override
	public boolean showIdProof() {
	
		return false;
	}
	
	

}

