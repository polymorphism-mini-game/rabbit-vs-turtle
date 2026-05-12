package com.game.item;

import com.game.animal.Animal;

public class Shield implements Item {

    public void run(Animal animal) {

        animal.setHasShield(false);
    }
}
