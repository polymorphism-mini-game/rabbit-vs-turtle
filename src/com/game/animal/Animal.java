package com.game.animal;

public abstract class Animal {

    protected String name;
    protected int position;
    protected boolean frozen;
    protected boolean hasShield;

    public int move() {
        return 0;
    }

    public int getPosition() {
        return position;
    }

    public void addPosition(int moveCount){
        position += moveCount;
    }

}
