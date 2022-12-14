package com.xworkz.customexception.repository;

import com.xworkz.customexception.dto.IplDTO;

public interface IplRepository {
	
	
	boolean create (IplDTO dto);
	
	default int total() {
		return 0;
		
	}

}
