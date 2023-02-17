package com.xworkz.bigBasket.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="big_basket")
public class BigBasketDto {
	@Id
	@Column(name="b_id")
	private int id;
	@Column(name="b_name")
	private String name;
	@Column(name="b_item")
	private String item;
	@Column(name="b_area")
	private String area;
	@Column(name="b_noOfEmployes")
	private String noOfEmployes;
	@Column(name="b_totalItemPrice")
	private int totalItemPrice;
	@Column(name="b_email")
	private String email;
	@Column(name="b_password")
	private String password;
	@Column(name="b_mangerName")
	private String mangerName;
	@Column(name="b_noOfVarityItems")
	private String noOfVarityItems;
	@Column(name="b_service")
	private String service;

	@Override
	public String toString() {
		return "BigBasketDto [id=" + id + ", name=" + name + ", item=" + item + ", area=" + area + ", noOfEmployes="
				+ noOfEmployes + ", totalItemPrice=" + totalItemPrice + ", email=" + email + ", password=" + password
				+ ", mangerName=" + mangerName + ", noOfVarityItems=" + noOfVarityItems + ", service=" + service + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNoOfEmployes() {
		return noOfEmployes;
	}

	public void setNoOfEmployes(String noOfEmployes) {
		this.noOfEmployes = noOfEmployes;
	}

	public int getTotalItemPrice() {
		return totalItemPrice;
	}

	public void setTotalItemPrice(int totalItemPrice) {
		this.totalItemPrice = totalItemPrice;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMangerName() {
		return mangerName;
	}

	public void setMangerName(String mangerName) {
		this.mangerName = mangerName;
	}

	public String getNoOfVarityItems() {
		return noOfVarityItems;
	}

	public void setNoOfVarityItems(String noOfVarityItems) {
		this.noOfVarityItems = noOfVarityItems;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	
	
	

}
