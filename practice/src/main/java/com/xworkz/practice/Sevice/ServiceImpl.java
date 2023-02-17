package com.xworkz.practice.Sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.practice.Dto.StudentDto;
import com.xworkz.practice.Repository.Repo;


@Service
public class ServiceImpl implements Service {

	
	
	@Autowired
	private Repo repo;
	
	public ServiceImpl() {
System.out.println("created" + getClass().getName());
	}
	@Override
	public boolean saveAndValidate(StudentDto dto) {
		System.out.println("Running saveAndValidate in sevice");
		boolean saved=this.repo.save(dto);
		System.out.println("saved"+saved);
		return false;
	}

}
