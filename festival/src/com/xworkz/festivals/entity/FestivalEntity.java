package com.xworkz.festivals.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="fest_details")
@Data
@NoArgsConstructor
@NamedQuery(name="findByIdAndName", query="select en from FestivalEntity en where en.id=:num and en.name=:n")
@NamedQuery(name="findByNameAndRegionAndMainGod", query="select entity from FestivalEntity entity where entity.name=:n and entity.region=:rea and entity.mainGod=:god ")
@NamedQuery(name="FindTotalDaysByName", query="select r.totalDays from FestivalEntity r where r.name='NagaChuti'")
@NamedQuery(name="",query="")
public class FestivalEntity {
@Id
@Column(name="f_id")
@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;

@Column(name="f_name")
	private String name;
@Column(name="f_region")
	private String region;
@Column(name="f_total_Days")
	private int totalDays;
@Column(name="f_sweet")
	private String sweet;
@Column(name="f_mainGod")
	private String mainGod;

public FestivalEntity(String name, String region, int totalDays, String sweet, String mainGod) {
	super();
	this.name = name;
	this.region = region;
	this.totalDays = totalDays;
	this.sweet = sweet;
	this.mainGod = mainGod;
}


}
