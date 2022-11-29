package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.CompanyRegulations;

public class Employee implements CompanyRegulations{
	public static void main(String[] args) {
		CompanyRegulations companyRegulations=new Employee();
		System.out.println(companyRegulations.followDressCode());
		System.out.println(companyRegulations.readyToWorkAtAppointedTime());
		Employee Employee=new Employee();
		System.out.println(Employee.followPolicy());
		System.out.println(Employee.maintainRecords());
	}

	@Override
	public boolean followPolicy() {
		
		return false;
	}

	@Override
	public boolean maintainRecords() {

		return false;
	}

	@Override
	public int readyToWorkAtAppointedTime() {

		return 0;
	}

	@Override
	public boolean followDressCode() {
		
		return false;
	}

	@Override
	public boolean attendStandUpCalls() {
		
		return false;
	}
	

}
