package com.xwork.Overriding.child;

import com.xwork.Overriding.parent.Venkateshwara;

public class PetrolBunk extends Venkateshwara{

	@Override
	public void petrolImport()
	{
		System.out.println("Overriding import from child class");
		super.petrolImport();
	}

}
