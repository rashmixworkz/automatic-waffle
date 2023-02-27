package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FindByName {

	public static void main(String[] args) {
		System.out.println("Running FindByName");
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createNamedQuery("findByName");
		Object object=query.getSingleResult();
		Double Area=(Double)object;
		System.out.println(Area);
		manager.close();	
	}
	

}
