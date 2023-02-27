package com.xworkz.festivals.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festivals.entity.FestivalEntity;

public class PersistanceEntity {

	public static void main(String[] args) {
		
		EntityManagerFactory  factory=	Persistence.createEntityManagerFactory("com.xworkz.oracle");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=	manager.getTransaction();
		
		FestivalEntity festivalEntity=new FestivalEntity("Dasara", "Karnataka", 9, "Holige", "DurgaDevi");
		FestivalEntity festivalEntity1=new FestivalEntity("Dewali", "Kerala", 4, "MysorePak", "Vishnu");
		FestivalEntity festivalEntity2=new FestivalEntity("Holi", "AndraPradesh", 1, "Lassi", "Kammanna");
		FestivalEntity festivalEntity3=new FestivalEntity("Pongal", "Tamilnadu", 3, "SweetPongal", "SuryaDeva");
		FestivalEntity festivalEntity4=new FestivalEntity("Ganesh Chaturthi", "India", 21, "Modaka", "Ganapati");
		FestivalEntity festivalEntity5=new FestivalEntity("Christmas", "America",2,"cake","Jisus");
		FestivalEntity festivalEntity6=new FestivalEntity("Krishna Janmastami", "Dwraka",2,"Laddu","Krishna");
		FestivalEntity festivalEntity7=new FestivalEntity("Ratha Yatra", "Jagnatha Puri",6,"Ghevar","Jaganath");
		FestivalEntity festivalEntity8=new FestivalEntity("Buddha Jayanthi", "Bodh Gaya",5,"KajuBarfi","Buddha");
		FestivalEntity festivalEntity9=new FestivalEntity("Camel Festival ", " Rajasthan",7,"Kheer","Camel");
		FestivalEntity festivalEntity10=new FestivalEntity("Gudi Padwa", "Maharashra",8,"ShriKhanda","bamboo doll");
		
		FestivalEntity festivalEntity11=new FestivalEntity("Chhath Puja", "Karnataka", 0, "Gajar Ka Halwa", "Sun");
		FestivalEntity festivalEntity12=new FestivalEntity("Kajari", "Panjab", 9, "Rasmalai", "Parvathi");
		FestivalEntity festivalEntity13=new FestivalEntity("NagaChuti", "MadyaPradesh", 11, "Jalebi", "Laxmi");
		FestivalEntity festivalEntity14=new FestivalEntity("TeacherDay", "Gujrat", 23, "GulabJaamun", "Narashima");
		FestivalEntity festivalEntity15=new FestivalEntity("Gouri Pooja", "ChattisGadha", 28, "Patishapta with Strawberry Couli", "Ganapati");
		FestivalEntity festivalEntity16=new FestivalEntity("Karwa Chuta", "Jammu",10,"Rasgulla","Moon");
		FestivalEntity festivalEntity17=new FestivalEntity("Makara Sankrnthi", "Pushkar",7,"Malpua","Surya");
		FestivalEntity festivalEntity18=new FestivalEntity("MahaShiva Ratri", "Goa",22,"Kulfi","Shiva");
		FestivalEntity festivalEntity19=new FestivalEntity("Buddha Jayanthi", "Nepal",57," Bebinca","Buddha");
		FestivalEntity festivalEntity20=new FestivalEntity("Eid Ul Fitr ", " Bhopal",6,"Basundi","Allha");
		FestivalEntity festivalEntity21=new FestivalEntity("Hemis", "Patna",12,"Balushahi","doll");
		FestivalEntity festivalEntity22=new FestivalEntity("Mewar", "Delhi",15,"Badam Ka Halwa","bamboo doll");
		FestivalEntity festivalEntity23=new FestivalEntity("Camel Festival ", " Rajasthan",19,"Kheer","Camel");
		FestivalEntity festivalEntity24=new FestivalEntity("Christmas", "America",26,"cake","Jisus");
		transaction.begin();
		manager.persist(festivalEntity);
	    manager.persist(festivalEntity1);
		manager.persist(festivalEntity2);
		manager.persist(festivalEntity3);
		manager.persist(festivalEntity4);
		manager.persist(festivalEntity5);
		manager.persist(festivalEntity6);
		manager.persist(festivalEntity7);
		manager.persist(festivalEntity8);
		manager.persist(festivalEntity9);
		manager.persist(festivalEntity10);
		manager.persist(festivalEntity11);
	    manager.persist(festivalEntity12);
		manager.persist(festivalEntity13);
		manager.persist(festivalEntity14);
		manager.persist(festivalEntity15);
		manager.persist(festivalEntity16);
		manager.persist(festivalEntity17);
		manager.persist(festivalEntity18);
		manager.persist(festivalEntity19);
		manager.persist(festivalEntity20);
		manager.persist(festivalEntity21);
		manager.persist(festivalEntity22);
		manager.persist(festivalEntity23);
		manager.persist(festivalEntity24);
		transaction.commit();
		manager.close();
		
	}

}
