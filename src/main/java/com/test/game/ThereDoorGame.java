package com.test.game;

import java.util.ArrayList;
import java.util.List;

public class ThereDoorGame {
    private Host host;
    private RandomGenerator randomGenerator;
    private Player player;
    private List<Door> doors;

    public ThereDoorGame(Host host, RandomGenerator randomGenerator) {
        this.host = host;
        this.randomGenerator = randomGenerator;
        this.player = new Player(randomGenerator);
        this.doors = new ArrayList<Door>();
    }

    public void initGame() {
        doors.clear();
        doors.add(new Door(0, false, false));
        doors.add(new Door(1, false, false));
        doors.add(new Door(2, false, false));
        int bingoIndex = randomGenerator.randomIntGenerator();

        for (Door door : doors) {
            if (bingoIndex == door.getID()) {
                door.setIsCar(true);
            } else {
                door.setIsCar(false);
            }
        }
    }

    public void playerChooseOneDoor() {
        player.choose(doors);
    }

    public void hostOpenOneDoorWithoutCar() {
        host.openOneDoor(doors);
    }

    public Boolean isLeftDoorWithCar() {
        for (Door door : doors) {
            if (!door.getIsBeChosen() && !door.getIsOpened()) {
                return door.getIsCar();
            }
        }
        return false;
    }
}
