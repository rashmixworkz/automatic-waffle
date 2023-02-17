package com.xworkz.validationAndDisplay.service;

import java.util.Collections;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.validationAndDisplay.DTO.ValentineDto;
import com.xworkz.validationAndDisplay.entity.ValentineEntity;
import com.xworkz.validationAndDisplay.repository.ValentineEntityRepo;

@Service
public class ValentineServiceImpl implements ValentineService {
	@Autowired
	private ValentineEntityRepo entityRepo;

	public ValentineServiceImpl() {
		System.out.println("Running default const of ValentineServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto) {
		System.out.println("Running ValentineServiceImpl");
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<ValentineDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.out.println("violations " + dto);
			return violations;

		}

		System.out.println("no violations can save the data");
		ValentineEntity entity = new ValentineEntity();
		entity.setName(dto.getName());
		entity.setValentineName(dto.getValentineName());
		entity.setPlaces(dto.getPlaces());
		entity.setGifts(dto.getGifts());
		boolean saved = this.entityRepo.save(entity);
		System.out.println("saved" + saved);
		System.out.println(entity);

		System.out.println(dto);
		return Collections.emptySet();

	}

}
