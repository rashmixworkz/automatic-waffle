package com.xworkz.railwayStation.dto;

public class RailwayStationDTO extends AbstactAuditDTO{
	
	private String name;
	private int noOfPlatforms; 
	private String area;
	private double platformTicketPrice;
	
	
	public RailwayStationDTO() {
		System.out.println("Running in default constructor");
	}
	
	
	public RailwayStationDTO(String name,int noOfPlatforms,String area,double platformTicketPrice) {
		super();
		System.out.println("Running in parameterized constructor");
		this.name=name;
		this.noOfPlatforms=noOfPlatforms;
		this.area=area;
		this.platformTicketPrice=platformTicketPrice;
		
		
	}

	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(double platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}
	
	
}
