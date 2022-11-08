package com.xworkz.Association.things;

public class Email {
	public String mailId;
	public double password;
	public long mobileNo;
	public Company1 company1 = new Company1("gmail", "sergery and larry page");

	public Email(String mailId, double password, long mobileNo) {
		super();
		this.mailId = mailId;
		this.password = password;
		this.mobileNo = mobileNo;
	}

	public void showOff() {
		System.out.println("mail id id :"+this.mailId);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		this.company1.showOff();
	}

}
