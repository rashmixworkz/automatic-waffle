package com.xworkz.streams.DTO;

import java.io.Serializable;

public class PalaceDTO implements Serializable {
	
	private String name;
	private String location;
	private String builtBy;
	private boolean isDestroyed;
	private double visitingFees;
	
	public PalaceDTO() {
		System.out.println("Default constructor");
	}

	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, double visitingFess) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.isDestroyed = isDestroyed;
		this.visitingFees = visitingFees;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", isDestroyed="
				+ isDestroyed + ", visitingFees=" + visitingFees + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof PalaceDTO ) {
				PalaceDTO dto=(PalaceDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("Name matches");
					return true;
				}
			}
		}
		return false;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return isDestroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.isDestroyed = isDestroyed;
	}

	public double getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(double visitingFees) {
		this.visitingFees = visitingFees;
	}
	
	
	

}
