package com.xworkz.task.boot;

import com.xworkz.task.child.Cardiologist;
import com.xworkz.task.child.Dentist;
import com.xworkz.task.child.ENT;
import com.xworkz.task.things.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {

		Doctor doctor = new Doctor();
		System.out.println("parent class");
		System.out.println(doctor.type);
		System.out.println(doctor.fees);

		System.out.println("child class");
		Doctor doctor2 = new Dentist();
		Dentist dent = (Dentist) doctor2;
		System.out.println(dent.name);
		System.out.println(dent.qulification);
		System.out.println(dent.type);
		System.out.println(dent.fees);

		System.out.println("child class");
		Doctor doctor3 = new ENT();
		ENT ent = (ENT) doctor3;
		System.out.println(ent.hospitalLocation);
		System.out.println(ent.gender);

		System.out.println("child class");
		Doctor doctor4 = new Cardiologist();
		Cardiologist cardo = (Cardiologist) doctor4;
		System.out.println(cardo.governmentOrPrivate);
		System.out.println(cardo.hospitalName);

	}

}
