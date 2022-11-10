package com.xwork.Overriding.child;

import com.xwork.Overriding.parent.Pg;

public class Jail extends Pg{
	
	public void staying()
	{
		System.out.println("staying from parent class");
		super.staying();
	}
	

}
