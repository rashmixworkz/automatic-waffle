package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
	
		Sweet sweet=new Sweet("kaju barfi");
		sweet.quantity=37;
		sweet.price=90;
		sweet.display();
		
		sweet.displayTotalQuantity();

	}

}
