package com.xworkz.task.boot;

import com.xworkz.task.child.CentalJail;
import com.xworkz.task.child.DistrictJail;
import com.xworkz.task.child.SubJail;
import com.xworkz.task.things.Jail;

public class JailRunner {

	public static void main(String[] args) {
		Jail jail = new Jail();
		System.out.println("parent class");
		System.out.println(jail.location);
		System.out.println(jail.name);

		Jail jail1 = new CentalJail();
		CentalJail central = (CentalJail) jail1;
		System.out.println(central.noOfCriminals);
		System.out.println(central.noOfRooms);

		System.out.println("child class");
		Jail jail2 = new DistrictJail();
		DistrictJail dist = (DistrictJail) jail2;
		System.out.println(dist.location);
		System.out.println(dist.type);

		System.out.println("child class");
		Jail jail3 = new SubJail();
		SubJail sub = (SubJail) jail3;
		System.out.println(sub.noOfJailers);
		System.out.println(sub.panishment);

	}

}
