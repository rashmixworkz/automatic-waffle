package com.xworkz.equal.boot;

import com.xworkz.equal.things.Paint;

public class PaintRunner {

	public static void main(String[] args) 
	{
		
		Paint paint=new Paint();
		paint.setBrand("Asian Paints");
		paint.setColor("Blue");
		paint.setFinish("Glossy");
		paint.setPrice(2450);
		paint.setQuality(true);
		paint.setQuantity(10);
		paint.setType("Emulsion");
		paint.setUse("internal");
		paint.setWarrenty(3);
		paint.setWashable("No");
		
		Paint paint2=new Paint("Berger","Pink",2587,20,"Yes","Enemal",4,"HighGloss",true,"External");
		System.out.println(paint);
		System.out.println(paint2);
		
boolean ref=paint.equals(paint2);
System.out.println(ref);
		
		

	}

}
