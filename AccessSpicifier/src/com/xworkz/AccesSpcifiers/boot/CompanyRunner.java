package com.xworkz.AccesSpcifiers.boot;

import com.xworkz.AccesSpcifiers.things.Company;
import com.xworkz.AccesSpcifiers.things.Employee;


public class CompanyRunner {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.display();

		Company company = new Company();
		company.setName("TATA Elaxi");
		System.out.println(company.getName());
		company.setLocation("Whitefield");
		System.out.println(company.getLocation());

		company.setownerName("Ratan TATA");
		System.out.println(company.getownerName());

		company.setnoOfEmployes(1200);
		System.out.println(company.getnoOfEmployes());

		company.reviews = "Good pace to work";

		System.out.println(company.reviews);
		company.type = "product company";

		System.out.println(company.type);

		company.noOfBuildgs = 20;

		System.out.println(company.noOfBuildgs);

	}


	}


