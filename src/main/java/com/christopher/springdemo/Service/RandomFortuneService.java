package com.christopher.springdemo.Service;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] randomFortunes = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(randomFortunes.length);
        return randomFortunes[index];
    }
}
