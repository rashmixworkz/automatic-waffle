package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.SoftwareCompany;

public class SoftwareCompanyRunner 
{

	public static void main(String[] args)
	{
		String[] designations= {"Developer","Associate","HR","System Engineer"};
		 String[] branches= {"banglore","hydrabad","Pune"};
		 double[] ratings= {4.9,2.3,1.6,6.4,1.28};
		 boolean[] goodForWork= {true,false,true};
		 String[] review= {"good","nice"};
		 SoftwareCompany ref=new SoftwareCompany("Bosch","kormagala","Product based",300,2,2000,designations,branches,ratings,goodForWork,review);
		 
		ref.print();
	}

}
