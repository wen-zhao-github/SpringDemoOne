package com.example.wen.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		CricketCoach coach = context.getBean("myCricketCoach",CricketCoach.class);
		//call methods on bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		//close the context
		context.close();

	}

}
