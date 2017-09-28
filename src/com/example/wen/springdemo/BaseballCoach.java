package com.example.wen.springdemo;

public class BaseballCoach implements Coach{
	
	HappyFortuneService mHappyFortuneService;
	public BaseballCoach(HappyFortuneService mHappyFortuneService){
		this.mHappyFortuneService = mHappyFortuneService;
	}
	public String getDailyWorkout(){
		
		return "spend 30 mins on batting pratice";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return mHappyFortuneService.getFortune();
	}

}
