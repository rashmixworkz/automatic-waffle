package com.xworkz.Bridge.subClass;

import com.xworkz.Bridge.interfaceClass.PostOfficeRules;

public class PostMaster implements PostOfficeRules{
	public static void main(String[] args) {
		PostOfficeRules postOfficeRules=new PostMaster();
		System.out.println(postOfficeRules.monitoring());
		
		PostMaster postMaster=new PostMaster();
		System.out.println(postMaster.lockUpStamps());
		
	}
	
	
	
	@Override
	public boolean returnParcel() {
		
		return false;
	}

	@Override
	public boolean maintainRecords() {
		
		return false;
	}

	@Override
	public boolean lockUpStamps() {
	
		return false;
	}

	@Override
	public boolean readyItemsToDispatch() {
		
		return false;
	}

	@Override
	public boolean monitoring() {
	
		return false;
	}
	
	
}
