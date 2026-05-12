package com.game.animal;

public class Turtle extends Animal {

    public Turtle() {
        super();
        this.name = "🐢거북이";
    }

    @Override
    public int move() {
        return 1;
    }

}
