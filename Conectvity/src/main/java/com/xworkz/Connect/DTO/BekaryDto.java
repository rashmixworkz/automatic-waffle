package com.xworkz.Connect.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beakary_tab")
public class BekaryDto {
	
	@Column(name = "b_id")
	@Id
	private int id;

	@Column(name = "b_name")
	private String name;

	@Column(name = "b_ownerName")
	private String ownerName;

	@Column(name = "b_wifeName")
	private String wifeName;

	@Column(name = "b_marriage")
	private String marriage;

	@Column(name = "b_famous")
	private String famous;

	@Column(name = "b_since")
	private String since;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getFamous() {
		return famous;
	}

	public void setFamous(String famous) {
		this.famous = famous;
	}

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}

	@Override
	public String toString() {
		return "BekaryDto [name=" + name + ", ownerName=" + ownerName + ", wifeName=" + wifeName + ", marriage="
				+ marriage + ", famous=" + famous + ", since=" + since + "]";
	}

}
