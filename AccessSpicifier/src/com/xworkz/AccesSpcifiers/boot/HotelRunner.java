package com.xworkz.AccesSpcifiers.boot;

import com.xworkz.AccesSpcifiers.things.Hotel;
import com.xworkz.AccesSpcifiers.things.Parcel;

public class HotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel  parse=new Parcel();
		parse.dispaly();
		
		Hotel food=new Hotel();
				
		food.setHotalType("resturent");
		System.out.println(food.getHotalType());
		
		food.setNoOfServers(123);
		System.out.println(food.getNoOfServers());
		
		food.name="Udupi";
		System.out.println(food.name);
		food.noOfCustomer=1245;
		System.out.println(food.noOfCustomer);
				
		
	}

}
