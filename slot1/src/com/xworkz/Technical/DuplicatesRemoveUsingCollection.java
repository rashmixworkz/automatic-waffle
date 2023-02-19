package com.xworkz.Technical;

import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class DuplicatesRemoveUsingCollection {
	public static void main(String[] args) {
		
	

		List<String> list1=new ArrayList<String>();
		list1.add("Rashmi");
		list1.add("vaishnavi");
		list1.add("shweta");
		list1.add("megahana");
		
		List<String> list2=new ArrayList<String>();
		list2.add("Rashmi");
		list2.add("vaishnavi");
		list2.add("shweta");
		list2.add("megahana");
	
		List<String> list3=new ArrayList<String>();
		
		list3.addAll(list1);
		list3.addAll(list2);
		
		Set<String> set=new LinkedHashSet<String>();
		set.addAll(list3);
		System.out.println("removed duplicates values: ");
		System.out.println(set);

	}

}
