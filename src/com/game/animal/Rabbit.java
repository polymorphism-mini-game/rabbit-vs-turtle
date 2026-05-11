package com.game.animal;

public class Rabbit extends Animal {

    public Rabbit() {}

    @Override
    public int move() {
        return position += 3;
    }

    public int Booster(){
        return position += 3;
    }

}
