package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Bangle;

public class BangleRunner {

	public static void main(String[] args)
	{
		String[] colors= {"white","red","blue",""};
		 String[] paymentType= {"cash","online","upi"};
		 String[] matirials= {"glass","fire"};
		 boolean[] isGood= {true,false,false};
		 String[] reviews= {"good","nice"};
		 
		 Bangle ref=new Bangle("Round",'S',"glass","Laziz",30.0,colors,paymentType,matirials,isGood,reviews);
		 
		ref.display();
	}

}
