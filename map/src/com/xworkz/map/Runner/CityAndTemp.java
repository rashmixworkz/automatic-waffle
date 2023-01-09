package com.xworkz.map.Runner;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;



public class CityAndTemp {

	public static void main(String[] args) {

		Map<String, Double> map = new LinkedHashMap<String, Double>();

		map.put("Kuknoor", 30D);
		map.put("Koppal", 32.1);
		map.put("Banglore", 23.12);
		map.put("Mysore", 25.6);
		map.put("Chitradurga", 34.2);
		map.put("Kuknoor", 20.2);
		map.put("Raichur", 40D);
		map.put("Gulbarga", 41.3);
		map.put("Udupi", 12.3);
		map.put("Manglore", 33.2);

		System.out.println("Total entries in map :" + map.size());

		System.out.println("==========ONLY KEYS===========");
		Set<String> keys = map.keySet();

		for (String k : keys) {
			System.out.println(k);

		}

		System.out.println("==========ONLY VALUES===========");

		Collection<Double> val = map.values();
		for (Double values : val) {
			System.out.println(values);

		}
		System.out.println("==========KEYS & VALUES=========");

	Set<java.util.Map.Entry<String, Double>> entries = map.entrySet();

		for (java.util.Map.Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey()+"="+entry.getValue());

		}

	}

}
