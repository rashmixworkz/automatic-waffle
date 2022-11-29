package com.xworkz.equal.things;

public class Institution {

	private String Name;
	private String location; 
	private double fees;
	private double students;
	private String mainSubject;
	private String state;
	private int duration;
	private String type;
	private boolean isGood;
	private String Language;
	
	public Institution()
	{
		System.out.println("defalut constrctor");
	}

	public Institution(String name, String location, double fees, double students, String mainSubject, String state,
			int duration, String type, boolean isGood, String language) {
		super();
		this.Name = name;
		this.location = location;
		this.fees = fees;
		this.students = students;
		this.mainSubject = mainSubject;
		this.state = state;
		this.duration = duration;
		this.type = type;
		this.isGood = isGood;
		this.Language = language;
	}
	
	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in institute");
		if (other instanceof Institution )
		{
			System.out.println("other is ,can check the proprties ");
			Institution casted = (Institution) other ;
		
			if (this.Name.equals(casted.Name)&& this.location.equals(casted.location)) {
				System.out.println("Name is same and location");
				
				return true;
		} 
		}
			else { 
			System.err.println("other is name&location,can not check the proprties");
			
		}
			return false;

	}
	

@Override
	public String toString() {
		return "Institution [Name=" + Name + ", location=" + location + ", fees=" + fees + ", students=" + students
				+ ", mainSubject=" + mainSubject + ", state=" + state + ", duration=" + duration + ", type=" + type
				+ ", isGood=" + isGood + ", Language=" + Language + "]";
	}

	
	
	
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public double getStudents() {
		return students;
	}

	public void setStudents(double students) {
		this.students = students;
	}

	public String getMainSubject() {
		return mainSubject;
	}

	public void setMainSubject(String mainSubject) {
		this.mainSubject = mainSubject;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isGood() {
		return isGood;
	}

	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}
	
	
	
	
}
