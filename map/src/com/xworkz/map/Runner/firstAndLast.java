package com.xworkz.map.Runner;

import java.util.Collection;
import java.util.LinkedList;

public class firstAndLast {

	public static void main(String[] args) {

		LinkedList<String> coll=new LinkedList<String>();
		
		coll.add("Rashmi");
		coll.add("Vaishanvi");
		coll.add("Rakshita");
		coll.add("Swati");
		coll.add("sanjana");
		
		System.out.println(coll.size());
		
		coll.forEach(e->System.out.println(e));
		coll.removeFirst();
		System.out.println("removed first element");
		System.out.println(coll.size());
		
		coll.forEach(e->System.out.println(e));
		coll.removeLast();
		System.out.println("removed last element");
		System.out.println(coll.size());
	}

}
