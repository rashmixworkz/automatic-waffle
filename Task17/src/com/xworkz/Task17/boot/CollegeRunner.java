package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.College;

public class CollegeRunner {

	public static void main(String[] args) 
	{
		String[] subjectOptions= {"PCMB","PCMCs","Electronics"};
		 String[] branches= {"raichur","Gulbarga","sindhanur"};
		 double[] ratings= {4.9,2.3,1.6,6.4,1.28};
		 String[] boardColors= {"black","green","white"};
		 String[] review= {"good","nice"};
		 College ref=new College("Lions pu college","koppal",25300,3,"white",subjectOptions,branches,ratings,boardColors,review);
		 
		ref.show();
	}
		

	}


