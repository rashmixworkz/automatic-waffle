package com.xworkz.storeValve.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="store_value")
public class StoreValueDto {
	@Column(name="s_id")
	@Id
	private int id;
	
	@Column(name="s_hotelName")
	private String hotelName;
	
	@Column(name="s_dishName")
	private String dishName;
	
	@Column(name="s_price")
	private int price;
	
	@Column(name="s_foodType")
	private String foodType;
	
	@Column(name="s_takeAway")
	private String takeAway;
	
	public StoreValueDto() {
System.out.println("Running default const of StoreValueDto");	
}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getTakeAway() {
		return takeAway;
	}

	public void setTakeAway(String takeAway) {
		this.takeAway = takeAway;
	}

	@Override
	public String toString() {
		return "StoreValueDto [hotelName=" + hotelName + ", dishName=" + dishName + ", price=" + price + ", foodType="
				+ foodType + ", takeAway=" + takeAway + "]";
	}
	
	
	

}
