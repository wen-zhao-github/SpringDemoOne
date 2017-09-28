package com.example.wen.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneTest {

	public static void main(String[] args) {
		// load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from containner
		Coach golf = context.getBean("myGolfCoach", Coach.class);
		//call method on bean
		System.out.println(golf.getDailyWorkout());
		System.out.println(golf.getFortune());
		//close the context
        context.close();
	}

}
