package com.xworkz.collectionDTO.dto;

import java.io.Serializable;

public class PlaceDTO implements Serializable{
	
	
	private String name;
	private String famousFor;
	private int noOfVisitors;
	
	public PlaceDTO() {
		System.out.println("Default constrctor");
	}

	public PlaceDTO(String name, String famousFor,int noOfVisitors) {
		super();
		this.name = name;
		this.famousFor = famousFor;
		this.noOfVisitors = noOfVisitors;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", famousFor=" + famousFor + ", noOfVisitors=" + noOfVisitors
				+ ", toString()=" + super.toString() + "]";
	}
	
	

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		PlaceDTO other = (PlaceDTO) obj;
		if (famousFor == null) {
			if (other.famousFor != null)
				return false;
		} else if (!famousFor.equals(other.famousFor))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public int getNoOfVisitors() {
		return noOfVisitors;
	}

	public void setNoOfVisitors(int noOfVisitors) {
		this.noOfVisitors = noOfVisitors;
	}
	
	
	

}
