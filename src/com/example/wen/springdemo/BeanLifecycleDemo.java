package com.example.wen.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemo {

	public static void main(String[] args) {
		//load spring config
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifecycleApplicationContext.xml");
		//retrieve bean
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//Coach alphaCoach = context.getBean("myCoach", Coach.class);
		//call method on bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		//System.out.println(alphaCoach);
		//close the context
		context.close();

	}

}
