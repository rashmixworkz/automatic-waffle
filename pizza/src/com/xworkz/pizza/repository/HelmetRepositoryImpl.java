package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository{


		
		private HelmetDTO[] dtos=new HelmetDTO[10];
		private int currentIndex;
		
		@Override
		public boolean save(HelmetDTO dto) {
			System.out.println("RUNNING IN HelmetRepositoryImpl ");
			if(this.currentIndex>=dtos.length) {
				System.out.println("storage is full");
				return false;
			}
			this.dtos[this.currentIndex]=dto;
			System.out.println("saved"+dto+"at the inedx"+this.currentIndex);
			this.currentIndex++;
		return true;
	}

}

