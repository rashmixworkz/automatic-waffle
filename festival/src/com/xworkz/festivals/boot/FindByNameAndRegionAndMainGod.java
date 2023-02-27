package com.xworkz.festivals.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festivals.entity.FestivalEntity;

public class FindByNameAndRegionAndMainGod {

	public static void main(String[] args) {
		
		EntityManagerFactory  factory=	Persistence.createEntityManagerFactory("com.xworkz.oracle");
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createNamedQuery("findByNameAndRegionAndMainGod");
		query.setParameter("n", "Ratha Yatra");
		query.setParameter("rea","Jagnatha Puri");
		query.setParameter("god","Jaganath");
		Object obj=	query.getSingleResult();
		FestivalEntity entity1=(FestivalEntity)obj;
		System.out.println(entity1);
		manager.close();
		

	}

}
