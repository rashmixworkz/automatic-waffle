package com.xworkz.Task17.boot;


import com.xworkz.Task17.things.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DistrictCollector dc=new DistrictCollector();
		System.out.println("name of the district collector is:"+dc.name);
		System.out.println("age:"+dc.age);
		System.out.println("place:"+dc.district);
		System.out.println("DC Batch Number is:"+dc.batchNo);
		dc.name="Shri.M.Sundaresh Babu";
		dc.age=28;
		dc.district="koppal";
		dc.batchNo=12;
		System.out.println("name of the district collector is:"+dc.name);
		System.out.println("age:"+dc.age);
		System.out.println("place:"+dc.district);
		System.out.println("DC Batch Number is:"+dc.batchNo);

	}

}
