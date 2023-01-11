package com.xworkz.collection.collectionClass;

import java.util.stream.Stream;

public class Limit {

	public static void main(String[] args) {
	
		
		
		Stream.iterate(5, e->e+1).filter(element->element%5==0).limit(10).forEach(e->System.out.println(e));

	}

}
