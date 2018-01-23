package com.ulpatha;

import java.util.Random;

/**
 * Created by Kapila on 1/22/2018.
 */
public class RandomInt {

    Random random;
    private Integer max;
    private Integer min;

    public RandomInt(Integer max, Integer min) {
        this.max = max;
        this.min = min;
    }

    public Integer randomInt(){
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return randomNumber;
    }

}
