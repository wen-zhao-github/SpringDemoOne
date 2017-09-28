package com.example.wen.springdemo;

public class GolfCoach implements Coach {
	private FortuneService mFortuneService;
	public GolfCoach(FortuneService mFortuneService){
		this.mFortuneService = mFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "golf golf and nothing else!";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return mFortuneService.getFortune();
	}

}
