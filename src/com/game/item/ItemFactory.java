package com.game.item;

import java.util.Random;

public class ItemFactory {

    private final Random random = new Random();

    public Item createRandomItem() {

        int number = random.nextInt(3);

        switch(number) {

            case 0:
                return new Booster();

            case 1:
                return new Trap();

            default:
                return new Freeze();
        }
    }
}
