package com.xwork.Overriding.child;

import com.xwork.Overriding.parent.HumanResource;

public class Vinay extends HumanResource{
	
@Override
	public void hire()
	{
		super.hire();
		System.out.println("hireing from child class");
	}

}
