package com.blackjackbasketball;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PointSystem points = new PointSystem();

        boolean newGame = true;

        Scanner shotInput = new Scanner(System.in);

        while(newGame == true) {

            points.gameIntro();

            while (points.getTotalPoints() < 21 && points.getTotalPoints() >= 0) {

                if (points.getRoundNumber() % 4 == 0) {
                    points.wildCard();
                } else {
                    points.shotSelection();
                }

            }

            if (points.getTotalPoints() == 21) {
                System.out.println("\nYou Won!! Good job!!!");
                System.out.println("\uD83D\uDE00");
            } else {
                System.out.println("\nGAME OVER!! You Lost!!");
                System.out.println("\uD83D\uDE35");
            }

            newGame = points.newGame();
        }

        System.out.println("Goodbye!");
    }
}
