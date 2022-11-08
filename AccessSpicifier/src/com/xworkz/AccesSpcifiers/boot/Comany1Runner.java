package com.xworkz.AccesSpcifiers.boot;

import com.xworkz.AccesSpcifiers.things.Company1;
import com.xworkz.AccesSpcifiers.things.Developer;



public class Comany1Runner {

	public static void main(String[] args) {
		Developer develop = new Developer();
		develop.display();

		Company1 comp = new Company1();
		comp.setCompanyName("Infosys");
		System.out.println(comp.getCompanyName());
		
		comp.setType("Rajajinagar");
		System.out.println(comp.getType());

		comp.setInvestment(70.3);
		System.out.println(comp.getInvestment());

		comp.noOfDesignations=12;
		System.out.println(comp.noOfDesignations);

		comp.noOfDevelopers =125;

		System.out.println(comp.noOfDevelopers);
		comp.policy = "should not disclose company name";

		System.out.println(comp.policy);

		comp.isGood = true;

		System.out.println(comp.isGood);
		comp.companyLocation="BTM Layout";
		System.out.println(comp.companyLocation);



	}

}
