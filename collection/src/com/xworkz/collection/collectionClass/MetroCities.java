package com.xworkz.collection.collectionClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;





public class MetroCities {

	public static void main(String[] args) {
		
		
		String city1="Banglore";
		String city2="Hydrabad";
		String city3="Mumbai";
		String city4="Pune";
		String city5="Delhi";
		
		Collection<String> cities=new ArrayList<String>();
		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		cities.add(city4);
		cities.add(city5);
		System.out.println(cities);
		System.out.println(cities.size());
		System.out.println("******************FOREACH LOOP*************************");
		for(String city:cities) {
		
			System.out.println(city);
		}
		
		Iterator<String> iterator = cities.iterator();
		
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
		
	
	
		 
			
		
		
		
		
}
}
