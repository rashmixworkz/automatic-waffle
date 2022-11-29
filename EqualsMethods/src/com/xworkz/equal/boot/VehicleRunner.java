package com.xworkz.equal.boot;

import com.xworkz.equal.things.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.setBrand(null);
		vehicle.setColor(null);
		vehicle.setPrice(0);
		vehicle.setWeight(0);
		vehicle.setWashable(null);
		vehicle.setType(null);
		vehicle.setWarrenty(0);
		vehicle.setHeight(0);
		vehicle.setQuality(false);
		vehicle.setShopName(null);
		
		Vehicle vehicle2=new Vehicle("Suzuki","red",120000,234.74,"yes","seat",10,23,true,"HondaShoroom");
		
		System.out.println(vehicle);
		System.out.println(vehicle2);
		
		boolean ref=vehicle.equals(vehicle2);
		System.out.println(ref);
		
		

	}

}
