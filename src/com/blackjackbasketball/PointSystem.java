package com.blackjackbasketball;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;
import java.util.Scanner;

public class PointSystem {

    private int totalPoints;
    private int roundNumber;
    private String wildCardStatement;
    private String name;
    Random r = new Random();

    public PointSystem(){
        totalPoints = 0;
        roundNumber = 1;
    }


    public int getTotalPoints() {
        return totalPoints;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public int addPoints(int value) {
        totalPoints += value;

        return totalPoints;
    }

    public void shotSelection(){

        String response;

        Scanner shotInput = new Scanner(System.in);

        String option1 = "layup - 1 point type Z" +
                "\nJumpshot - 2 points type X" +
                "\n3 Pointer - 3 points type C" +
                "\nHalfcourt Shot - 5 points type V";
        System.out.println(option1);

        char shotSelection = shotInput.nextLine().charAt(0);

        switch (shotSelection) {

            case 'Z':
                addPoints(1);
                break;

            case 'X':
                addPoints(2);
                break;

            case 'C':
                addPoints(3);
                break;

            case 'V':
                addPoints(5);
                break;
        }

        System.out.println("You are at " + totalPoints + " points " + name + "!");


        roundNumber ++;
    }

    public int wildCard() {

        int points = r.nextInt(totalPoints + 1);

        //randomize - or + points
        char[] list = {'-', '+'};
        char randomOperand = list[r.nextInt(list.length)];

        System.out.println("\n\n~~~~~~~~WILD CARD!!!~~~~~~~~~~~");
        System.out.println("\uD83C\uDCCF" + "\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF\uD83C\uDCCF");

        switch (randomOperand) {

            case '-':
                System.out.println("MUAHAHAHAHA -" + points);
                totalPoints = totalPoints - points;
                break;

            case '+':
                System.out.println("MUAHAHAHA +" + points);
                totalPoints = totalPoints + points;
                break;
        }

        roundNumber ++;

        System.out.println("You are now at " + totalPoints + " points.");
        System.out.println("GOOD LUCK!!\n");
        return totalPoints;
    }

    public void gameIntro(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to BlackJack Basketball!!");
        System.out.println("\u26F9" + "\uD83C\uDFC0" + "\u26F9\uD83C\uDFC0\u26F9\uD83C\uDFC0\u26F9\uD83C\uDFC0\u26F9\uD83C\uDFC0\u26F9\uD83C\uDFC0\u26F9\uD83C\uDFC0\u26F9");
        //System.out.println("\uD83C\uDFC0");
        System.out.println("What is your name?");
        name = input.nextLine();
        System.out.println("Thank you for playing " + name +
                "\n\n~~~~~~~Blackjack Basketball Rules!!~~~~~~~~~" +
                "\nYour goal is to get your points to exactly 21." +
                "\nIf your points fall below 0, or above 21, you LOSE!!" +
                "\nBy the way, every 4th round a Wild Card is generated and points are randomly added or subtracted from your total points" +
                "\nIf the Wild Card puts you above 21 or below 0, you lose. At 21? You win!!"+
                "\nGood luck!!\n\n");

        totalPoints = 0;
    }

    public boolean newGame(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n" + name + ", do you wanna play again? Y/N");
        char newGame = input.next().charAt(0);
        if(newGame == 'Y' || newGame == 'y'){
            return true;
        }else{
            return false;
        }
    }
}

        //SMILEY
        //System.out.println("\uD83D\uDE00");
        // BASKETBALL GUY 1ST THEN BALL
        //System.out.println("\u26F9");
        //System.out.println("\uD83C\uDFC0");
        // WILD CARD
       // System.out.println("\uD83C\uDCCF");
        // LOST & SAD
       // System.out.println("\uD83D\uDE35");