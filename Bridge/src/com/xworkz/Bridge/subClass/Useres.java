package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.InstagramRules;

public class Useres implements InstagramRules{
	public static void main(String[] args) {
		InstagramRules instagramRules=new Useres();
		System.out.println(instagramRules.dontBehaveLikeBot());
		Useres Useres=new Useres();
		System.out.println(Useres.dontUseHashTags());
	}

	@Override
	public boolean onlyUseTrustedPostingApp() {
		return false;
	}

	@Override
	public boolean dontUseHashTags() {
		return false;
	}

	@Override
	public boolean dontBehaveLikeBot() {
		return false;
	}

	@Override
	public boolean followContentRules() {
		return false;
	}

	@Override
	public boolean underStandForbiddenRules() {
		return false;
	}
	
	
	

}
