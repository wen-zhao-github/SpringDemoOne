package com.example.wen.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from container
		Coach theCoach = context.getBean("myCoach",Coach.class);		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());		
		System.out.println(theCoach.getFortune());
		//close the context
		context.close();
	}

}
