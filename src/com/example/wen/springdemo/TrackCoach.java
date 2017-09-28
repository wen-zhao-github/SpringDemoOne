package com.example.wen.springdemo;

public class TrackCoach implements Coach {
	private HappyFortuneService mHappyFortuneService;	 

	public TrackCoach(HappyFortuneService mHappyFortuneService) {
		super();
		this.mHappyFortuneService = mHappyFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "4 * 12mins running";
	}

	public TrackCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return mHappyFortuneService.getFortune()+"Track on!";
	}
	//define init method
	public void initTrackCoach(){
		System.out.println("Track coach init method");
	}
	public void destroyTrackCoach(){
		System.out.println("destroy track coach method");
	} 

}
