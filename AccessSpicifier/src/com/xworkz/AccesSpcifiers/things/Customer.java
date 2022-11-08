package com.xworkz.AccesSpcifiers.things;

public class Customer {
	TeaStall tea = new TeaStall();
	int customer = tea.noOfCustomers;
	String payment = tea.paymentType;
	double rating = tea.ratings;
	String typeoftea = tea.typesoftea;

	public void display() {
		System.out.println(customer);
		System.out.println(payment);
		System.out.println(rating);
		System.out.println(typeoftea);

	}
}
