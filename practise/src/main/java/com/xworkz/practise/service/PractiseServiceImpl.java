package com.xworkz.practise.service;

import javax.persistence.Access;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.practise.DTO.PractiseDto;
import com.xworkz.practise.repository.PractiseRepo;
@Service
public class PractiseServiceImpl implements PractiseService{

	@Autowired
	private PractiseRepo repo;
	
	
	@Override
	public boolean saveAndValidate(PractiseDto dto) {
System.out.println("Running saveAndValidate method in PractiseServiceImpl");	
boolean saved=this.repo.save(dto);
System.out.println("saved"+saved);
return false;
	}
	

}
