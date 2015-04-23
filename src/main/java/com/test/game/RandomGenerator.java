package com.test.game;

import java.util.Random;

public class RandomGenerator {
    public RandomGenerator() {
    }

    public int randomIntGenerator() {
        return new Random().nextInt(3);
    }
}