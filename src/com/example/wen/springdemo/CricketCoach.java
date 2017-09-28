package com.example.wen.springdemo;

public class CricketCoach implements Coach {
	private FortuneService mFortuneService;
	private String email;
	private String team;
	
	public void setEmail(String email) {
		System.out.println("inside setter method: setEmail()");
		this.email = email;
	}
	public void setTeam(String team) {
		System.out.println("inside setter method:setTeam()");
		this.team = team;
	}
	public CricketCoach(){
		super();
		System.out.println("inside a non-arg constructor");
	}
    //setter method for setter injection
	public void setmFortuneService(FortuneService mHappyFortuneService) {
		this.mFortuneService = mHappyFortuneService;
		System.out.println("inside a setter method");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "cricket fast balling 15 min";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return mFortuneService.getFortune();
	}
	public FortuneService getmFortuneService() {
		return mFortuneService;
	}
	public String getTeam() {
		return team;
	}
	public String getEmail() {
		return email;
	}

}
