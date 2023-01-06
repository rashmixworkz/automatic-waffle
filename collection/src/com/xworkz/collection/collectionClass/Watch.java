package com.xworkz.collection.collectionClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
	String watchName1="HMT";
	String watchName2="Seiko";
	String watchName3="Cartier";
	String watchName4="Casio";
	String watchName5="Piaget";
	
	Collection<String> ref =new ArrayList<String>();
	ref.add(watchName5);
	ref.add(watchName4);
	ref.add(watchName3);
	ref.add(watchName2);
	ref.add(watchName1);
	System.out.println(ref);
	System.out.println("total watches:"+ref.size());
	
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&FOREACH LOOP&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	for(String watch:ref) {
		System.out.println(watch);
	}
	System.out.println("******************ITERATOR LOOP**************************");
	
	
	Iterator<String> watches=ref.iterator();
	while (watches.hasNext()) {
		String string = (String) watches.next();
		System.out.println(string);
	}

	}

}
