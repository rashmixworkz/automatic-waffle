package com.xworkz.map.Runner;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class ChocolateAndPrice {
	public static void main(String[] args) {

		Map<String, Double> code = new LinkedHashMap<String, Double>();

		code.put("Silk", 80D);
		code.put("MilkyBar", 10D);
		code.put("Munch", 5D);
		code.put("Perk", 5D);
		code.put("Polo", 10D);
		code.put("KitKat", 20D);
		code.put("FiveStar", 5D);
		code.put("DairyMilk", 10D);
		code.put("MangoByte", 1D);
		code.put("OrangeByte", 1D);
		
		System.out.println("total keys and values :"+code);
		
		System.out.println("===========ONLY KEYS==============");
		
		Collection<String> collection=code.keySet();
		
		for (String string : collection) {
			System.out.println(string);
		}
		
System.out.println("===========ONLY Values==============");
		
		Collection<Double>val=code.values();
		
		for (Double double1 : val) {
			System.out.println(double1);
			
		}
		
		System.out.println("===========KEYS AND VAIUES==============");
		
	Set<Entry<String, Double>> k=code.entrySet();
	for (Entry<String, Double> entry : k) {
		System.out.println(entry);
	}

	}

}
