package com.xworkz.AccesSpcifiers.boot;

import com.xworkz.AccesSpcifiers.things.Counter;
import com.xworkz.AccesSpcifiers.things.MetroStation;

public class MetroaStationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter=new Counter();
		counter.display();
		MetroStation stay=new MetroStation();
		stay.setViaRoot("mejastic");
		System.out.println(stay.getViaRoot());
		stay.setNoOfEmployes(123);
		System.out.println(stay.getNoOfEmployes());
		
		
	}

}
