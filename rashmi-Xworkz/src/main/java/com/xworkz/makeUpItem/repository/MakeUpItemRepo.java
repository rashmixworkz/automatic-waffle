package com.xworkz.makeUpItem.repository;

import java.util.Collections;

import java.util.List;

import com.xworkz.makeUpItem.entity.MakeUpItemEntity;

public interface MakeUpItemRepo {

	boolean save(MakeUpItemEntity entity);
	
	boolean update(MakeUpItemEntity entity);
	
	default MakeUpItemEntity deleteById(int id) {
		return null;
	}
	
	default MakeUpItemEntity findById(int id) {
		return null;
	}
	
	default List<MakeUpItemEntity> findByName(String name){
		return Collections.emptyList();
	}
	default List<MakeUpItemEntity> findAll(){
		return Collections.emptyList();
	}
	default List<MakeUpItemEntity> findByNameAndPrice(String name,Double price){
		return Collections.emptyList();
	}
	
}
