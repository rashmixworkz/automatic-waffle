package com.xworkz.airoplane.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.airoplane.DTO.AiroplaneDto;

public interface AiroplaneService {

	Set<ConstraintViolation<AiroplaneDto>> validateAndSave(AiroplaneDto dto);

	default AiroplaneDto findById(int id) {
		return null;
	}

}
