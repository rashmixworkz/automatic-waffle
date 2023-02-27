package com.xworkz.festivals.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FindTotalDaysByName {

	public static void main(String[] args) {
		EntityManagerFactory  factory=	Persistence.createEntityManagerFactory("com.xworkz.oracle");
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createNamedQuery("FindTotalDaysByName");
        Object obj=	query.getSingleResult();
		int days=(int)obj;
		System.out.println(days);
		
		manager.close();
		

	}

}
