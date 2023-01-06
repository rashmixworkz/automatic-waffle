package com.xworkz.collection.collectionClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {
		
		Integer no1=7;
		Integer no2=3;
		Integer no3=5;
		Integer no4=8;
		Integer no5=1;
		Integer no6=10;
		Integer no7=12;
		Integer no8=17;
		Integer no9=0;
		Integer no10=13;
		Integer no11=15;
		Integer no12=8;
		Integer no13=11;
		Integer no14=14;
		Integer no15=16;

		
		Collection<Integer> shoeNo=new ArrayList<Integer>();
		shoeNo.add(no15);
		shoeNo.add(no14);
		shoeNo.add(no13);
		shoeNo.add(no12);
		shoeNo.add(no11);
		shoeNo.add(no10);
		shoeNo.add(no9);
		shoeNo.add(no8);
		shoeNo.add(no7);
		shoeNo.add(no6);
		shoeNo.add(no5);
		shoeNo.add(no4);
		shoeNo.add(no3);
		shoeNo.add(no2);
		shoeNo.add(no1);
		System.out.println(shoeNo);
		System.out.println("total size:"+shoeNo.size());
		
		System.out.println("***********FOREACH LOOP*************");
		for(Integer nos:shoeNo) {
			System.out.println(nos);
		}
		System.out.println("*************ITERATOR LOOP*******************");
	Iterator<Integer> size=shoeNo.iterator();
	while (size.hasNext()) {
		Integer integer =size.next();
		System.out.println(integer);
		
	}
		
		
		

	}

}
