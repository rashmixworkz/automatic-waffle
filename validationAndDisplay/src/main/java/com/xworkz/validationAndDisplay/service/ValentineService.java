package com.xworkz.validationAndDisplay.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.validationAndDisplay.DTO.ValentineDto;

public interface ValentineService {
	
	Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto);

}
