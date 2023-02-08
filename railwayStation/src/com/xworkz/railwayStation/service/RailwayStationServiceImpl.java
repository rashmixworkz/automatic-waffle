package com.xworkz.railwayStation.service;

import com.xworkz.railwayStation.dto.RailwayStationDTO;
import com.xworkz.railwayStation.exception.StorageFullException;
import com.xworkz.railwayStation.repository.RailwayStationRepository;

public class RailwayStationServiceImpl implements RailwayStationService{
	
	private RailwayStationRepository railwayStationRepository;
	
	public void RailwayStationRepositoryImpl(RailwayStationRepository railwayStationRepository) {
		this.railwayStationRepository=railwayStationRepository;
		System.out.println("Running in RailwayStationRepositoryImplementation");
		
	}

	@Override
	public boolean saveAndValidate(RailwayStationDTO dto) {
		System.out.println("Running in RailwayStationServiceImpl");
		String name=dto.getName();
		int noOfPlatforms=dto.getNoOfPlatforms();
		String area=dto.getArea();
		double platformTicketPrice=dto.getPlatformTicketPrice();
		
		boolean validName=false;
		boolean validPlatform=false;
		boolean validArea=false;
		boolean validPrice=false;
		
	if(name!=null && name.length()>=3 && name.length()<=20) {
		System.out.println("Railway station name is valid"+name);
		validName=true;
	}else {
		System.out.println("Railway station name is not valid");
	}
	if(noOfPlatforms!=0 && noOfPlatforms>=1) {
		System.out.println("Number of platform are valid"+noOfPlatforms);
		validPlatform=true;
	}else {
		System.out.println("Number of platform are not valid ");
	}
	if(area!=null && area.length()>=3 && area.length()<=20) {
		System.out.println("Area is valid"+area);
		validArea=true;
	}else {
		System.out.println("Area is not valid");
	}
	if(platformTicketPrice!=0 && platformTicketPrice>=1) {
		System.out.println("PlatformTicketPrice is valid"+platformTicketPrice);
		validPrice=true;
	}else {
		System.out.println("PlatformTicketPrice is not valid");
	}
	if(validName && validPlatform && validArea && validPrice) {
		System.out.println("fields are valid and can save");
		boolean storedValue=railwayStationRepository.store(dto);
		System.out.println("storage values"+storedValue);
		return storedValue;
	}
	return validPrice;
		
		
	}											
	
	

}
