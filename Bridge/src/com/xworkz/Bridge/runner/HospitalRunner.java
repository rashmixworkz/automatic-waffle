package com.xworkz.Bridge.runner;

import com.xworkz.Bridge.subClass.Patients;
import com.xworkz.Bridge.subClass.Visitors;

public class HospitalRunner {

	public static void main(String[] args) {
	
		Patients patients=new Patients();
		Visitors visitors=new Visitors(patients);
		visitors.limitvisitors();

	}

}
