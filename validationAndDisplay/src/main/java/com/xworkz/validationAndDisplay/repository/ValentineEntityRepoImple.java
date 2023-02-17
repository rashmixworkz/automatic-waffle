package com.xworkz.validationAndDisplay.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.validationAndDisplay.entity.ValentineEntity;
@Repository
public class ValentineEntityRepoImple implements ValentineEntityRepo{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public ValentineEntityRepoImple() {
		System.out.println("created" + getClass().getName());

	}

	@Override
	public boolean save(ValentineEntity entity) {
	System.out.println("Running ValentineEntityRepoImple");
	EntityManager manager=this.entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=manager.getTransaction();
	entityTransaction.begin();
	manager.persist(entity);
	entityTransaction.commit();
	manager.close();
		return true;
	}
	
	

}
