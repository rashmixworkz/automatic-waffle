package com.xworkz.collectionDTO.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectionDTO.dto.PlaceDTO;

public class PlaceDTORunner {

	public static void main(String[] args) {
		PlaceDTO dto1=new PlaceDTO("Udupi", "Krishna Matta", 100000);
		PlaceDTO dto2=new PlaceDTO("Mantralaya", "Rayara Matta", 125462190);
		PlaceDTO dto3=new PlaceDTO("Shivmogga", "Joke falls", 1783);
		PlaceDTO dto4=new PlaceDTO("Udupi", "Krishna Matta", 100000);
		PlaceDTO dto5=new PlaceDTO("Banglore", "Iskon Temple", 1763000);
		
		boolean name=dto1.equals(dto4);
		System.out.println(name);
		
		Collection<PlaceDTO> collectionDto=new ArrayList<PlaceDTO>();
		
		boolean coll=collectionDto.contains(dto5);
		System.out.println(coll);
		boolean coll1=collectionDto.contains(dto4);
		System.out.println(coll1);
		
		boolean coll2=collectionDto.contains(dto3);
		System.out.println(coll2);
		
		
		
		
	

	}

}
