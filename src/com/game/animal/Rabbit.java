package com.game.animal;

public class Rabbit extends Animal {

    public Rabbit() {
        super();
        this.name = "🐰토끼";
    }

    @Override
    public int move() {
        return 3;
    }
}
