package com.xworkz.collectionDTO.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Stream;

import com.xworkz.collectionDTO.dto.Type;
import com.xworkz.collectionDTO.dto.WeponDTO;

public class WeponDTORunner {

	public static void main(String[] args) {

		Collection<WeponDTO> collection = new ArrayList<WeponDTO>();

		collection.add(new WeponDTO("cannon", "Rashmi", "cast iron", 2312, Type.PISTOL));
		collection.add(new WeponDTO("Feanch", "vaishnavi", "metal", 128, Type.BOWANDARROW));
		collection.add(new WeponDTO("martor", "roopa", "cast iron", 432, Type.DAGGER));
		collection.add(new WeponDTO("paris gun", "vittal", "cast iron", 8431, Type.RAPIER));
		collection.add(new WeponDTO("plague", "srinivas", "cast iron", 561, Type.REVOLVER));
		collection.add(new WeponDTO("ricin", "padma", "cast iron", 9612, Type.SPEAR));
		collection.add(new WeponDTO("yello rain", "Raju", "cast iron", 9234, Type.SWORDS));
		collection.add(new WeponDTO("admasite", "shweta", "cast iron", 3207, Type.AX));
		collection.add(new WeponDTO("bola", "chinnu", "cast iron", 5623, Type.BOLO));
		collection.add(new WeponDTO("sling", "krishna", "cast iron", 9611, Type.CLUB));
		collection.add(new WeponDTO("spear", "diraj", "cast iron", 8032, Type.CROSSBOW));
		collection.add(new WeponDTO("pike", "vadiraj", "cast iron", 1209, Type.FLAMETHROWER));
		collection.add(new WeponDTO("bazooka", "soumya", "cast iron", 531, Type.GRENADE));
		collection.add(new WeponDTO("tarpado", "madhuri", "cast iron", 987, Type.LANDMINES));
		collection.add(new WeponDTO("musket", "prasanna", "cast iron", 879, Type.MACE));
		collection.add(new WeponDTO("shut gun", "kreethi", "cast iron", 987876, Type.MACHINEGUN));
		collection.add(new WeponDTO("icbm", "supriya", "cast iron", 1342, Type.HALBERD));
		collection.add(new WeponDTO("rdx", "laxmi", "cast iron", 9734, Type.ROCKET));
		collection.add(new WeponDTO("depth charge", "pavita", "cast iron", 6354, Type.TANKS));
		collection.add(new WeponDTO("grapeshot", "keshav", "cast iron", 2413, Type.DAGGER));

		// sorted by name in ascending order

		collection.stream().sorted().forEach(e -> System.out.println(e));
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		// nmaes in dsc
		collection.stream().sorted().forEach(e -> System.out.println(e));

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		// sorted by price in asc

		Comparator<WeponDTO> com = (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());

		collection.stream().sorted(com).forEach(e -> System.out.println(e));

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		// sorted by price in dsc

		Comparator<WeponDTO> comparator = (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice());

		collection.stream().sorted(comparator).forEach(e -> System.out.println(e));

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		// sorted by madeBy asc
		
		collection.stream().sorted((s1,s2)->s1.getMadeBy().compareTo(s2.getMadeBy())).forEach(e->System.out.println(e));
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		// sorted by madeOn asc
		
		collection.stream().sorted((q1,q2)->q1.getMadeOn().compareTo(q2.getMadeOn())).forEach(e->System.out.println(e));
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		//madeBy and madeOn
		collection
		.stream()
		.forEach(ele->{System.out.println("made by "+ele.getMadeBy()); System.out.println("made on "+ele.getMadeOn());});
		
		//price grater than1231
		
		collection.stream().filter(e->e.getPrice()>1231).forEach(e->System.out.println(e));
		
		System.out.println("***************************************************");
		
		//madeBy and name
		Comparator<WeponDTO> compares=comparator.thenComparing(WeponDTO::getMadeBy);
		
		Comparator<WeponDTO> compar=comparator.thenComparing(WeponDTO::getName);
		
		Comparator<WeponDTO> compro=compares.thenComparing(compar);
		collection.stream().sorted().forEach(e->System.out.println(e));
		
		
		
	}

}
