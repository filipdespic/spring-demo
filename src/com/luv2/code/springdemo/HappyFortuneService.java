package com.luv2.code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService{
	private String[] fortunes = {"Today is your lucky day!", "Good job! Keep it going!", "Good luck!"};
	
	@Override
	public String getFortune() {
		int rnd = new Random().nextInt(fortunes.length);
		return fortunes[rnd];
	}
}
