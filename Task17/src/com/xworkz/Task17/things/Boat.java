package com.xworkz.Task17.things;

public class Boat {

	public String name;
	public String color;
	public String companyname;
	public String type;
	public String owener;

	public Boat(String name) {
		this.name = name;
		System.out.println("instatiation using paramerters");
	}

	public Boat(String name, String color) {
		this.name = name;
		this.color = color;
		System.out.println("instatiation using paramerters");
	}

	public Boat(String name, String companyname, String owener) {
		this.name = name;
		this.companyname = companyname;
		this.owener = owener;
		System.out.println("instatiation using paramerters");
	}

	public Boat(String type, String owener, String color, String name) {
		this.type = type;
		this.owener = owener;
		this.color = color;
		this.name = name;
		System.out.println("instatiation using paramerters");
	}

	public Boat(String name, String companyname, String owener, String color, String type) {
		this.name = name;
		this.companyname = companyname;
		this.owener = owener;
		this.color = color;
		this.type = type;
		System.out.println("instatiation using paramerters");
	}

}
