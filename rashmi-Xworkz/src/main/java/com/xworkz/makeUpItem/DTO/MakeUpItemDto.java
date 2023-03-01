package com.xworkz.makeUpItem.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NamedQuery;

import lombok.Data;

@Data

public class MakeUpItemDto {
	private int id;
	@Size(min=3,max=20,message="MakeUpItem name should be greater than 3 and less than 20")
	private String name;
	@NotBlank(message="Brand should not be blank")
	private String brand;
	@NotNull(message="Price should be not null")
	private Double price;
	@NotBlank(message="Floavour should not be blank")
	private String floavour;
	private Boolean isGood;
	
	

}