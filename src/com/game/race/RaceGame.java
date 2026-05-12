package com.game.race;

import com.game.animal.Animal;
import com.game.animal.Rabbit;
import com.game.animal.Turtle;
import com.game.item.Item;
import com.game.item.ItemFactory;

import java.util.Random;
import java.util.Scanner;

public class RaceGame {

    private final Animal[] animals;
    private final int goal;

    private final Random random = new Random();
    private final ItemFactory itemFactory = new ItemFactory();

    Scanner sc = new Scanner(System.in);


    public RaceGame() {
        this.goal = 20;

        animals = new Animal[] {
                new Rabbit(),
                new Turtle()
        };
    }

    public void startGame() {

        int round = 1;
        raceStartMessage();

        while(true) {

            printRound(round);

            playRound();

            printCurrentPosition();

            Animal winner = checkWinner();

            if(winner != null) {
                printWinner(winner);
                break;
            }
            waitNextRound();

            round++;
        }
    }

    private void playRound() {

        // 아이템 이벤트 발생
        triggerItemEvent();

        for(Animal animal : animals) {
            // 얼음 상태 확인
            if(animal.isFrozen()) {
                animal.setFrozen(false);
                continue;
            }

            int moveDistance = animal.move();

            animal.addPosition(moveDistance);

            System.out.println(animal.getName() + " +" + moveDistance + "칸 이동!");
        }
    }

    private void triggerItemEvent() {

        int chance = random.nextInt(100);
        System.out.println("chance = " + chance);

        // 30% 확률
        if(chance < 30) {
            System.out.println("🎁 랜덤 이벤트 발생!");

            // 랜덤 동물 선택
            Animal target = animals[random.nextInt(animals.length)];

            // 랜덤 아이템 생성
            Item item = itemFactory.createRandomItem();

            System.out.println("target : " + target.getName());
            System.out.println(item);

            item.run(target);
        }
    }

    private Animal checkWinner() {

        for(Animal animal : animals) {

            if(animal.getPosition() >= goal) {
                return animal;
            }
        }

        return null;
    }

    private void printRound(int round) {

        System.out.println();
        System.out.println("========== ROUND " + round + " ==========");
        System.out.println();
    }

    private void printCurrentPosition() {

        System.out.println("===== 현재 위치 =====");

        for(Animal animal : animals) {
            System.out.println(animal.getName() + " : " + animal.getPosition() + "칸");
        }

        System.out.println();
    }

    private void printWinner(Animal winner) {
        System.out.println();
        System.out.println("=================================");
        System.out.println("🏆 우승 동물 등장! 🏆");
        System.out.println("=================================");
        System.out.println();

        System.out.println(winner.getName() + "가(이) 가장 먼저 도착했습니다!");

        System.out.println();
        System.out.println("🎉 축하합니다! 🎉");
    }

    private void raceStartMessage() {
        System.out.println();
        System.out.println("경기를 시작하려면 ENTER를 누르세요.");
        sc.nextLine();
    }

    private void waitNextRound() {
        System.out.println();
        System.out.println("다음 라운드로 진행하려면 ENTER를 누르세요.");
        sc.nextLine();
    }

}
