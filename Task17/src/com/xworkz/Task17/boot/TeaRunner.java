package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Tea;

public class TeaRunner
{

	public static void main(String[] args)
	{
	
		Tea powder=new Tea();
		powder.shopName="Prakash Tea center";
      System.out.println("Name of the tea shop:"+powder.shopName);
      
      
      Tea location=new Tea();
      location.area="Basavangudi";
       System.out.println("location of the tea shop:"+location.area);
    
      Tea table=new Tea();
      table.noOfChairs=15;
     System.out.println("Name of the tea shop:"+table.noOfChairs);
  
      Tea box=new Tea();
      box.noOfContainers=10;
   System.out.println("Name of the tea shop:"+box.noOfContainers);

     Tea shop=new Tea();
     shop.shopOwnerName="Ganesh";
    System.out.println("Name of the tea shop:"+shop.shopOwnerName);

    Tea milk=new Tea();
    milk.typeOfShop="Tea Cafe";
   System.out.println("Name of the tea shop:"+milk.typeOfShop);
   
   
   Tea sweeper=new Tea();
   sweeper.noOfEmployes=20;
 System.out.println("Name of the tea shop:"+sweeper.noOfEmployes);
 
 
 Tea people=new Tea();
 people.ingredients="Tea powder,Milk,Water,Sugar";
 System.out.println("Name of the tea shop:"+people.ingredients);
 
 
 
 Tea fav=new Tea();
 System.out.println(fav.teaRate);
 
 
 Tea type=new Tea();
 System.out.println(type.typeOfTea);
 Tea feedback=new Tea();
 System.out.println(feedback.rating);
 Tea brand=new Tea();
 System.out.println(brand.teaRate);
 Tea matrial=new Tea();
 System.out.println(matrial.review);
 Tea sweet=new Tea();
 System.out.println(sweet.paymentType);
 Tea spices=new Tea();
 System.out.println(spices.profitPricePerDay);
 Tea lays=new Tea();
 System.out.println(lays.losePricePerDay);
 Tea place=new Tea();
 System.out.println(place.branchs);
 Tea flavour=new Tea();
 System.out.println(flavour.otherDrinks);
 Tea pay=new Tea();
 System.out.println(pay.teaPowderBrand);
 
 
	}
	
	

}
