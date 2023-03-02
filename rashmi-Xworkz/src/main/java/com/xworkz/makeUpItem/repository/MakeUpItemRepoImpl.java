package com.xworkz.makeUpItem.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.makeUpItem.entity.MakeUpItemEntity;

import net.bytebuddy.build.Plugin.Factory;

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
	
	@Override
		public List<MakeUpItemEntity> findByName(String name) {
			System.out.println("Running find by name in repo");	
			EntityManager factory=	this.entityManagerFactory.createEntityManager();
	try {
	Query query=factory.createNamedQuery("findByName");
	query.setParameter("name", name);
	List<MakeUpItemEntity>  list= query.getResultList();
	return list;
	}
	finally{
		factory.close();
		System.out.println("Release the connection");
	}
			
			
			
			
			
			
			
			
		}

	@Override
	public boolean update(MakeUpItemEntity entity) {
		EntityManager factory=	this.entityManagerFactory.createEntityManager();
		try {
		EntityTransaction transaction = factory.getTransaction();
		transaction.begin();
		factory.merge(entity);
		transaction.commit();
		
		return true;
		}
		finally {
			factory.close();
		}
	}

}
