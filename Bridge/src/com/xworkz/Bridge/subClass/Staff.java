package com.xworkz.Bridge.subClass;

public class Staff {
	
	private Passenger1  Passenger1Ref;

	public Staff() {
		super();
		System.out.println("running default constrctor");
	}

	public Staff(Passenger1 passenger1Ref) {
		super();
		this.Passenger1Ref =passenger1Ref;
		System.out.println("running parameterised constructor");
	}
	
	public void verifyPassanger() {
		System.out.println("running staff rules");
		if(Passenger1Ref!=null) {
			boolean checking=this.Passenger1Ref.checking();
			double ticket=this.Passenger1Ref.ticket();
			String ticketType=this.Passenger1Ref.ticketType();
			boolean wearMask=this.Passenger1Ref.wearMask();
			if(wearMask==true && checking==true) {
				System.out.println("passenger following metrorules");
			}else {
					System.out.println("passenger not following mertorules");
				}
			if(ticket ==30 && ticketType=="online") {
				System.out.println("passanfer taken ticket through online");
			}else
			{
				System.out.println("not taken ticken ");
			}
			}
		}
	}
	
	
	
	
	


