package com.game;

import com.game.race.RaceGame;

public class Application {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("🐾 토끼와 거북이 레이스 게임 시작 🐾");
        System.out.println("=================================");

        System.out.println();
        System.out.println("참가 동물");
        System.out.println("1. 🐰 토끼");
        System.out.println("2. 🐢 거북이");

        System.out.println();
        System.out.println("🏁 결승선 : 20칸");
        System.out.println();

        RaceGame raceGame = new RaceGame();

        raceGame.startGame();

        System.out.println();
        System.out.println("=================================");
        System.out.println("🎉 게임 종료 🎉");
        System.out.println("=================================");
    }
}
