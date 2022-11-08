package com.xworkz.AccesSpcifiers.boot;

import com.xworkz.AccesSpcifiers.things.Sugar;
import com.xworkz.AccesSpcifiers.things.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		Sugar type = new Sugar();
		type.display();

		Sweet color = new Sweet();
		color.setSweetName("Asha sweets");
		System.out.println(color.getSweetName());
		
		color.setType("Gandhibajar");
		System.out.println(color.getType());

		color.setCost(70.3);
		System.out.println(color.getCost());

		color.manufatured_date=12;
		System.out.println(color.manufatured_date);

		color.weight =12.5;

		System.out.println(color.weight);
		color.color = "White";

		System.out.println(color.color);

		color.isSugar = true;

		System.out.println(color.isSugar);
		color.shopLocation="BTM Layout";
		System.out.println(color.shopLocation);


	}

}
