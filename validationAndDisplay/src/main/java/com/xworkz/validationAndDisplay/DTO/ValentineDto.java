package com.xworkz.validationAndDisplay.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ValentineDto {

	@Size(min = 3, max = 20, message = "Name cannot be less than 3 and greater than 20")
	private String name;
	@Size(min = 3, max = 20, message = "valentineName cannot be less than 3 and greater than 20")
	private String valentineName;

	@NotBlank(message = "Place should be selected")
	private String places;
	@NotBlank(message = "place should be selected")
	private String gifts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValentineName() {
		return valentineName;
	}

	public void setValentineName(String valentineName) {
		this.valentineName = valentineName;
	}

	public String getPlaces() {
		return places;
	}

	public void setPlaces(String places) {
		this.places = places;
	}

	public String getGifts() {
		return gifts;
	}

	public void setGifts(String gifts) {
		this.gifts = gifts;
	}

	@Override
	public String toString() {
		return "ValentineDto [name=" + name + ", valentineName=" + valentineName + ", places=" + places + ", gifts="
				+ gifts + "]";
	}

}
