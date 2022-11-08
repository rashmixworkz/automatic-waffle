package com.xworkz.AccesSpcifiers.boot;

import com.xworkz.AccesSpcifiers.things.Channel;
import com.xworkz.AccesSpcifiers.things.Tv;

public class TvRunner {

	public static void main(String[] args) {
	Channel channel =new Channel();
	channel.display();
	
	Tv rate=new Tv();
	rate.setName("sony");
	System.out.println(rate.getName());
	
	rate.setBrand("philps");	
	System.out.println(rate.getBrand());
	rate.setPrice(34568);
	System.out.println(rate.getPrice());
	
	
	rate.height=5;
	System.out.println(rate.height);
	rate.weight=13.3;
	System.out.println(rate.weight);
	rate.color="black";
	System.out.println(rate.color);
	rate.noOfChannels=456;
	System.out.println(rate.noOfChannels);
	rate.resolition=426;
	System.out.println(rate.resolition);
	
	}

}
