package com.xworkz.bigBasket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bigBasket.DTO.BigBasketDto;
import com.xworkz.bigBasket.repo.BigBasketRepo;
@Service
public class BigBasketServiceImpl implements BigBasketService{
	
	@Autowired
	private BigBasketRepo bigBasketRepo;

	@Override
	public boolean saveAndValidate(BigBasketDto dto) {
System.out.println("Running saveAndValidate in BigBasketServiceImpl");

boolean saved=this.bigBasketRepo.save(dto);
System.out.println("saved"+saved);
return false;
	}

}
