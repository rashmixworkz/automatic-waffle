package com.xworkz.task.boot;

import com.xworkz.task.child.*;
import com.xworkz.task.things.Court;

public class CourtRunner {

	public static void main(String[] args) {
		Court court = new Court();
		System.out.println(court.location);
		System.out.println(court.name);

		Court court1 = new HighCourt();
		HighCourt high = (HighCourt) court1;
		System.out.println(high.noOfActiveCases);
		System.out.println(high.noOfPendingCases);
		System.out.println(high.location);
		System.out.println(high.name);

		Court court2 = new FamilyCourt();
		FamilyCourt family = (FamilyCourt) court2;
		System.out.println(family.noOfLawyers);
		System.out.println(family.location);

		Court court3 = new SuprimeCourt();
		SuprimeCourt supreme = (SuprimeCourt) court3;
		System.out.println(supreme.location);
		System.out.println(supreme.type);

	}

}
