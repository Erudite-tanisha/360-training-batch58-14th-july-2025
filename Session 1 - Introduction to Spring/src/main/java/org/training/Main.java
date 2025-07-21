package org.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        CricketCoach c1 = new CricketCoach();
//        System.out.println(c1.Play());

//        TennisCoach c1 = new TennisCoach();
//        System.out.println(c1.Play());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ScoreBoard score = (ScoreBoard) context.getBean("c1");
//        System.out.println(score.Play());
//        System.out.println(score.hashCode());

//        System.out.println(score.KitGranted());

        ScoreBoard score1 = (ScoreBoard) context.getBean("c2");
        System.out.println(score1.KitGranted());






    }
}