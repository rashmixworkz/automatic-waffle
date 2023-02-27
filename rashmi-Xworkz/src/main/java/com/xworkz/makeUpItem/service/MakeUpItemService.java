package com.xworkz.makeUpItem.service;

import java.util.Set;


import javax.validation.ConstraintViolation;

import com.xworkz.makeUpItem.DTO.MakeUpItemDto;

public interface MakeUpItemService {

	Set<ConstraintViolation<MakeUpItemDto>> validateAndSave(MakeUpItemDto dto);

	default MakeUpItemDto findById(int id) {
		return null;
	}

}
