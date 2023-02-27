package com.xworkz.makeUpItem.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.makeUpItem.DTO.MakeUpItemDto;
import com.xworkz.makeUpItem.entity.MakeUpItemEntity;
import com.xworkz.makeUpItem.repository.MakeUpItemRepo;

@Service
public class MakeUpItemServiceImpl implements MakeUpItemService {
	
@Autowired
	private MakeUpItemRepo makeUpItemRepo;

	public MakeUpItemServiceImpl() {
		System.out.println("Running default const of MakeUpItemServiceImpl in MakeUpItemServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<MakeUpItemDto>> validateAndSave(MakeUpItemDto dto) {
		System.out.println("Running validateAndSave in AiroplaneServiceImpl");
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<MakeUpItemDto>> voilations = validator.validate(dto);
		if (voilations != null && !voilations.isEmpty()) {
			System.err.println("voilations in dto");
			return voilations;
		} else {
			System.out.println("voilation is not in dto ,can save details");
			MakeUpItemEntity entity = new MakeUpItemEntity();
			entity.setName(dto.getName());
			entity.setBrand(dto.getBrand());
			entity.setPrice(dto.getPrice());
			entity.setFloavour(dto.getFloavour());
			entity.setGood(dto.getIsGood());

			boolean saved = this.makeUpItemRepo.save(entity);
			System.out.println("saved: " + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public MakeUpItemDto findById(int id) {
		if (id > 0) {
			MakeUpItemEntity itemEntity = this.makeUpItemRepo.findById(id);
			if (itemEntity != null) {
				System.out.println("itemEntity is found in service in id" + id);
				MakeUpItemDto dto1 = new MakeUpItemDto();
				dto1.setName(itemEntity.getName());
				dto1.setBrand(itemEntity.getBrand());
				dto1.setPrice(itemEntity.getPrice());
				dto1.setFloavour(itemEntity.getFloavour());
				dto1.setIsGood(itemEntity.isGood());
				return dto1;
			}
		}
		return MakeUpItemService.super.findById(id);
	}
}
