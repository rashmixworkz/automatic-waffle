package com.xworkz.streams.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.streams.DTO.Sanitizer;

public class SanitizerRunner {

	public static void main(String[] args) {

		
		
		Collection< Sanitizer> collection=new ArrayList<Sanitizer>();
		
		collection.add(new Sanitizer(1, "savlon", 54.3, "orange"));
		collection.add(new Sanitizer(2, "dettol", 100, "gold"));
		collection.add(new Sanitizer(4, "lifeBoy", 52, "pink"));
		collection.add(new Sanitizer(6, "godrej", 15, "blue"));
		collection.add(new Sanitizer(8, "dabur", 34.84, "maroon"));
		collection.add(new Sanitizer(12, "multani", 532, "yellow"));
		collection.add(new Sanitizer(81, "corvil", 82, "red"));
		collection.add(new Sanitizer(13, "trust", 95, "white"));
		collection.add(new Sanitizer(53, "DCM Sriram", 25, "green"));
		collection.add(new Sanitizer(62, "sterillium", 74, "purple"));
		
		System.out.println(collection.size());
		System.out.println("collection"+collection);
		
		
		System.out.println("***************************************************");
		System.out.println("price grater than 45");
		collection.stream().filter(e->e.getPrice()>45).collect(Collectors.toList()).forEach(e->System.out.println("price grater than 45:"+e));
		
		System.out.println("*************************************************");
		
		collection.stream().filter(e->e.getBrand()==null).collect(Collectors.toList()).forEach(e->System.out.println(e));
		System.out.println("any property not having null value");
		
		System.out.println("************************************************");
		
		collection.stream().filter(e->e.getColor()=="blue" || e.getColor()=="orange").collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		System.out.println("***********************************");
		
		min
		max
		2ndmin
		
	}

}
