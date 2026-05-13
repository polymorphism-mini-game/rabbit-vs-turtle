package com.game.animal;

import java.util.Random;

public class Turtle extends Animal {

    private final Random random = new Random();

    public Turtle() {
        super();
        this.name = "🐢거북이";
    }

    @Override
    public int move() {
        return random.nextInt(3) + 1;
    }

}
