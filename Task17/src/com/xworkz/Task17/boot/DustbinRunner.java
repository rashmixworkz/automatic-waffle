package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dustbin clean=new Dustbin();
		System.out.println(clean.type);
		Dustbin ref=new Dustbin();
		System.out.println(clean.brand);
		Dustbin cleaner=new Dustbin();
		System.out.println(cleaner.size);
		Dustbin safe=new Dustbin();
		System.out.println(safe.height);
		Dustbin level=new Dustbin();
		System.out.println(level.weight);
		Dustbin header=new Dustbin();
		System.out.println(header.color);
		Dustbin footer=new Dustbin();
		System.out.println(footer.shape);
		Dustbin cap=new Dustbin();
		System.out.println(cap.matirial);
		Dustbin fav=new Dustbin();
		System.out.println(fav.width);
		
		Dustbin metal=new Dustbin();
		metal.price=127;
		System.out.println(metal.price);
		
		Dustbin cover=new Dustbin();
		cover.storageLevel="full";
		System.out.println(cover.storageLevel);
		
		Dustbin layer=new Dustbin();
		layer.purpose="to store weast things";
		System.out.println(layer.purpose);
		
		Dustbin open=new Dustbin();
		open.quality="poor";
		System.out.println(open.quality);
		
		Dustbin close=new Dustbin();
		close.noOfHandles=2;
		System.out.println(close.noOfHandles);
		
		Dustbin mark=new Dustbin();
		mark.noOfDoors=1;
		System.out.println(mark.noOfDoors);
		
		Dustbin sticker=new Dustbin();
		sticker.otherNameOfDustbin="dustheap";
		System.out.println(sticker.otherNameOfDustbin);
		
		Dustbin banner=new Dustbin();
		banner.design="round";
		System.out.println(banner.design);
		
	
		

	}

}
