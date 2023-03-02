package com.xworkz.makeUpItem.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
				dto1.setId(itemEntity.getId());
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

	@Override
	public List<MakeUpItemDto> findByName(String name) {
		System.out.println("Running find by name in service is valid");
		if (name != null && !name.isEmpty()) {
			List<MakeUpItemEntity> lists = this.makeUpItemRepo.findByName(name);
			List<MakeUpItemDto> dtos = new ArrayList<MakeUpItemDto>();
			for (MakeUpItemEntity entity : lists) {
				MakeUpItemDto makeUpItemDto = new MakeUpItemDto();
				makeUpItemDto.setId(entity.getId());
				makeUpItemDto.setName(entity.getName());
				makeUpItemDto.setBrand(entity.getBrand());
				makeUpItemDto.setPrice(entity.getPrice());
				makeUpItemDto.setIsGood(entity.isGood());
				makeUpItemDto.setFloavour(entity.getFloavour());
				dtos.add(makeUpItemDto);
			}
			System.out.println("List of dtos" + dtos.size());
			System.out.println("List of entities" + lists.size());
			return dtos;

		}

		else {
			System.err.println("Name is invalid");
		}
		return MakeUpItemService.super.findByName(name);

	}

	@Override
	public Set<ConstraintViolation<MakeUpItemDto>> validateAndUpdate(MakeUpItemDto dto) {
		
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
				entity.setId(dto.getId());
				entity.setName(dto.getName());
				entity.setBrand(dto.getBrand());
				entity.setPrice(dto.getPrice());
				entity.setFloavour(dto.getFloavour());
				entity.setGood(dto.getIsGood());

				boolean saved = this.makeUpItemRepo.update(entity);
				System.out.println("saved: " + saved);
				return Collections.emptySet();
			}
	}
}
