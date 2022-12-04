package com.xworkz.Bridge.runner;

import com.xworkz.Bridge.subClass.Passenger1;
import com.xworkz.Bridge.subClass.Staff;

public class MertoRulessRunner {

	public static void main(String[] args) {
		Passenger1 passenger=new Passenger1();
		Staff staff=new Staff(passenger);
		staff.verifyPassanger();
	}

}
