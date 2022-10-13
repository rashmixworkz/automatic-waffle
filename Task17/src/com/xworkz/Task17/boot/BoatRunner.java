package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Boat;

public class BoatRunner {

	public static void main(String[] args) {

		Boat boat = new Boat("andiamo");
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.companyname);
		System.out.println(boat.type);
		System.out.println(boat.owener);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Boat cover = new Boat("andiamo", "Blue");
		System.out.println(cover.name);
		System.out.println(cover.color);
		System.out.println(cover.companyname);
		System.out.println(cover.type);
		System.out.println(cover.owener);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Boat ray = new Boat("andiamo", "seaRay", "Gagna");
		System.out.println(ray.name);
		System.out.println(ray.color);
		System.out.println(ray.companyname);
		System.out.println(ray.type);
		System.out.println(ray.owener);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Boat white = new Boat("mastercraft", "ganesh", "red", "andiamo");
		System.out.println(white.name);
		System.out.println(white.color);
		System.out.println(white.companyname);
		System.out.println(white.type);
		System.out.println(white.owener);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Boat blue = new Boat("andiamo", "benetti", "ramesh", "pink", "dinghy");
		System.out.println(blue.name);
		System.out.println(blue.color);
		System.out.println(blue.companyname);
		System.out.println(blue.type);
		System.out.println(blue.owener);

	}

}
