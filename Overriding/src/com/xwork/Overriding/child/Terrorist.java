package com.xwork.Overriding.child;

import com.xwork.Overriding.parent.Kasab;

public class Terrorist extends Kasab {
	
	public void moneyLaundering()
	{
		System.out.println("money laundering from child class");
		super.moneyLaundering();
	}

	
}
