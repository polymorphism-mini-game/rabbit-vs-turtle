package com.game.item;

import com.game.animal.Animal;

public interface Item {

    default void run(Animal animal) {}
}
