package com.test.game;

import java.util.List;

public class Player
{
    private RandomGenerator randomGenerator;

    public Player(RandomGenerator randomGenerator) { this.randomGenerator = randomGenerator;}

    public void choose(List<Door> doors)
    {
        int originAnswer = randomGenerator.randomIntGenerator();
        for (Door door : doors) {
            if (originAnswer == door.getID()) {
                door.setIsBeChosen(true);
            }
        }
    }
}