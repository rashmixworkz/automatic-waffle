package com.xworkz.collectionDTO.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectionDTO.dto.AirportDTO;

public class AirportDTORunner {

	public static void main(String[] args) {

		
		AirportDTO dto1=new AirportDTO("Kempegouda Airport", "Devanalli", 120);
		AirportDTO dto2=new AirportDTO("Gaya Airport", "New Dehli", 10);
		AirportDTO dto3=new AirportDTO("Rajiv Gandhi Airport", "Hydrabad", 163);
		AirportDTO dto4=new AirportDTO("Vadodara Airport", "Vadodara", 72);
		AirportDTO dto5=new AirportDTO("Gaya Airport", "New Dehli", 10);
		
		
	
		
		boolean equal=dto1.equals(dto2);
		System.out.println(equal);
		boolean same=dto2.equals(dto5);
		System.out.println(same);
		boolean similar=dto4.equals(dto3);
		System.out.println(similar);
		
		Collection<AirportDTO> contains=new ArrayList<AirportDTO>();
		boolean container=contains.contains(dto5);
		System.out.println("contains references:"+container);
		boolean contain=contains.contains(dto3);
		System.out.println("contains references:"+contain);
		boolean items=contains.contains(dto2);
	    System.out.println("contains references:"+items);
		boolean names=contains.contains(dto1);
		System.out.println("contains references :"+names);
		
		
		
	}

}
