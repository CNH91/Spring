package com.christopher.springdemo.Service;

public class HockeyCoach implements Coach {

    private FortuneService fortuneService;

    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Skate for 20 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }
}
