package com.xworkz.customexception.boot;



import java.time.LocalDateTime;

import com.xworkz.customexception.dto.IplDTO;
import com.xworkz.customexception.repository.IplRepository;
import com.xworkz.customexception.repository.IplRepositoryImplementations;

public class IplDTORunner {

	public static void main(String[] args) {
	
		IplRepository repository=new IplRepositoryImplementations();
		
		IplDTO dto1=new IplDTO();
		
		dto1.setAlive(false);
		dto1.setCaptainName("virat");
		dto1.setPlace("banglore");
		dto1.setNoOfPlayers(11);
		dto1.setTeamName("RCB");
		
		
		dto1.setCreatedBy("system");
		dto1.setCreatedDate(LocalDateTime.now());
		repository.create(dto1);
		

	}

}
