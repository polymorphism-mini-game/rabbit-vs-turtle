package com.game.item;

import com.game.animal.Animal;

public class Booster implements Item {

    public Booster(){}

    @Override
    public void run(Animal animal) {
        int presentPosition = animal.moveStep(3);
        System.out.println(animal.getName() + "가 부스터를 획득했습니다. 현재 위치는 " + presentPosition + "입니다.");

    }


}
