package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.MetroRules;

public class Travellers implements MetroRules{
	
	public static void main(String[] args) {
		MetroRules metroRules=new Travellers();
		System.out.println(metroRules.checking());
		System.out.println(metroRules.scanBags());
		System.out.println(metroRules.takeTicket());
		
		Travellers travellers=new Travellers();
		
		System.out.println(travellers.takeTicket());
		System.out.println(travellers.showTicketCoins());
		System.out.println(travellers.scanBags());
	

	

	}
	@Override
	public boolean wearMask() {

		return false;
	}

	@Override
	public boolean takeTicket() {

		return false;
	}

	@Override
	public boolean scanBags() {
		
		return false;
	}

	@Override
	public boolean checking() {

		return false;
	}

	@Override
	public boolean showTicketCoins() {

		return false;
	}

}
