package com.test.game;

public class Door
{
    private int ID;
    private Boolean isBeChosen;
    private Boolean isOpened;
    private Boolean isCar;

    public Door(int id, Boolean isBeChosen, Boolean isOpened)
    {
        ID = id;
        this.isBeChosen = isBeChosen;
        this.isOpened = isOpened;
    }

    public Boolean getIsBeChosen()
    {
        return isBeChosen;
    }

    public void setIsBeChosen(Boolean isBeChosen)
    {
        this.isBeChosen = isBeChosen;
    }

    public Boolean getIsOpened()
    {
        return isOpened;
    }

    public void setIsOpened(Boolean isOpened)
    {
        this.isOpened = isOpened;
    }

    public Boolean getIsCar()
    {
        return isCar;
    }

    public void setIsCar(Boolean isCar)
    {
        this.isCar = isCar;
    }

    public int getID()
    {
        return ID;
    }
}
