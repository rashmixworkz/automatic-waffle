package com.xworkz.Connect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.Connect.DTO.BekaryDto;
import com.xworkz.Connect.repository.BeakaryRepo;
@Service
public class BeakaryServiceImpl implements BeakaryService{
	@Autowired
	private BeakaryRepo beakaryRepo;

	@Override
	public boolean validAndSave(BekaryDto dto) {
		System.out.println("Running save method in BeakaryServiceImpl");
		boolean saved=this.beakaryRepo.save(dto);
		System.out.println("Saved in repo: "+saved);
		return false;
	}

}
