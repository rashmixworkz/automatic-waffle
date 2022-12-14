package com.xworkz.customexception.dto;

public class IplDTO extends AbstactAuditIplDTO{
	
	private String teamName;
	private int noOfPlayers;
	private String captainName;
	private boolean alive;
	private String place;
	
	public IplDTO() {
		super();
	}
	

	public IplDTO(String teamName, int noOfPlayers, String captainName, boolean alive, String place) {
		super();
		this.teamName = teamName;
		this.noOfPlayers = noOfPlayers;
		this.captainName = captainName;
		this.alive = alive;
		this.place = place;
	}


	@Override
	public String toString() {
		return "iplDTO [teamName=" + teamName + ", noOfPlayers=" + noOfPlayers + ", captainName=" + captainName
				+ ", alive=" + alive + ", place=" + place + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
	

}
