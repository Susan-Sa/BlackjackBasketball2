package com.blackjackbasketball;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Shot options for the user to pick from.
        Scanner shotInput = new Scanner(System.in);

        String option1 = "layup - 1 point type Z" +
                "\nJumpshot - 2 points type X" +
                "\n3 Pointer - 3 points type C" +
                "\nHalfcourt Shot - 5 points type V";
        System.out.println(option1);

        char shotSelection = shotInput.nextLine().charAt(0);
        System.out.println(shotSelection);

        // switch statement to spit out points scored
        int result = 10 * 10;
        switch (result) {

            case 12:
                System.out.println("in case 12");
                break;

            case 13:
                System.out.println("in case 13");
                break;

            case 100:
                System.out.println("in case 100");
                break;

            default:
                System.out.println("didnt recignize");
                break;
        }
        System.out.println("SCORE! + ");





    }
}
