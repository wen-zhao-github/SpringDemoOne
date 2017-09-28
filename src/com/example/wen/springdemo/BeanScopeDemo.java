package com.example.wen.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		//load spring config
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifecycleApplicationContext.xml");
		//retrieve bean
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		//call method on bean
		
		//check if the two coaches are the same
		if(theCoach == alphaCoach){
			System.out.println("These two are completely same");

		}else{
			System.out.println("no, they are not the same");
		}
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		//close the context
		context.close();

	}

}
