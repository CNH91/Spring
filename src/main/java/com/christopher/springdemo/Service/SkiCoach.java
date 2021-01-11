package com.christopher.springdemo.Service;

public class SkiCoach implements Coach {

    private FortuneService fortuneService;

    public SkiCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do some downhills";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
