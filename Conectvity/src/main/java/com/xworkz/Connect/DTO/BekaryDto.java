package com.xworkz.Connect.DTO;


public class BekaryDto {
	
	private String name;
	private String ownerName;
	private String wifeName;
	private String marriage;
	private String famous;
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
