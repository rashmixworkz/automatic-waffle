package com.xworkz.collection.collectionClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany {

	public static void main(String[] args) {
		String company1="Accuvate pvt limited";
		String company2="Accuware pvt limited";
		String company3="Accord pvt limited";
		String company4="Bosch";
		String company5="Capgemini";
		String company6="Cognizant";
		String company7="Dolitte";
		String company8="Donyti";
		String company9="Infosys";
		String company10="Zoho";
		String company11="HCL";
		String company12="RedBus";
		String company13="Apple";
		String company14="L&T";
		String company15="Audi";
		String company16="TCS";
		String company17="TATA";
		String company18="Cisco";
		String company19="Kroger";
		String company20="Comcast";
		
		Collection<String> software=new ArrayList<String>();
		software.add(company1);
		software.add(company2);
		software.add(company3);
		software.add(company4);
		software.add(company5);
		software.add(company6);
		software.add(company7);
		software.add(company8);
		software.add(company9);
		software.add(company10);
		software.add(company11);
		software.add(company12);
		software.add(company13);
		software.add(company14);
		software.add(company15);
		software.add(company16);
		software.add(company17);
		software.add(company18);
		software.add(company19);
		software.add(company20);
		System.out.println("software companies"+software);
		System.out.println("software companies list"+software.size());
		
		System.out.println("***********FOREACH LOOP*************************");
		for (String name:software) {
			System.out.println(name);
			
		}
		System.out.println("*************ITERATOR LOOP********************");
		
		Iterator<String> ite=software.iterator();
		while (ite.hasNext()) {
			String string =  ite.next();
			System.out.println(string);
			
		}
		
		
		
		

	}

}
