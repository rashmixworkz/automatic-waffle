package com.xworkz.incomplete.boot;

import com.xworkz.incomplete.things.Atm;
import com.xworkz.incomplete.things.SbiAtm;

public class AtmRunner {

	public static void main(String[] args) 
	{
Atm atm1=new SbiAtm();
atm1.checkbalance();
atm1.withdraw();
	}

}
