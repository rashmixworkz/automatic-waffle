package com.xworkz.makeUpItem.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="makeup_item_table")
@NamedQuery(name="findByName",query="select entity from MakeUpItemEntity entity where entity.name=:name")
@NamedQuery(name="findAll",query="select en from MakeUpItemEntity en")
@NamedQuery(name="findByNameAndPrice",query="select entity.name,entity.price from MakeUpItemEntity entity where entity.name=:name OR entity.price=:price")
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
