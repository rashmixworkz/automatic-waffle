package com.xworkz.streams.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.streams.DTO.ApplicationDtO;

public class ApplicationDtORunner {

	public static void main(String[] args) {
	
		Collection<ApplicationDtO> applications=new ArrayList<ApplicationDtO>();
		
		applications.add
		(new ApplicationDtO("Jdk",1.8,true,"Oracle",0));
		applications.add
		(new ApplicationDtO("Eclips", 1.9, false, "IBM", 12340));
		applications.add
		(new ApplicationDtO("Visual Studieo", 1.5, true, "Microsoft", 8425));
		applications.add(new ApplicationDtO("sql workbench", 2.3, false, "Google", 8321));
		
		
		applications.stream().filter(e->e.isFree()).filter(e->e.getDevelopedBy()).map(ele->ele.getDevelopedBy()).collect(Collectors.toList()).forEach(e->System.out.println(e));
		

	}

}
