package com.xworkz.task.Runner;

import com.xworkz.task.classes.VijayaLaxmi;

public class PersonRunner {

	public static void main(String[] args) {
		
		VijayaLaxmi vijayaLaxmi=new VijayaLaxmi("RASHMI", 22, "White", "Kuknoor", "Capgemini", 3);
		vijayaLaxmi.uplodedTask();
		vijayaLaxmi.completedProgram();
		vijayaLaxmi.gst();
		vijayaLaxmi.paidTax(20000);
		vijayaLaxmi.vat();
		vijayaLaxmi.eat();
		vijayaLaxmi.sleep();
		System.out.println(vijayaLaxmi.getName());
		System.out.println(vijayaLaxmi.getAge());
		System.out.println(vijayaLaxmi.getColor());
		System.out.println(vijayaLaxmi.getNativePlace());
		System.out.println(vijayaLaxmi.getSalary());
		System.out.println(vijayaLaxmi.getWorkingCompany());
		System.out.println(vijayaLaxmi.gst());
		System.out.println(vijayaLaxmi.eat());
		System.out.println(vijayaLaxmi.paidTax(20000));
		System.out.println(vijayaLaxmi.sleep());
		System.out.println(vijayaLaxmi.vat());
		System.out.println(vijayaLaxmi.uplodedTask());
		
	}

}
