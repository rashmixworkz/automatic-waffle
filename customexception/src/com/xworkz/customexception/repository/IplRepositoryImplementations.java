package com.xworkz.customexception.repository;

import com.xworkz.customexception.dto.IplDTO;
import com.xworkz.customexception.exception.ArraySizeExceededException;

public class IplRepositoryImplementations implements IplRepository {
	
	
	private IplDTO[] iplDTO =new IplDTO[10];
	private int index=0;
	

	@Override
	public boolean create(IplDTO dto){
		System.out.println("running in implementations of iplrep[ository");
		if(this.index>=this.iplDTO.length) {
			throw new ArraySizeExceededException();
		}
		
		
		this.iplDTO[this.index]=dto;
		System.out.println("saved items"+dto+dto.hashCode()+"at index:"+this.index);
		this.index++;
	      return true;
	}
@Override
public int total() {

	return this.index;
}
}
