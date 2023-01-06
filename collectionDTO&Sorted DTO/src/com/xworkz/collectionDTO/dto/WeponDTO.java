package com.xworkz.collectionDTO.dto;

import java.io.Serializable;

public class WeponDTO implements Serializable,Comparable<WeponDTO> {
	
	
	private String name;
	private String madeBy;
	private String madeOn;
	private double price;
	private Type type;
	
	public WeponDTO() {
	
	}

	public WeponDTO(String name, String madeBy, String madeOn, double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
	@Override
	public int hashCode() {
		
		return 26;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeponDTO) {
				WeponDTO dto=(WeponDTO) obj;
				if(dto.name.equals(this.name)&& dto.price==this.price) {
					return true;
				}
				
			}
		}
	
		return false;
	}
	
	@Override
	public int compareTo(WeponDTO o) {
	
		return o.name.compareTo(this.name);
	}

	@Override
	public String toString() {
		return "WeponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	
	
	
	
	

}
