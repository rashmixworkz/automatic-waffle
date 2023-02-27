package com.xworkz.airoplane.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
@Data
public class AiroplaneDto {
	@Size(min=3,max=20,message="Company should be greater than 3 and less than 20")
	private String company;
	@Size(min=3,max=20,message="Company name should be greater than 3 and less than 20")
	private String name;
	@NotNull(message="cost should not be null")
	private int cost;
	@NotBlank(message="Type should be selected")
	private String type;
	@NotBlank(message="country should be selected")
	private String country;
	

}
