package com.xworkz.Spring_beanTask.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class HardwareShop {

	@Autowired
	@Qualifier("idNo")
	private int id;
	@Autowired
	@Qualifier("sony")
    private String name;
	@Autowired
	@Qualifier("gstNum")
	private long gstNo;
	@Autowired
	@Qualifier("ramesh")
	private String ownerName;
	@Autowired
	@Qualifier("vijayanagar")
	private String address;

	public HardwareShop() {
		System.out.println("default cons of hardware shop");
	}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

}