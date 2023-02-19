package com.xworkz.practise.DTO;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="practise_table")
@Getter
@Setter
@ToString
public class PractiseDto {
	@Id
	@Column(name="p_id")
	private int id;
	@Column(name="p_name")
	private String name;
	@Column(name="p_area")
	private String area;
	@Column(name="p_street")
	private String street;
	@Column(name="p_floorNo")
	private String floorNo;
	@Column(name="p_homeNo")
	private String homeNo;

}
