package com.xwork.Overriding.boot;

import com.xwork.Overriding.child.PetrolBunk;

public class VenkateshwaraRunner {

	public static void main(String[] args) {
	
		PetrolBunk petrol=new PetrolBunk();
		
		petrol.petrolImport();
		petrol.petrolExport();

	}

}
