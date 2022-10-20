package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Mobile;

public class MobileRunner {

	public static void main(String[] args) 
	{
		String[] colors= {"red","black","gray","white"};
		 String[] paymentType= {"cash","online","upi"};
		 double[] ratings= {4.9,2.3,1.6,6.4,1.28};
		 boolean[] isGood= {true,false,false};
		 String[] reviews= {"good","nice"};
		 
		 Mobile ref=new Mobile("Redmi","Pune","Screen touch","Android",10000,8,colors,paymentType,ratings,isGood,reviews);
		 
		ref.display();



	}

}
