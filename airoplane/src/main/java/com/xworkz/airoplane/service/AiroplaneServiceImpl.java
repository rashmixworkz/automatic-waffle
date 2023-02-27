package com.xworkz.airoplane.service;

import java.util.Collections;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.airoplane.DTO.AiroplaneDto;
import com.xworkz.airoplane.Entity.AiroplaneEntity;
import com.xworkz.airoplane.repository.AiroplaneRepo;

@Service
public class AiroplaneServiceImpl implements AiroplaneService {
	@Autowired
	private AiroplaneRepo airoplaneRepo;

	public AiroplaneServiceImpl() {
		System.out.println("created" + getClass().getName());
	}

	@Override
	public Set<ConstraintViolation<AiroplaneDto>> validateAndSave(AiroplaneDto dto) {
		System.out.println("Running validateAndSave in AiroplaneServiceImpl");
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<AiroplaneDto>> voilations = validator.validate(dto);
		if (voilations != null && !voilations.isEmpty()) {
			System.err.println("voilations in dto");
			 return voilations;
		} else {
			System.out.println("voilation is not in dto ,can save details");
			AiroplaneEntity entity = new AiroplaneEntity();
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setType(dto.getType());
			entity.setCost(dto.getCost());
			entity.setCountry(dto.getCountry());
			boolean saved = this.airoplaneRepo.save(entity);
			System.out.println("saved: " + saved);
			return Collections.emptySet();
		}

	}

	@Override
	public AiroplaneDto findById(int id) {
		if (id > 0) {
			AiroplaneEntity entity = this.airoplaneRepo.findBy(id);
			if (entity != null) {
				System.out.println("entity is found in service in id" + id);
				AiroplaneDto dto1 = new AiroplaneDto();
				dto1.setCompany(entity.getCompany());
				dto1.setName(entity.getName());
				dto1.setType(entity.getType());
				dto1.setCountry(entity.getCountry());
				return dto1;

			}
		}
		return AiroplaneService.super.findById(id);
	}
}
