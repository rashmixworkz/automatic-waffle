package com.xworkz.task.classes;

import com.xworkz.task.interfaceclass.XworkzRule;

public abstract class JavaTrainee extends Person implements XworkzRule{

	public JavaTrainee(String name, int age, String color, String nativePlace, String workingCompany, double salary) {
		super(name, age, color, nativePlace, workingCompany, salary);
		
	}

	
	abstract boolean training();
		
	abstract boolean excuteProgram();
	
	@Override
	public boolean uplodedTask() {
		
		return false;
	}

	@Override
	public boolean completedProgram() {
		return false;
	}

	@Override
	public
	boolean eat() {
		return false;
	}

	@Override
	public boolean sleep() {
	
		return false;
	}

}
