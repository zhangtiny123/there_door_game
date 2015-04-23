package com.test.game;

public class Main {

    public static final int LOOP_ROUND = 10000;

    public static void main(String[] args) {
        ThereDoorGame thereDoorGame = new ThereDoorGame(new Host(), new RandomGenerator());
        int rightAnswerCount = 0;
        for (int i = 0; i < LOOP_ROUND; i++) {
            thereDoorGame.initGame();
            thereDoorGame.playerChooseOneDoor();
            thereDoorGame.hostOpenOneDoorWithoutCar();
            if (thereDoorGame.isLeftDoorWithCar()) {
                rightAnswerCount++;
            }
        }
        System.out.println(rightAnswerCount + " : " + LOOP_ROUND);
    }
}
