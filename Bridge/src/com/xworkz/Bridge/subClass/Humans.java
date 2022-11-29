package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.LifeRules;

public class Humans implements LifeRules{
	public static void main(String[] args) {
		LifeRules lifeRules	=new Humans();
		System.out.println(lifeRules.alwaysSmile());
		System.out.println(lifeRules.beKindToOthers());
		System.out.println(lifeRules.forgiveYourSelfAndOthers());
		
		Humans humans=new Humans();
		System.out.println(humans.beKindToOthers());
		System.out.println(humans.alwaysSmile());
	}

	@Override
	public boolean beKindToOthers() {
		return true;
	}

	@Override
	public boolean beKindYourSelfs() {
	return false;
	}

	@Override
	public boolean alwaysSmile() {
	return false;
	}

	@Override
	public boolean forgiveYourSelfAndOthers() {
	return false;
	}

	@Override
	public boolean help() {
	return true;
	}

	

	
}
