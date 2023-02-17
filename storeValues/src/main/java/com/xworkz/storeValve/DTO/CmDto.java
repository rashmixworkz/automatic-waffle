package com.xworkz.storeValve.DTO;

public class CmDto {
	
	
	private String name;
	
	private String party;
	private String state;
	private String tenure;
	private String portfolio;
	
	public CmDto() {
System.out.println("created" + getClass().getName());
	}

	@Override
	public String toString() {
		return "CmDto [name=" + name + ", party=" + party + ", state=" + state + ", tenure=" + tenure + ", portfolio="
				+ portfolio + "]";
	}
	
	

}
