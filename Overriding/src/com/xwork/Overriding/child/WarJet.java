package com.xwork.Overriding.child;

import com.xwork.Overriding.parent.Rafel;

public class WarJet extends Rafel{
	
	public void strikes()
	{
		System.out.println("strikes from parent class");
		super.strikes();
	}

}
