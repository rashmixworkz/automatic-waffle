package com.xworkz.collectionDTO.dto;

import java.io.Serializable;

public class AirportDTO implements Serializable{
	
	private String name;
	private String location;
	private int noOfFlights;
	
	public AirportDTO() {
		System.out.println("Running in default consructor");
	}

	public AirportDTO(String name, String location, int noOfFlights) {
		super();
		this.name = name;
		this.location = location;
		this.noOfFlights = noOfFlights;
	}

	@Override
	public String toString() {
		return "Airport [name=" + name + ", location=" + location + ", noOfFlights=" + noOfFlights + ", toString()="
				+ super.toString() + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj!=null) {
			
			if(obj instanceof AirportDTO ) {
				AirportDTO dto=(AirportDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("DTO name is same as another name");
			
				
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

	public int getNoOfFlights() {
		return noOfFlights;
	}

	public void setNoOfFlights(int noOfFlights) {
		this.noOfFlights = noOfFlights;
	}
	

}
