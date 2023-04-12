package com.xworkz.storeValve.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.xworkz.storeValve.DTO.StoreValueDto;
import com.xworkz.storeValve.repository.StroreRepo;
@Service
public class StoreServiceImpl implements StroreService{
	
	@Autowired
	private StroreRepo stroreRepo;

	@Override
	public boolean saveAndValidate(StoreValueDto dto) {
System.out.println("Running save and validate method");
boolean saved=this.stroreRepo.save(dto);
System.out.println("save method"+saved);
return false;
	}

}
