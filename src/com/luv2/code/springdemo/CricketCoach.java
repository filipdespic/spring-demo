package com.luv2.code.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside email address - setEmail");
		this.emailAddress = emailAddress;
		
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside team - setTeam");
		this.team = team;
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	//out setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes a day.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
