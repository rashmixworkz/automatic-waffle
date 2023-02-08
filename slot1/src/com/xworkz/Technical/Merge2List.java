package com.xworkz.Technical;

import java.util.ArrayList;
import java.util.List;

public class Merge2List {
	public static void main(String[] args) {
		
	
	List<Integer> list1=new ArrayList<Integer>();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	list1.add(4);
	list1.add(5);
	
	List<Integer> list2=new ArrayList<Integer>();
	list2.add(6);
	list2.add(7);
	list2.add(8);
	list2.add(9);
	list2.add(10);
	
	List<Integer> mergedList=new ArrayList<Integer>();
	mergedList.addAll(list1);
	mergedList.addAll(list2);
	
	System.out.println("List1 elements:"+list1);
	System.out.println("List2 elements:"+list2);
	System.out.println("Merged list:" +mergedList);
	

}
}
