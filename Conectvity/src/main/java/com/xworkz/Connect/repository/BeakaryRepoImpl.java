package com.xworkz.Connect.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.Connect.DTO.BekaryDto;

@Repository
public class BeakaryRepoImpl implements BeakaryRepo {

	@Override
	public boolean save(BekaryDto dto) {
		System.out.println("Running save method in BeakaryRepoImpl");
		return false;
	}

}
