package com.xworkz.Bridge.subClass;

public class Visitors {
	
	private Patients patientname;

	public Visitors() {
		super();
		System.out.println("Running in default const");
			
		
	}

	public Visitors(Patients patientname) {
		super();
		this.patientname = patientname;
	
		System.out.println("Running in para const");
	}
		public void limitvisitors() {
			System.out.println("runnning visitor rules");
		
		if(patientname!=null) {
			boolean noiseReduction=this.patientname.noiseReduction();
			String smoking=this.patientname.smoking();
			boolean keepClean=this.patientname.keepClean();
			if(noiseReduction==true && smoking=="no" && keepClean==true) {
				System.out.println("patient maintain scilence and not smoke,and maintained clean");
			}else {
				System.out.println("patient not maintain scilence and smoke,and not maintained clean");
			}
		}
	}
	
	
	
	 

}
