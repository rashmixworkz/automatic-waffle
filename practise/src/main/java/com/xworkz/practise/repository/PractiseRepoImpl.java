package com.xworkz.practise.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.practise.DTO.PractiseDto;
@Repository
public class PractiseRepoImpl implements PractiseRepo {

	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean save(PractiseDto dto) {
System.out.println("Running save method in PractiseRepoImpl");	
EntityManager manager=this.entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=manager.getTransaction();
entityTransaction.begin();
manager.persist(dto);
entityTransaction.commit();
manager.close();
return false;
	}

}
