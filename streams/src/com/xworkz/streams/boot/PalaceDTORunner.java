package com.xworkz.streams.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.streams.DTO.PalaceDTO;

public class PalaceDTORunner {

	public static void main(String[] args) {
	
		Collection<PalaceDTO> dto=new ArrayList();
		dto.add(new PalaceDTO("Mysore","Mysore","RASHMI",false,100.0));
		dto.add(new PalaceDTO("Bangluru","Bangluru","Prahlad",true,50.1));
		dto.add(new PalaceDTO("Vijayanagar","Hampi","Shwetha",false,40.6));
		dto.add(new PalaceDTO("Jagmohana Palace","Mysore","Nandini",true,20.9));
		dto.add(new PalaceDTO("Lalith Mahal","Mysore","Vijayalaxmi",false,90.3));
		
		
		dto
		.stream()
		.filter(ele->!ele.isDestroyed())
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
	}

}
