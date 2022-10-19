package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		
		
		 double[] prices= {40000,34000,7800,45000};
		 String[] brands= {"Dell","HP","acer"};
		 int[] ramInGb= {4,8,16,64,128};
		 String[] colors= {"black","red","white"};
		 int[] generation= {3,5,10};
		 Laptop ref=new Laptop("LENOVA","Square",15.1,3,18.7,prices,brands,ramInGb,colors,generation);
		 
		 ref.show();
	}

}
