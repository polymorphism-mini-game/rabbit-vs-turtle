package com.game.animal;

import java.util.Random;

public class Rabbit extends Animal {

    private final Random random = new Random();

    public Rabbit() {
        super();
        this.name = "🐰토끼";
    }

    @Override
    public int move() {
        return random.nextInt(5) + 1;
    }
}
