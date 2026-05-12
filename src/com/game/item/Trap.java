package com.game.item;

import com.game.animal.Animal;

public class Trap implements Item {

    @Override
    public void run(Animal animal) {
        moveBack(animal);
    }

    public void moveBack(Animal animal){

        if(animal.getPosition() == 0){
            System.out.println("시작 위치에서는 Trap을 사용할 수 없습니다.");
            return;
        }

        if(animal.hasShield()){
            System.out.println(animal.getName() + "가 방어막을 사용하여 Trap을 막았습니다.");
            animal.setHasShield(false);
            return;
        }
            System.out.println("방어막이 없어서 Trap이 실행됩니다.");
            System.out.println(animal.getName() + "가 Trap(뒤로 1칸 가기)에 걸렸습니다.!");
            int presentPosition = animal.moveStep(-1);
            System.out.println("현재 " + presentPosition + "번째 칸 입니다.");


    }
}
