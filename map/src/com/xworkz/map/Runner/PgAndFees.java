package com.xworkz.map.Runner;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PgAndFees {

	public static void main(String[] args) {
	
		Map<String, Double> nameAndFees = new LinkedHashMap<String, Double>();
		nameAndFees.put("KannikaParameshwari", 6900D);
		nameAndFees.put("Kushi", 5000D);
		nameAndFees.put("Venkatesh", 4000D);
		nameAndFees.put("Laxmi", 1200D);
		nameAndFees.put("Raj Pristine", 1100D);
		nameAndFees.put("Kgs", 4326D);
		nameAndFees.put("GoodLands", 7324D);
		nameAndFees.put("ComfertZone", 7321D);
		nameAndFees.put("Sunries", 4596D);
		nameAndFees.put("Glouries", 3417D);
		
		System.out.println("Total length:"+nameAndFees);
		
System.out.println("===========ONLY KEYS==============");
		
		Collection<String> collection=nameAndFees.keySet();
		
		for (String string : collection) {
			System.out.println(string);
		}
		
System.out.println("===========ONLY Values==============");
		
		Collection<Double>val=nameAndFees.values();
		
		for (Double double1 : val) {
			System.out.println(double1);
			
		}
		
		System.out.println("===========KEYS AND VAIUES==============");
		
	Set<Entry<String, Double>> k=nameAndFees.entrySet();
	for (Entry<String, Double> entry : k) {
		System.out.println(entry);
	}
		
		
		

	}

}
