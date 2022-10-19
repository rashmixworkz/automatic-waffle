package com.xworkz.Task17.things;

public class Laptop {
	public String name;
	public String shape;
	public double weight;
	public int warrenty;
	public double width;
	public double[] prices;
	public String[] brands;
	public int[] ramInGb;
	public String[] colors;
	public int[] generation;

	public Laptop(String name, String shape, double weight, int warrenty, double width, double[] prices,
			String[] brands, int[] ramInGb, String[] colors, int[] generation) {
		this.name = name;
		this.shape = shape;
		this.weight = weight;
		this.warrenty = warrenty;
		this.width = width;
		this.prices = prices;
		this.brands = brands;
		this.ramInGb = ramInGb;
		this.colors = colors;
		this.generation = generation;

		System.out.println("constructor with 5 variables and arrays");
	}

	public void show() {
		System.out.println("The name of the laptop is:" + name);
		System.out.println("The shape of the laptop is:" + shape);
		System.out.println("The weight of the laptop is:" + weight);
		System.out.println("The warrenty of the laptop is:" + warrenty);
		System.out.println("The width of the laptop is:" + width);

		for (int i = 0; i < this.prices.length; i++) {
			double string = this.prices[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.brands.length; i++) {
			String string = this.brands[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.ramInGb.length; i++) {
			int string = this.ramInGb[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.colors.length; i++) {
			String string = this.colors[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.generation.length; i++) {
			int string = this.generation[i];
			System.out.println(string);

		}

	}
}
