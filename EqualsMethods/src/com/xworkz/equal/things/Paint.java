package com.xworkz.equal.things;

public class Paint {
	private String Brand;
	private String color; 
	private double price;
	private double quantity;
	private String washable;
	private String type;
	private int warrenty;
	private String finish;
	private boolean quality;
	private String use;
	
	public Paint()
	{
		System.out.println("default constuctor");
	}

	public Paint(String brand, String color, double price, double quantity, String washable, String type, int warrenty,
			String finish, boolean quality, String use) {
		super();
		this.Brand = brand;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
		this.washable = washable;
		this.type = type;
		this.warrenty = warrenty;
		this.finish = finish;
		this.quality = quality;
		this.use = use;
	}


	

@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in paint");
		if (other instanceof Paint )
		{
			System.out.println("other is paint,can check the proprties ");
		Paint casted = (Paint) other ;
		
			if (this.Brand.equals(casted.Brand)) {
				System.out.println("brand is same");
				return true;
		} 
		}
			else { 
			System.err.println("other is not paint,can't check the proprties");
		}
			return false;

	}
	




@Override
public String toString() {
	return "Paint [Brand=" + Brand + ", color=" + color + ", price=" + price + ", quantity=" + quantity
			+ ", washable=" + washable + ", type=" + type + ", warrenty=" + warrenty + ", finish=" + finish
			+ ", quality=" + quality + ", use=" + use + "]";
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
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

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}
	

	

}
