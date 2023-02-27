package com.xworkz.makeUpItem.repository;

import com.xworkz.makeUpItem.entity.MakeUpItemEntity;

public interface MakeUpItemRepo {

	boolean save(MakeUpItemEntity entity);

	default MakeUpItemEntity findById(int id) {
		return null;
	}
	
}
