package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Fridge;

public class FridgeRunner {
	
	public static void main(String[] args)
	{
		String[] colors= {"red","black","gray","white"};
		 String[] paymentType= {"cash","online","upi"};
		 double[] ratings= {4.9,2.3,1.6,6.4,1.28};
		 boolean[] isGood= {true,false,false};
		 String[] reviews= {"good","nice"};
		 
		 Fridge ref=new Fridge("LG","Pune","double Door",30,"steel",20,colors,paymentType,ratings,isGood,reviews);
		 
		ref.display();
	}
	

}
