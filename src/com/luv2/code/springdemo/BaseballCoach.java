package com.luv2.code.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
