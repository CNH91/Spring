package com.christopher.springdemo.Service;

public class TennisCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public TennisCoach(){
        System.out.println("Tennis Coach : Inside no-arg constructor");
    };

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter method");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit some balls";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
