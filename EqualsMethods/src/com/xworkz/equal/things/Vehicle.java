package com.xworkz.equal.things;

public class Vehicle {
	private String Brand;
	private String color; 
	private double price;
	private double weight;
	private String washable;
	private String type;
	private int warrenty;
	private int height;
	private boolean quality;
	private String shopName;
	
	public Vehicle()
	{
		System.out.println("Default constrctor");
	}

	public Vehicle(String brand, String color, double price, double weight, String washable, String type, int warrenty,
			int height, boolean quality, String shopName) {
		super();
		this.Brand = brand;
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.washable = washable;
		this.type = type;
		this.warrenty = warrenty;
		this.height = height;
		this.quality = quality;
		this.shopName = shopName;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in institute");
		if (other instanceof Vehicle )
		{
			System.out.println("other is Vehicle ,can check the proprties ");
			Vehicle casted = (Vehicle) other ;
		
			if (this.Brand.equals(casted.Brand)&& this.color.equals(casted.color)&& this.shopName.equals(casted.shopName)) {
				System.out.println("Name ,color,shopname are same");
				
				return true;
		} 
		}
			else { 
			System.err.println("other is not name&color&shopname,can not check the proprties");
			
		}
			return false;

	}
	
	@Override
	public String toString() {
		return "Vehicle [Brand=" + Brand + ", color=" + color + ", price=" + price + ", weight=" + weight
				+ ", washable=" + washable + ", type=" + type + ", warrenty=" + warrenty + ", height=" + height
				+ ", quality=" + quality + ", shopName=" + shopName + "]";
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getWashable() {
		return washable;
	}

	public void setWashable(String washable) {
		this.washable = washable;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	
	

}
