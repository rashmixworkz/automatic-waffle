package com.xworkz.Spring_beanTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class NewsPaperUsingAutowired {
	
	@Autowired
	@Qualifier("newsPaperId")
	private String id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("owner")
	private String language;
	private double price;
	
	public NewsPaperUsingAutowired() {
		System.out.println("default cons");
	}
	
	public NewsPaperUsingAutowired(String id, @Qualifier("paperName") String name,  @Qualifier("owner") String ownerName, String language, double price) {
		super();
		System.out.println("papername and owner is created using const");
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.language = language;
		this.price = price;
	}


	@Override
	public String toString() {
		return "NewsPaperUsingAutowired [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language="
				+ language + ", price=" + price + "]";
	}


	public double getPrice() {
		return price;
	}

@Autowired
@Qualifier("cost")
	public void setPrice(double price) {
	
		this.price = price;
		System.out.println("price created using setter");
	}
	
	
	
	
	
	
	

}
