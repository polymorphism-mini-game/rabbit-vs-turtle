package com.game.animal;

public abstract class Animal {

    protected String name;
    protected int position;
    protected boolean frozen;
    protected boolean hasShield;

    protected Animal() {
        this.position = 0;
        this.frozen = false;
        this.hasShield = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public boolean hasShield() {
        return hasShield;
    }

    public void setHasShield(boolean hasShield) {
        this.hasShield = hasShield;
    }

    public int move(){
        return 0;
    }

    public int moveStep(int amount) {
       position += amount;
       if(position < 0){
           position = 0;
       }
       return position;
    }

    public int getPosition() {
        return position;
    }

    public void addPosition(int moveCount){
        position += moveCount;
    }

}
