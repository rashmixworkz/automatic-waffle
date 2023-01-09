package com.xworkz.map.Runner;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CompanyAndSoftware {

	public static void main(String[] args) {
	
		
		Map<String, Double> company = new LinkedHashMap<String, Double>();
		
		company.put("TCS", 10D);
		company.put("Infosys", 23D);

		company.put("Accuvare", 12D);

		company.put("Simans", 3D);

		company.put("Dilotte", 9D);

		company.put("Google", 4D);

		company.put("Flipkart", 34D);
		company.put("Amezon", 41D);

		company.put("Oracle", 44D);
		company.put("Hcl", 6D);
	
		System.out.println("Total no of Entries:"+company.size());
		
		
System.out.println("===========ONLY KEYS==============");
		
		Collection<String> collection=company.keySet();
		
		for (String string : collection) {
			System.out.println(string);
		}
		
System.out.println("===========ONLY Values==============");
		
		Collection<Double>val=company.values();
		
		for (Double double1 : val) {
			System.out.println(double1);
			
		}
		
		System.out.println("===========KEYS AND VAIUES==============");
		
	Set<Entry<String, Double>> k=company.entrySet();
	for (Entry<String, Double> entry : k) {
		System.out.println(entry);
	}
		
		
		



	}

}
