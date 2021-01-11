package com.christopher.springdemo;

import com.christopher.springdemo.Service.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TennisCoach coach = context.getBean("myTennisCoach", TennisCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());

        context.close();
    }
}
