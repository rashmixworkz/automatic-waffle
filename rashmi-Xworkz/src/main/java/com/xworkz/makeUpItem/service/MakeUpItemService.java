package com.xworkz.makeUpItem.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;


import javax.validation.ConstraintViolation;

import com.xworkz.makeUpItem.DTO.MakeUpItemDto;

public interface MakeUpItemService {

	Set<ConstraintViolation<MakeUpItemDto>> validateAndSave(MakeUpItemDto dto);

	default MakeUpItemDto findById(int id) {
		return null;
	}
	default List< MakeUpItemDto> findByName(String name) {
		return null;
	}
	Set<ConstraintViolation<MakeUpItemDto>> validateAndUpdate(MakeUpItemDto dto);

	default  MakeUpItemDto deleteById(int id) {
		return null;
	}
	default List< MakeUpItemDto> findAll() {
		return Collections.emptyList();
	}
	default List< MakeUpItemDto> findByNameAndPrice(String name,Double price) {
		return Collections.emptyList();
	}
	
}
