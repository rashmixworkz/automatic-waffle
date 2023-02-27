package com.xworkz.festivals.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festivals.entity.FestivalEntity;

public class FindByIdAndName {

	public static void main(String[] args) {
		EntityManagerFactory  factory=	Persistence.createEntityManagerFactory("com.xworkz.oracle");
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createNamedQuery("findByIdAndName");
		query.setParameter("num", 3);
		query.setParameter("n","Holi");
		Object obj=	query.getSingleResult();
		FestivalEntity entity=(FestivalEntity)obj;
		System.out.println(entity);
		manager.close();
		
	}

}
