package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Bread;

public class BreadRunner {

	public static void main(String[] args) {

		Bread bread = new Bread("Whole wheet");
		System.out.println(bread.type);
		System.out.println(bread.companyName);
		System.out.println(bread.price);
		System.out.println(bread.shape);
		System.out.println(bread.quantity);

		System.out.println("*****************************************");

		Bread rock = new Bread(80);
		System.out.println(rock.type);
		System.out.println(rock.companyName);
		System.out.println(rock.price);
		System.out.println(rock.shape);
		System.out.println(rock.quantity);

		Bread boat = new Bread(28.1d);
		System.out.println(boat.type);
		System.out.println(boat.companyName);
		System.out.println(boat.price);
		System.out.println(boat.shape);
		System.out.println(boat.quantity);

		Bread lock = new Bread("Whole wheet", 39);
		System.out.println(lock.type);
		System.out.println(lock.companyName);
		System.out.println(lock.price);
		System.out.println(lock.shape);
		System.out.println(lock.quantity);

		Bread key = new Bread(4.5d, "Kahna");
		System.out.println(key.type);
		System.out.println(key.companyName);
		System.out.println(key.price);
		System.out.println(key.shape);
		System.out.println(key.quantity);

		Bread pen = new Bread(50, 20.3d, "Whole wheet");
		System.out.println(pen.type);
		System.out.println(pen.companyName);
		System.out.println(pen.price);
		System.out.println(pen.shape);
		System.out.println(pen.quantity);

		Bread wheet = new Bread("Whole wheet", "rect");
		System.out.println(wheet.type);
		System.out.println(wheet.companyName);
		System.out.println(wheet.price);
		System.out.println(wheet.shape);
		System.out.println(wheet.quantity);

		Bread heart = new Bread("Whole wheet", "Plum", "round");
		System.out.println(heart.type);
		System.out.println(heart.companyName);
		System.out.println(heart.price);
		System.out.println(heart.shape);
		System.out.println(heart.quantity);

	}

}
