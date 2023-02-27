package com.xworkz.airoplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.airoplane.Entity.AiroplaneEntity;

@Repository
public class AirplaneRepoImple implements AiroplaneRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AirplaneRepoImple() {
		System.out.println("Running AirplaneRepoImple in RepoImple");
	}

	@Override
	public boolean save(AiroplaneEntity entity) {
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		entityManager.close();
		return true;
	}

	@Override
	public AiroplaneEntity findBy(int id) {
		System.out.println("Find by id in repo..." + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		AiroplaneEntity am = manager.find(AiroplaneEntity.class, id);
		manager.close();
		return am;
	}

}
