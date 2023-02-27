package com.xworkz.airoplane.repository;

import com.xworkz.airoplane.Entity.AiroplaneEntity;

public interface AiroplaneRepo {

	boolean save(AiroplaneEntity entity);

	default AiroplaneEntity findBy(int id) {
		return null;
	}
}
