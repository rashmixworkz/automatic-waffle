package com.xworkz.streams.DTO;

import java.io.Serializable;

public class ApplicationDtO implements Serializable{
	
	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private double price;
	
	public ApplicationDtO() {
		System.out.println("default");
	}

	public ApplicationDtO(String name, double version, boolean free, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ApplicationDtO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}
@Override
public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof ApplicationDtO ) {
			ApplicationDtO dto=(ApplicationDtO)obj;
			if(dto.name.equals(this.name)) {
				System.out.println("name matches");
				return true;
			}
			
		}
	}
	
	return false;
}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
