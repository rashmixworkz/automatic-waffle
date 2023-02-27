package com.xworkz.makeUpItem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="makeup_item_table")
public class MakeUpItemEntity {
	@Id
	@Column(name="m_id")
	private int id;
	@Column(name="m_name")
	private String name;
	@Column(name="m_brand")
	private String brand;
	@Column(name="m_price")
	private double price;
	@Column(name="m_floavour")
	private String floavour;
	@Column(name="m_isGood")
	private boolean isGood;

}
