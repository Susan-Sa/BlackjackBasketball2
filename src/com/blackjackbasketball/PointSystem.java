package com.blackjackbasketball;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class PointSystem {

    private int totalPoints;
    private int roundNumber;
    private String wildCardStatement;
    Random r = new Random();


    public int getTotalPoints() {
        return totalPoints;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int addPoints(int value) {
        totalPoints += value;

        return totalPoints;
    }

    public int wildCard() {

        int points = r.nextInt(totalPoints + 1);

        //randomize - or + points
        char[] list = {'-', '+'};
        char randomOperand = list[r.nextInt(list.length)];

        //System.out.println(randomOperand);
        //System.out.println(list.length);


        switch (randomOperand) {

            case '-':
                System.out.println("Muahahaha -" + points);
                totalPoints = totalPoints - points;
                break;

            case '+':
                System.out.println("Muahahaha +" + points);
                totalPoints = totalPoints + points;
                break;
        }

        System.out.println("You are now at " + totalPoints + " points.");
        return totalPoints;
    }

    public String newRound() {

        //Print Game intro
        //Choices here
        //Person makes choice
        //Choice points identified
        //generate new points
        //return points total and list round number
        //generate wildcard at every 4 rounds
        //return wildcard results
        //reprint options to play game


        return "What's your next choice?";
    }
}
