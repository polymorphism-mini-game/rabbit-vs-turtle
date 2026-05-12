package com.game.item;

import com.game.animal.Animal;

public class Freeze implements Item {

    public void run(Animal animal) {

        animal.setFrozen(true);

        System.out.println(animal.getName() + "가 얼었습니다! 이번 턴 이동 불가!");

    }

}
