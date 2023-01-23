package com.xworkz.map.Runner;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CountryWithCode {

	public static void main(String[] args) {
	
		
Map<String,Integer>  map=new TreeMap<String, Integer>();
		
		map.put("India", 91);
		map.put("Albania",78);
		map.put("Algeria", 45);
		map.put("Angola", 61);
		map.put("Armenia",81);
		System.out.println(map.size());
		System.out.println(map);
		
		Set<Entry<String, Integer>> sets = map.entrySet();

		for (Entry<String, Integer> entry : sets) {

			System.out.println(entry);

	}
		
		System.out.println("before removing: "+map.size());
		map.remove("India", 91);
		System.out.println("after removing: "+map.size());
		System.out.println(map);
		
		

}
}
