package com.xworkz.forest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="forest_details")
@NamedQuery(name="findByName",query="")
public class ForestEntity {
	@Id
@Column(name="f_id")
	private int id;
	@Column(name="f_name")
	private String name;
	@Column(name="f_state")
	private String state;
	@Column(name="f_type")
	private String type;
	@Column(name="f_area")
	private Double area;

}
