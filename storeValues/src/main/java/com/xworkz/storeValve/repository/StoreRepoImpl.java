package com.xworkz.storeValve.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.storeValve.DTO.StoreValueDto;
@Repository
public class StoreRepoImpl implements StroreRepo {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public StoreRepoImpl() {
System.out.println("default const of StoreRepoImpl");	}

	@Override
	public boolean save(StoreValueDto dto) {
System.out.println("Running save method in StoreRepoImpl");

EntityManager manager=this.entityManagerFactory.createEntityManager();
EntityTransaction transaction=manager.getTransaction();
transaction.begin();
manager.persist(dto);
transaction.commit();
manager.close();
return false;
	}
	

}
