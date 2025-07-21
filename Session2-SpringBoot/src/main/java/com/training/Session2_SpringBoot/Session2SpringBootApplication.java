package com.training.Session2_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Session2SpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Session2SpringBootApplication.class, args);

		Coach coach = context.getBean("cricketCoach", Coach.class);
		Coach coach1 = context.getBean("cricketCoach", Coach.class);
		System.out.println(coach.hashCode());
		System.out.println(coach1.hashCode());
//		Coach coach1 = context.getBean("tennisCoach", Coach.class);
//		System.out.println(coach.Play());
//		System.out.println(coach.KitGranted());
//		System.out.println(coach1.KitGranted());

//		ObjectClass obj = context.getBean("objectClass", ObjectClass.class);
//		System.out.println(obj.hello());
//

		Animal animal = context.getBean("hello", Animal.class);
		System.out.println(animal.Sound());


	}

}
