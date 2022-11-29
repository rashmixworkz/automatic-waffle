package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.XworkzRules;

public class Trainees implements  XworkzRules{
	public static void main(String[] args) {
		
	XworkzRules xworkzRules=new Trainees();
	System.out.println(xworkzRules.attendMock());
	System.out.println(xworkzRules.completeTheGivenTask());
	
	Trainees Trainees=new Trainees();
	System.out.println(Trainees.attendPresentation());
	System.out.println(Trainees.bringOwnLaptop());
	}

	@Override
	public int attendance() {
		
		return 0;
	}

	@Override
	public String attendPresentation() {

		return null;
	}

	@Override
	public boolean bringOwnLaptop() {
	
		return false;
	}

	@Override
	public boolean completeTheGivenTask() {
	
		return false;
	}

	@Override
	public boolean attendMock() {

		return false;
	}
	
}
