package com.xworkz.Task17.things;

public class College 
{

	
		public String name;
		public String location;
		public double collegeFee;
		public int noOfBuildings;
		public String buildingColor;
		public String[] subjectOptions;
		public String[] branches;
		public double[] ratings;
		public String[] boardColors;
		public String[] review;

		public College(String name, String location, double collegeFee, int noOfBuildings, String buildingColor, String[] subjectOptions,
				String[] branches, double[] ratings, String[] boardColors, String[] review)
		{
			this.name = name;
			this.location = location;
			this.collegeFee = collegeFee;
			this.noOfBuildings = noOfBuildings;
			this.buildingColor = buildingColor;
		    this.subjectOptions=subjectOptions;
		    this.branches =branches;
			this.ratings =ratings;
			this.boardColors = boardColors;
			this.review = review;

			System.out.println("constructor  and arrays");
		}

		public void show() {
			System.out.println("The name of the college is:" + name);
			System.out.println("The location of the college is:" + location);
			System.out.println("The collegeFee of the college is:" + collegeFee);
			System.out.println("The noOfBuildings of the college is:" + noOfBuildings);
			System.out.println("The buildingColor of the college is:" + buildingColor);
			
			System.out.println("*************************************************************");

			for (int i = 0; i < this.subjectOptions.length; i++) {
				String string = this.subjectOptions[i];
				System.out.println(string);

			}
			for (int i = 0; i < this.branches.length; i++) {
				String string = this.branches[i];
				System.out.println(string);

			}
			for (int i = 0; i < this.ratings.length; i++) {
				double string = this.ratings[i];
				System.out.println(string);

			}
			for (int i = 0; i < this.boardColors.length; i++) {
				String string = this.boardColors[i];
				System.out.println(string);
			}
			for (int i = 0; i < this.review.length; i++) {
			String string = this.review[i];
				System.out.println(string);

			}

		}
	}



