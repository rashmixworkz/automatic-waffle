package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Fish;

public class FishRunner {

	public static void main(String[] args) {
		Fish red = new Fish("Mackerel");
		System.out.println(red.name);
		System.out.println(red.type);
		System.out.println(red.price);
		System.out.println(red.weight);
		System.out.println(red.length);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Fish water = new Fish(320, 3.5);
		System.out.println(water.type);
		System.out.println(water.price);
		System.out.println(water.name);
		System.out.println(water.weight);
		System.out.println(water.length);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Fish str = new Fish(390, 2.9);
		System.out.println(str.type);
		System.out.println(str.price);
		System.out.println(str.name);
		System.out.println(str.weight);
		System.out.println(str.length);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Fish book = new Fish(320, 15.1d);
		System.out.println(book.type);
		System.out.println(book.price);
		System.out.println(book.name);
		System.out.println(book.weight);
		System.out.println(book.length);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Fish fry = new Fish("Xena", 1.2);
		System.out.println(fry.type);
		System.out.println(fry.price);
		System.out.println(fry.name);
		System.out.println(fry.weight);
		System.out.println(fry.length);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Fish best = new Fish(2.1, "Zeus", 15.1d);
		System.out.println(best.type);
		System.out.println(best.price);
		System.out.println(best.name);
		System.out.println(best.weight);
		System.out.println(best.length);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Fish normal = new Fish(15.1d, "butterflyfish");
		System.out.println(normal.type);
		System.out.println(normal.price);
		System.out.println(normal.name);
		System.out.println(normal.weight);
		System.out.println(normal.length);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Fish result = new Fish("sunfish", "whale");
		System.out.println(result.type);
		System.out.println(result.price);
		System.out.println(result.name);
		System.out.println(result.weight);
		System.out.println(result.length);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Fish story = new Fish(15.1d, 3.1, 530);
		System.out.println(story.type);
		System.out.println(story.price);
		System.out.println(story.name);
		System.out.println(story.weight);
		System.out.println(story.length);

	}

}
