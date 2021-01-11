package com.christopher.springdemo.Service;

import java.util.ArrayList;
import java.util.Random;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        ArrayList<String> goodFortune = new ArrayList<String>();
        goodFortune.add("Have a good luck");
        goodFortune.add("Best wishes");
        goodFortune.add("Break a leg");
        return getRandom(goodFortune);
    }


    public static String getRandom(ArrayList<String> array) {
        int random = new Random().nextInt(array.size());
        return array.get(random);
    }
}

