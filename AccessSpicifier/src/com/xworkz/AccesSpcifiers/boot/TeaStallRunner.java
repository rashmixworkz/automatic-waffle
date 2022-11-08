package com.xworkz.AccesSpcifiers.boot;

import com.xworkz.AccesSpcifiers.things.Customer;
import com.xworkz.AccesSpcifiers.things.TeaStall;

public class TeaStallRunner {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.display();

		TeaStall stall = new TeaStall();
		stall.setName("Boyler tea stall");
		System.out.println(stall.getName());
		stall.setLocation("Rajajinagar");
		System.out.println(stall.getLocation());

		stall.setownerName("Ganesh");
		System.out.println(stall.getownerName());

		stall.setnoOfContainers(12);
		System.out.println(stall.getnoOfContainers());

		stall.brandOfTea = "RedLable";

		System.out.println(stall.brandOfTea);
		stall.amountOfOneTea = 6;

		System.out.println(stall.amountOfOneTea);

		stall.reviews = "GoodPlace";

		System.out.println(stall.reviews);

	}

}
