package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Mixie;

public class MixieRunner {

	public static void main(String[] args) 
	{
	
		String[] colors= {"red","black","gray","white"};
		 String[] paymentType= {"cash","online","upi"};
		 double[] ratings= {4.9,2.3,1.6,6.4,1.28};
		 boolean[] isGood= {true,false,false};
		 String[] reviews= {"good","nice"};
		 
		 Mixie ref=new Mixie("butterfly","Pune","single","butterfly",1000.0,"full",colors,paymentType,ratings,isGood,reviews);
		 
		ref.display();

	}

}
