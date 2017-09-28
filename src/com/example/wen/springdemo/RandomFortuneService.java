package com.example.wen.springdemo;
import java.util.Random;
public class RandomFortuneService implements FortuneService {
	private String [] fortunes = {
			"Tomorrow is your lucky day!",
			"Today is the day!",
			"Tomrrow will be the best!"
	};

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

}

