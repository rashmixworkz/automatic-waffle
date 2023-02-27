package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.forest.entity.ForestEntity;

public class PersistanceRunner {

	public static void main(String[] args) {
		System.out.println("Running in PersistanceRunner");
		EntityManagerFactory entityManagerFactory =	Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager entityManager	=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		ForestEntity forestEntity=new ForestEntity(0,"Bandipura","karanataka","BioSphere",2347D);
		entityTransaction.begin();
		entityManager.persist(forestEntity);
		entityTransaction.commit();
	}

}
