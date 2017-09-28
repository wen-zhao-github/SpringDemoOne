package com.example.wen.springdemo;

public class YogaCoach implements Coach {
	private HappyFortuneService mHappyFortuneService;
	

	public YogaCoach(HappyFortuneService mHappyFortuneService) {
		super();
		this.mHappyFortuneService = mHappyFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "45 mins Yoga routine";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return mHappyFortuneService.getFortune()+"Yoga needs praticing everyday";
	}

}
