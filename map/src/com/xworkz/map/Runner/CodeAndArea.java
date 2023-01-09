package com.xworkz.map.Runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CodeAndArea {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(51, "NR Colony");
		map.put(65, "Jayanagr");
		map.put(23, "Kormangala");
		map.put(82, "Bidadi");
		map.put(81, "Whitefield");
		map.put(34, "Hebbal");
		map.put(61, "KR Market");
		map.put(84, "Indira nagar");
		map.put(74, "KR Puram");
		map.put(21, "Basavanagudi");

		System.out.println("total entries in map:" + map.size());

		System.out.println("==============ONLY KEY===================");

		Collection<Integer> keys = map.keySet();
		for (Integer integer : keys) {
			System.out.println(integer);

		}

		System.out.println("===============ONLY VALUES==============");

		Collection<String> values = map.values();
		for (String string : values) {
			System.out.println(string);

		}
		System.out.println("===============KEYS & VALUES==============");

		Set<Entry<Integer, String>> sets = map.entrySet();

		for (Entry<Integer, String> entry : sets) {

			System.out.println(entry);

		}

	}

}
