package com.xworkz.map.Runner;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class CountryAndPresident {

	public static void main(String[] args) {
		Map<String, String>  map=new TreeMap<String, String>();
		
		map.put("India", "Droupadi Murmu");
		map.put("Albania", "Bajram Begaj");
		map.put("Algeria", "Abdelmadjid");
		map.put("Angola", "Joao Lourenco");
		map.put("Armenia", "Vahagn");
		map.put("Austria", "Alexander van");
		map.put("Belgium", "Philippe");
		map.put("Chile", "Gabriel Boric");
		map.put("Italy", "Serigo");
		map.put("Malawi", "LazarusChakware");
		map.put("Mexico", "Andres");
		map.put("Jamaica", "Charles");
		map.put("Iran", "Ali");
		map.put("Estonia", "Alar Karis");
		map.put("China", "Xi Jinping");
		map.put("Benin", "Patrice Talon");
		map.put("Eswatini", "Mswati");
		map.put("Tonga", "Tupou");
		map.put("Spain", "Felipe");
		map.put("Sigapore", "Halimah");
		
		System.out.println(map.size());
		System.out.println(map);
		
	Collection<String> keys=map.keySet();
	for (String string : keys) {
		System.out.println("keys in asscending order: "+string);
	}
	
	
	System.out.println("******************************************************");
	
	map.forEach((x,y)->{
		System.out.println("key: "+x+ " value: "+y);
		if(y.length()>6) 
		{
			map.replace(x, "Droupadi murmu");
		}
	});
	
	
	
	}
}
