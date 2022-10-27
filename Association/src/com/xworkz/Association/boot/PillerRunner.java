package com.xworkz.Association.boot;


import com.xworkz.Association.things.Piller;

public class PillerRunner {

	public static void main(String[] args) 
	{
	
   Piller piller=new Piller(1,"Rajajinaga","square",156.67,true);
   piller.showOff();
   
   piller.name.showoff();
   
	}

}
