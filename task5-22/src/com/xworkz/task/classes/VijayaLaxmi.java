package com.xworkz.task.classes;

import com.xworkz.task.interfaceclass.KarnatakaRTO;

public class VijayaLaxmi extends JavaTrainee implements KarnatakaRTO{

	public VijayaLaxmi(String name, int age, String color, String nativePlace, String workingCompany, double salary) {
		super(name, age, color, nativePlace, workingCompany, salary);
		
	}

	@Override
	public boolean paidTax(double tax) {
		System.out.println("running in tax");
		return true;
		
	}

	@Override
	public double gst() {
		System.out.println("running in gst");

		return 100;
	}

	@Override
	public double vat() {
		System.out.println("running in vat");
		return 0;
	}

	@Override
	boolean training() {
		System.out.println("running in training");
				return false;
	}

	@Override
	boolean excuteProgram() {
		System.out.println("running in excute program");
		
		return false;
	}

}
