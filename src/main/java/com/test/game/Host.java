package com.test.game;

import java.util.List;

public class Host
{
    public void openOneDoor(List<Door> doors)
    {
        for (Door door : doors) {
            if (!door.getIsBeChosen() && !door.getIsCar()) {
                door.setIsOpened(true);
            }
        }
    }
}