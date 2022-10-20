package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Dress;

public class DressRunner {

	public static void main(String[] args)
	{
		String[] colors= {"red","black","gray","white"};
		 String[] paymentType= {"cash","online","upi"};
		 double[] ratings= {4.9,2.3,1.6,6.4,1.28};
		 boolean[] isGood= {true,false,false};
		 String[] reviews= {"good","nice"};
		 
		 Dress ref=new Dress("Frock","Pune","long dress",15,"cotton",'M',colors,paymentType,ratings,isGood,reviews);
		 
		ref.display();


	}

}
