package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Airport;

public class AirportRunner {

	public static void main(String[] args) {
		String[] colors= {"white","red","blue",""};
		 String[] paymentType= {"cash","online","upi"};
		 String[] root= {"banglore","Hydrabad"};
		 boolean[] isGood= {true,false,false};
		 String[] reviews= {"good","nice"};
		 
		 Airport ref=new Airport("Kemprgowda","devnalli",20,3000.45,35678,colors,paymentType,root,isGood,reviews);
		 
		ref.display();
	}


	}


