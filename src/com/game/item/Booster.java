package com.game.item;

import com.game.animal.Animal;

public class Booster implements Item {

    public Booster(){}

    @Override
    public void run(Animal animal) {
        animal.addPosition(3);
    }


}
