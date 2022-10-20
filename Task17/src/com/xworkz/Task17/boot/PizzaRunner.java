package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Pizza;

public class PizzaRunner {

	public static void main(String[] args) 
	{
		String[] flavours= {"veg loaded","cheese","onion&chees","corn"};
		 String[] paymentType= {"cash","online","upi"};
		 double[] ratings= {4.9,2.3,1.6,6.4,1.28};
		 boolean[] isGood= {true,false,false};
		 String[] reviews= {"good","nice"};
		 
		 Pizza ref=new Pizza("chees",'S',"veg","Laziz",100,flavours,paymentType,ratings,isGood,reviews);
		 
		ref.display();

	}

}
