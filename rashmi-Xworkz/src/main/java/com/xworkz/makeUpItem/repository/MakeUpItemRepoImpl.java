package com.xworkz.makeUpItem.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.makeUpItem.entity.MakeUpItemEntity;

@Repository
public class MakeUpItemRepoImpl implements MakeUpItemRepo {
@Autowired
	private EntityManagerFactory entityManagerFactory;

	public MakeUpItemRepoImpl() {
		System.out.println("Running default const of MakeUpItemRepoImpl in MakeUpItemRepoImpl");
	}

	@Override
	public boolean save(MakeUpItemEntity entity) {
		System.out.println("Running save method in MakeUpItemRepoImpl");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		entityManager.close();
		return true;
	}

	@Override
	public MakeUpItemEntity findById(int id) {
		System.out.println("Find id in repo..." + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		MakeUpItemEntity mm = manager.find(MakeUpItemEntity.class, id);
		manager.close();
		return mm;
	}

}
