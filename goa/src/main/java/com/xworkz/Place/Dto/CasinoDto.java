package com.xworkz.Place.Dto;



public class CasinoDto {
	private String name;
	private String cruise;
	private double entryFee;
	private boolean freeFood;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCruise() {
		return cruise;
	}

	public void setCruise(String cruise) {
		this.cruise = cruise;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public boolean isFreeFood() {
		return freeFood;
	}

	public void setFreeFood(boolean freeFood) {
		this.freeFood = freeFood;
	}

	@Override
	public String toString() {
		return "CasinoDto [name=" + name + ", cruise=" + cruise + ", entryFee=" + entryFee + ", freeFood=" + freeFood
				+ "]";
	}

}
