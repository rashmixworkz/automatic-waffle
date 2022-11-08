package com.xworkz.Association.things;

public class Location1 {
	public int doorNo;
	public String streetName;
	public Country country = new Country("india", 91, "Mango", "rupees");
	public City city = new City(100, "banglore");
	public State state = new State("Karnataka", 30);

	public Location1(int doorNo, String streetName) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
	}

	public void showOff() {
		System.out.println(this.doorNo);
		System.out.println(this.streetName);
		this.country.showOff();
		this.city.showOff();
		this.state.showOff();

	}

}
