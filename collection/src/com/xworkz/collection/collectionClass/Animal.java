package com.xworkz.collection.collectionClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Animal {

	public static void main(String[] args) {
		String animal1="Lion";
		String animal2="Tiger";
		String animal3="deer";
		String animal4="Dog";
		String animal5="Cat";
		String animal6="Monkey";
		String animal7="Cheeta";
		String animal8="Fox";
		String animal9="Elephant";
		String animal10="Giraffe";
		
		Collection<String> animal=new LinkedList<String>();
		animal.add(animal1);
		animal.add(animal2);
		animal.add(animal3);
		animal.add(animal4);
		animal.add(animal5);
		animal.add(animal6);
		animal.add(animal7);
		animal.add(animal8);
		animal.add(animal9);
		animal.add(animal10);
		System.out.println("animals name"+animal);
		System.out.println("no of animals in list:"+animal.size());
		System.out.println("before remove"+animal.size());
	
		
		
	Boolean v=animal.remove(animal6);
	System.out.println(v);
		System.out.println("after remove"+animal.size());
		
		System.out.println("***********************FOREACH LOOP*****************************");
		for(String ani:animal) {
			
			System.out.println(ani);
			
		}
		System.out.println("at index 1:"+animal.toArray()[8]);
Iterator<String> animalName=animal.iterator();
while (animalName.hasNext()) {
	String string =animalName.next();
	System.out.println(string);
	
}
	}

}
